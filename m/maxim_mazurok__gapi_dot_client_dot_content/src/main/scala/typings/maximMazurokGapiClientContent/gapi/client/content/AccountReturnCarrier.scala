package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountReturnCarrier extends StObject {
  
  /** Output only. Immutable. The Google-provided unique carrier ID, used to update the resource. */
  var carrierAccountId: js.UndefOr[String] = js.undefined
  
  /** Name of the carrier account. */
  var carrierAccountName: js.UndefOr[String] = js.undefined
  
  /** Number of the carrier account. */
  var carrierAccountNumber: js.UndefOr[String] = js.undefined
  
  /** The carrier code enum. Accepts the values FEDEX or UPS. */
  var carrierCode: js.UndefOr[String] = js.undefined
}
object AccountReturnCarrier {
  
  inline def apply(): AccountReturnCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountReturnCarrier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountReturnCarrier] (val x: Self) extends AnyVal {
    
    inline def setCarrierAccountId(value: String): Self = StObject.set(x, "carrierAccountId", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountIdUndefined: Self = StObject.set(x, "carrierAccountId", js.undefined)
    
    inline def setCarrierAccountName(value: String): Self = StObject.set(x, "carrierAccountName", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountNameUndefined: Self = StObject.set(x, "carrierAccountName", js.undefined)
    
    inline def setCarrierAccountNumber(value: String): Self = StObject.set(x, "carrierAccountNumber", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountNumberUndefined: Self = StObject.set(x, "carrierAccountNumber", js.undefined)
    
    inline def setCarrierCode(value: String): Self = StObject.set(x, "carrierCode", value.asInstanceOf[js.Any])
    
    inline def setCarrierCodeUndefined: Self = StObject.set(x, "carrierCode", js.undefined)
  }
}
