/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtuml.bp.xtext.oal.xoal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.oal.xoal.conjunction#getA1 <em>A1</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.oal.xoal.conjunction#getA2 <em>A2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtuml.bp.xtext.oal.xoal.XoalPackage#getconjunction()
 * @model
 * @generated
 */
public interface conjunction extends EObject
{
  /**
   * Returns the value of the '<em><b>A1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A1</em>' containment reference.
   * @see #setA1(relational_expr)
   * @see org.xtuml.bp.xtext.oal.xoal.XoalPackage#getconjunction_A1()
   * @model containment="true"
   * @generated
   */
  relational_expr getA1();

  /**
   * Sets the value of the '{@link org.xtuml.bp.xtext.oal.xoal.conjunction#getA1 <em>A1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A1</em>' containment reference.
   * @see #getA1()
   * @generated
   */
  void setA1(relational_expr value);

  /**
   * Returns the value of the '<em><b>A2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtuml.bp.xtext.oal.xoal.relational_expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A2</em>' containment reference list.
   * @see org.xtuml.bp.xtext.oal.xoal.XoalPackage#getconjunction_A2()
   * @model containment="true"
   * @generated
   */
  EList<relational_expr> getA2();

} // conjunction
