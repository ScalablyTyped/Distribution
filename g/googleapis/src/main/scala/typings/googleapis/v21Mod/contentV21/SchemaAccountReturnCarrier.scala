package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountReturnCarrier extends StObject {
  
  /**
    * Output only. Immutable. The Google-provided unique carrier ID, used to update the resource.
    */
  var carrierAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the carrier account.
    */
  var carrierAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of the carrier account.
    */
  var carrierAccountNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The carrier code enum. Accepts the values FEDEX or UPS.
    */
  var carrierCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountReturnCarrier {
  
  inline def apply(): SchemaAccountReturnCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountReturnCarrier]
  }
  
  extension [Self <: SchemaAccountReturnCarrier](x: Self) {
    
    inline def setCarrierAccountId(value: String): Self = StObject.set(x, "carrierAccountId", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountIdNull: Self = StObject.set(x, "carrierAccountId", null)
    
    inline def setCarrierAccountIdUndefined: Self = StObject.set(x, "carrierAccountId", js.undefined)
    
    inline def setCarrierAccountName(value: String): Self = StObject.set(x, "carrierAccountName", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountNameNull: Self = StObject.set(x, "carrierAccountName", null)
    
    inline def setCarrierAccountNameUndefined: Self = StObject.set(x, "carrierAccountName", js.undefined)
    
    inline def setCarrierAccountNumber(value: String): Self = StObject.set(x, "carrierAccountNumber", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountNumberNull: Self = StObject.set(x, "carrierAccountNumber", null)
    
    inline def setCarrierAccountNumberUndefined: Self = StObject.set(x, "carrierAccountNumber", js.undefined)
    
    inline def setCarrierCode(value: String): Self = StObject.set(x, "carrierCode", value.asInstanceOf[js.Any])
    
    inline def setCarrierCodeNull: Self = StObject.set(x, "carrierCode", null)
    
    inline def setCarrierCodeUndefined: Self = StObject.set(x, "carrierCode", js.undefined)
  }
}
