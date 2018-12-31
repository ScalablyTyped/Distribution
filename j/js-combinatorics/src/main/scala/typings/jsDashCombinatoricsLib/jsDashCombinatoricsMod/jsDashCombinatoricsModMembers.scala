package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", JSImport.Namespace)
@js.native
object jsDashCombinatoricsModMembers extends js.Object {
  val VERSION: java.lang.String = js.native
  /**
  	 * Calculates m C n
  	 */
  def C(m: scala.Double, n: scala.Double): scala.Double = js.native
  /**
  	 * Calculates m P n
  	 */
  def P(m: scala.Double, n: scala.Double): scala.Double = js.native
  /**
  	 * Generates n-digit "numbers" where each digit is an element in array.
  	 * Note this "number" is in the least significant order.
  	 * When n is ommited, the length of the array is used.
  	 */
  def baseN[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IPredictableGenerator[js.Array[T]] = js.native
  def baseN[T](a: js.Array[T], n: scala.Double): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IPredictableGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the combination of array with n elements, which
  	 * also supports larger sets of elements.
  	 * When n is ommited, the length of the array is used.
  	 * Somewhat slower than combination()
  	 */
  def bigCombination[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  def bigCombination[T](a: js.Array[T], n: scala.Double): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  def cartesianProduct(a: js.Array[_]*): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Array[_]] = js.native
  /**
  	 * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
  	 */
  def cartesianProduct[T1](a1: js.Array[T1]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Array[T1]] = js.native
  def cartesianProduct[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple2[T1, T2]] = js.native
  def cartesianProduct[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = js.native
  def cartesianProduct[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6]
  ): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7]
  ): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8]
  ): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9]
  ): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9],
    a10: js.Array[T10]
  ): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
  	 * Generates the combination of array with n elements.
  	 * When n is ommited, the length of the array is used.
  	 */
  def combination[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  def combination[T](a: js.Array[T], n: scala.Double): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  /**
  	 * Returns the factoradic representation of n in array, in least significant order.
  	 * See http://en.wikipedia.org/wiki/Factorial_number_system
  	 */
  def factoradic(n: scala.Double): js.Array[scala.Double] = js.native
  /**
  	 * Calculates n!
  	 */
  def factorial(n: scala.Double): scala.Double = js.native
  /**
  	 * Generates the permutation of array with n elements.
  	 * When n is ommited, the length of the array is used.
  	 */
  def permutation[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  def permutation[T](a: js.Array[T], n: scala.Double): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the permutation of the combination of n.
  	 * Equivalent to permutation(combination(a)), but more efficient.
  	 */
  def permutationCombination[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the power set of array.
  	 */
  def power[T](a: js.Array[T]): jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs.IPredictableGenerator[js.Array[T]] = js.native
}

