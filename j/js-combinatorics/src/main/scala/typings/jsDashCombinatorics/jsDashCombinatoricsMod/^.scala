package typings.jsDashCombinatorics.jsDashCombinatoricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: String = js.native
  /**
  	 * Calculates m C n
  	 */
  def C(m: Double, n: Double): Double = js.native
  /**
  	 * Calculates m P n
  	 */
  def P(m: Double, n: Double): Double = js.native
  /**
  	 * Generates `n`-digit "numbers" where each digit is an element in array.
  	 * Note this "number" is in the least significant order.
  	 * `n` defaults to the length of `a`.
  	 */
  def baseN[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = js.native
  def baseN[T](a: js.Array[T], n: Double): IPredictableGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the combination of `a` with `n` elements, which
  	 * also supports larger sets of elements.
  	 * When `n` is ommited, the length of the array is used.
  	 * Somewhat slower than `combination()`
  	 */
  def bigCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def bigCombination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  def cartesianProduct(a: js.Array[_]*): ICartesianProductGenerator[js.Array[_]] = js.native
  /**
  	 * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
  	 */
  def cartesianProduct[T1](a1: js.Array[T1]): ICartesianProductGenerator[js.Array[T1]] = js.native
  def cartesianProduct[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): ICartesianProductGenerator[js.Tuple2[T1, T2]] = js.native
  def cartesianProduct[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = js.native
  def cartesianProduct[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6]
  ): ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7]
  ): ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8]
  ): ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
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
  ): ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
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
  ): ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
  	 * Generates the combination of `a` with `n` elements.
  	 * `n` defaults to the length of `a`.
  	 */
  def combination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def combination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  /**
  	 * Returns the factoradic representation of `n` in an array, in
    * least significant order.
  	 * See http://en.wikipedia.org/wiki/Factorial_number_system
  	 */
  def factoradic(n: Double): js.Array[Double] = js.native
  /**
  	 * Calculates n!
  	 */
  def factorial(n: Double): Double = js.native
  /**
  	 * Generates the permutation of `a` with `n` elements.
  	 * `n` defaults to the length of `a`.
  	 */
  def permutation[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def permutation[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the permutation of the combination of `a`.
  	 * Equivalent to `permutation(combination(a))`, but more efficient.
  	 */
  def permutationCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  /**
  	 * Generates the power set of `a`.
  	 */
  def power[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = js.native
}

