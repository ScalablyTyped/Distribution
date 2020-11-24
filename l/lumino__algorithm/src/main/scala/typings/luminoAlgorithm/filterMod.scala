package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  
  def filter[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IIterator[T] = js.native
  
  @js.native
  class FilterIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new filter iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The predicate function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]) = this()
    
    var _fn: js.Any = js.native
    
    var _index: js.Any = js.native
    
    var _source: js.Any = js.native
  }
}
