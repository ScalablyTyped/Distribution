package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrngXorshift32Mod {
  
  @JSImport("lib0/dist/prng/Xorshift32", "Xorshift32")
  @js.native
  open class Xorshift32 protected () extends StObject {
    /**
      * @param {number} seed Unsigned 32 bit number
      */
    def this(seed: Double) = this()
    
    /**
      * @type {number}
      */
    var _state: Double = js.native
    
    /**
      * Generate a random signed integer.
      *
      * @return {Number} A 32 bit signed integer.
      */
    def next(): Double = js.native
    
    var seed: Double = js.native
  }
}
