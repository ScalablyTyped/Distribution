package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  
  def chain[T](objects: IterableOrArrayLike[T]*): IIterator[T] = js.native
  
  @js.native
  class ChainIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new chain iterator.
      *
      * @param source - The iterator of iterators of interest.
      */
    def this(source: IIterator[IIterator[T]]) = this()
    
    var _active: js.Any = js.native
    
    var _cloned: js.Any = js.native
    
    var _source: js.Any = js.native
  }
}
