package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompleteVerificationRequest extends StObject {
  
  /**
    * Required. PIN code received by the merchant to complete the verification.
    */
  var pin: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompleteVerificationRequest {
  
  inline def apply(): SchemaCompleteVerificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteVerificationRequest]
  }
  
  extension [Self <: SchemaCompleteVerificationRequest](x: Self) {
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinNull: Self = StObject.set(x, "pin", null)
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
  }
}
