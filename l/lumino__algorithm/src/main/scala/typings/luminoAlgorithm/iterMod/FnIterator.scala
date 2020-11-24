package typings.luminoAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/iter", "FnIterator")
@js.native
class FnIterator[T] protected () extends IIterator[T] {
  /**
    * Construct a new function iterator.
    *
    * @param fn - The iterator-like function of interest.
    */
  def this(fn: js.Function0[js.UndefOr[T]]) = this()
  
  var _fn: js.Any = js.native
}
