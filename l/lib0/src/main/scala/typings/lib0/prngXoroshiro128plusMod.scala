package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prngXoroshiro128plusMod {
  
  @JSImport("lib0/prng/Xoroshiro128plus", "Xoroshiro128plus")
  @js.native
  open class Xoroshiro128plus protected () extends StObject {
    /**
      * @param {number} seed Unsigned 32 bit number
      */
    def this(seed: Double) = this()
    
    var _fresh: Boolean = js.native
    
    /**
      * @return {number} Float/Double in [0,1)
      */
    def next(): Double = js.native
    
    var seed: Double = js.native
    
    var state: js.typedarray.Uint32Array = js.native
  }
}
