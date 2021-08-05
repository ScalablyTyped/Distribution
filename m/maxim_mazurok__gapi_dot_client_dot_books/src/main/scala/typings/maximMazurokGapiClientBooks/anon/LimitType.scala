package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitType extends StObject {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  
  var limitType: js.UndefOr[String] = js.undefined
  
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[String] = js.undefined
}
object LimitType {
  
  inline def apply(): LimitType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitType]
  }
  
  extension [Self <: LimitType](x: Self) {
    
    inline def setAllowedCharacterCount(value: Double): Self = StObject.set(x, "allowedCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setAllowedCharacterCountUndefined: Self = StObject.set(x, "allowedCharacterCount", js.undefined)
    
    inline def setLimitType(value: String): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    inline def setRemainingCharacterCount(value: Double): Self = StObject.set(x, "remainingCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCharacterCountUndefined: Self = StObject.set(x, "remainingCharacterCount", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
