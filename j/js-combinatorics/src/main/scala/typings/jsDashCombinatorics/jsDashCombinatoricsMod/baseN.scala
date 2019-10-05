package typings.jsDashCombinatorics.jsDashCombinatoricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", "baseN")
@js.native
object baseN extends js.Object {
  /**
  	 * Generates `n`-digit "numbers" where each digit is an element in array.
  	 * Note this "number" is in the least significant order.
  	 * `n` defaults to the length of `a`.
  	 */
  def apply[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = js.native
  def apply[T](a: js.Array[T], n: Double): IPredictableGenerator[js.Array[T]] = js.native
}

