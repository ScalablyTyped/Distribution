package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrngMt19937Mod {
  
  @JSImport("lib0/dist/prng/Mt19937", "Mt19937")
  @js.native
  open class Mt19937 protected () extends StObject {
    /**
      * @param {number} seed Unsigned 32 bit number
      */
    def this(seed: Double) = this()
    
    var _i: Double = js.native
    
    var _state: js.typedarray.Uint32Array = js.native
    
    /**
      * Generate a random signed integer.
      *
      * @return {Number} A 32 bit signed integer.
      */
    def next(): Double = js.native
    
    var seed: Double = js.native
  }
}
