package typings.hamtSharding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumableBufferMod {
  
  @JSImport("hamt-sharding/dist/src/consumable-buffer", "ConsumableBuffer")
  @js.native
  open class ConsumableBuffer protected () extends StObject {
    def this(value: js.typedarray.Uint8Array) = this()
    
    var _currentBitPos: Double = js.native
    
    var _currentBytePos: Double = js.native
    
    def _haveBits(): Boolean = js.native
    
    var _value: js.typedarray.Uint8Array = js.native
    
    def availableBits(): Double = js.native
    
    def take(bits: Double): Double = js.native
    
    def totalBits(): Double = js.native
    
    def untake(bits: Double): Unit = js.native
  }
}
