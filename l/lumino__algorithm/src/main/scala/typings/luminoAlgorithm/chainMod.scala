package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainMod {
  
  @JSImport("@lumino/algorithm/types/chain", "ChainIterator")
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
  
  @JSImport("@lumino/algorithm/types/chain", "chain")
  @js.native
  def chain[T](objects: IterableOrArrayLike[T]*): IIterator[T] = js.native
}
