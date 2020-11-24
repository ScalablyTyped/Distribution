package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/take", JSImport.Namespace)
@js.native
object takeMod extends js.Object {
  
  def take[T](`object`: IterableOrArrayLike[T], count: Double): IIterator[T] = js.native
  
  @js.native
  class TakeIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new take iterator.
      *
      * @param source - The iterator of interest.
      *
      * @param count - The number of items to take from the source.
      */
    def this(source: IIterator[T], count: Double) = this()
    
    var _count: js.Any = js.native
    
    var _source: js.Any = js.native
  }
}
