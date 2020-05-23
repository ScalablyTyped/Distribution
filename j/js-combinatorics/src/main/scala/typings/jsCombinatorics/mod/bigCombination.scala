package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", "bigCombination")
@js.native
object bigCombination extends js.Object {
  /**
    * Generates the combination of `a` with `n` elements, which
    * also supports larger sets of elements.
    * When `n` is ommited, the length of the array is used.
    * Somewhat slower than `combination()`
    */
  def apply[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def apply[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
}

