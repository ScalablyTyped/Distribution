package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-combinatorics", "permutation")
@js.native
object permutation extends js.Object {
  
  /**
    * Generates the permutation of `a` with `n` elements.
    * `n` defaults to the length of `a`.
    */
  def apply[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  def apply[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
}
