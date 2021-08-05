package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantRejectionReason extends StObject {
  
  /** Description of the reason. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Code of the rejection reason. */
  var reasonCode: js.UndefOr[String] = js.undefined
}
object MerchantRejectionReason {
  
  inline def apply(): MerchantRejectionReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantRejectionReason]
  }
  
  extension [Self <: MerchantRejectionReason](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
