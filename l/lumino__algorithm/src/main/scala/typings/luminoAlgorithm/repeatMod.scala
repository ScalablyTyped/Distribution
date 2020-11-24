package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/repeat", JSImport.Namespace)
@js.native
object repeatMod extends js.Object {
  
  def once[T](value: T): IIterator[T] = js.native
  
  def repeat[T](value: T, count: Double): IIterator[T] = js.native
  
  @js.native
  class RepeatIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new repeat iterator.
      *
      * @param value - The value to repeat.
      *
      * @param count - The number of times to repeat the value.
      */
    def this(value: T, count: Double) = this()
    
    var _count: js.Any = js.native
    
    var _value: js.Any = js.native
  }
}
