package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  @js.native
  /**
    * Construct a new empty iterator.
    */
  class EmptyIterator[T] () extends IIterator[T]
  
  def empty[T](): IIterator[T] = js.native
}

