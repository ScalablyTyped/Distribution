package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", "combination")
@js.native
object combination extends js.Object {
  /**
  	 * Generates the combination of `a` with `n` elements.
  	 * `n` defaults to the length of `a`.
  	 */
  def apply[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def apply[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
}

