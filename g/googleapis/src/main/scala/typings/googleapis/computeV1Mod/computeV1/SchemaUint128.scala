package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUint128 extends StObject {
  
  var high: js.UndefOr[String | Null] = js.undefined
  
  var low: js.UndefOr[String | Null] = js.undefined
}
object SchemaUint128 {
  
  inline def apply(): SchemaUint128 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUint128]
  }
  
  extension [Self <: SchemaUint128](x: Self) {
    
    inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighNull: Self = StObject.set(x, "high", null)
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowNull: Self = StObject.set(x, "low", null)
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
  }
}
