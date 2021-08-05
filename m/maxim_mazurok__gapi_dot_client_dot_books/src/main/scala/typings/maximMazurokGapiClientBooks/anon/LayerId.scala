package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerId extends StObject {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  
  var layerId: js.UndefOr[String] = js.undefined
  
  var limitType: js.UndefOr[String] = js.undefined
  
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[String] = js.undefined
}
object LayerId {
  
  inline def apply(): LayerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerId]
  }
  
  extension [Self <: LayerId](x: Self) {
    
    inline def setAllowedCharacterCount(value: Double): Self = StObject.set(x, "allowedCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setAllowedCharacterCountUndefined: Self = StObject.set(x, "allowedCharacterCount", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLimitType(value: String): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    inline def setRemainingCharacterCount(value: Double): Self = StObject.set(x, "remainingCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCharacterCountUndefined: Self = StObject.set(x, "remainingCharacterCount", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
