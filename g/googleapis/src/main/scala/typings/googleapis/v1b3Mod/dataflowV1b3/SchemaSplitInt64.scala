package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSplitInt64 extends StObject {
  
  /**
    * The high order bits, including the sign: n \>\> 32.
    */
  var highBits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The low order bits: n & 0xffffffff.
    */
  var lowBits: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSplitInt64 {
  
  inline def apply(): SchemaSplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplitInt64]
  }
  
  extension [Self <: SchemaSplitInt64](x: Self) {
    
    inline def setHighBits(value: Double): Self = StObject.set(x, "highBits", value.asInstanceOf[js.Any])
    
    inline def setHighBitsNull: Self = StObject.set(x, "highBits", null)
    
    inline def setHighBitsUndefined: Self = StObject.set(x, "highBits", js.undefined)
    
    inline def setLowBits(value: Double): Self = StObject.set(x, "lowBits", value.asInstanceOf[js.Any])
    
    inline def setLowBitsNull: Self = StObject.set(x, "lowBits", null)
    
    inline def setLowBitsUndefined: Self = StObject.set(x, "lowBits", js.undefined)
  }
}
