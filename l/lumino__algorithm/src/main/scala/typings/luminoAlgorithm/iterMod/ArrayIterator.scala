package typings.luminoAlgorithm.iterMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/iter", "ArrayIterator")
@js.native
class ArrayIterator[T] protected () extends IIterator[T] {
  /**
    * Construct a new array iterator.
    *
    * @param source - The array-like object of interest.
    */
  def this(source: ArrayLike[T]) = this()
  
  var _index: js.Any = js.native
  
  var _source: js.Any = js.native
}
