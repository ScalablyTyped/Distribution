package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-combinatorics", "permutationCombination")
@js.native
object permutationCombination extends js.Object {
  /**
    * Generates the permutation of the combination of `a`.
    * Equivalent to `permutation(combination(a))`, but more efficient.
    */
  def apply[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
}

