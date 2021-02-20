package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod {
  
  @JSImport("@lumino/algorithm/types/empty", "EmptyIterator")
  @js.native
  /**
    * Construct a new empty iterator.
    */
  class EmptyIterator[T] () extends IIterator[T]
  
  @JSImport("@lumino/algorithm/types/empty", "empty")
  @js.native
  def empty[T](): IIterator[T] = js.native
}
