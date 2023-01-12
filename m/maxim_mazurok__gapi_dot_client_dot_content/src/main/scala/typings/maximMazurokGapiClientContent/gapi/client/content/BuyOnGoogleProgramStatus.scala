package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyOnGoogleProgramStatus extends StObject {
  
  /** The business models in which merchant participates. */
  var businessModel: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The customer service pending email. After verification this field becomes empty. */
  var customerServicePendingEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The pending phone number specified for BuyOnGoogle program. It might be different than account level phone number. In order to update this field the
    * customer_service_pending_phone_region_code must also be set. After verification this field becomes empty.
    */
  var customerServicePendingPhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Two letter country code for the pending phone number, for example `CA` for Canadian numbers. See the [ISO 3166-1
    * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) officially assigned codes. In order to update this field the
    * customer_service_pending_phone_number must also be set. After verification this field becomes empty.
    */
  var customerServicePendingPhoneRegionCode: js.UndefOr[String] = js.undefined
  
  /** Output only. The customer service verified email. */
  var customerServiceVerifiedEmail: js.UndefOr[String] = js.undefined
  
  /** Output only. The verified phone number specified for BuyOnGoogle program. It might be different than account level phone number. */
  var customerServiceVerifiedPhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Two letter country code for the verified phone number, for example `CA` for Canadian numbers. See the [ISO 3166-1
    * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) officially assigned codes.
    */
  var customerServiceVerifiedPhoneRegionCode: js.UndefOr[String] = js.undefined
  
  /** The channels through which the merchant is selling. */
  var onlineSalesChannel: js.UndefOr[String] = js.undefined
  
  /** Output only. The current participation stage for the program. */
  var participationStage: js.UndefOr[String] = js.undefined
}
object BuyOnGoogleProgramStatus {
  
  inline def apply(): BuyOnGoogleProgramStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyOnGoogleProgramStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuyOnGoogleProgramStatus] (val x: Self) extends AnyVal {
    
    inline def setBusinessModel(value: js.Array[String]): Self = StObject.set(x, "businessModel", value.asInstanceOf[js.Any])
    
    inline def setBusinessModelUndefined: Self = StObject.set(x, "businessModel", js.undefined)
    
    inline def setBusinessModelVarargs(value: String*): Self = StObject.set(x, "businessModel", js.Array(value*))
    
    inline def setCustomerServicePendingEmail(value: String): Self = StObject.set(x, "customerServicePendingEmail", value.asInstanceOf[js.Any])
    
    inline def setCustomerServicePendingEmailUndefined: Self = StObject.set(x, "customerServicePendingEmail", js.undefined)
    
    inline def setCustomerServicePendingPhoneNumber(value: String): Self = StObject.set(x, "customerServicePendingPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCustomerServicePendingPhoneNumberUndefined: Self = StObject.set(x, "customerServicePendingPhoneNumber", js.undefined)
    
    inline def setCustomerServicePendingPhoneRegionCode(value: String): Self = StObject.set(x, "customerServicePendingPhoneRegionCode", value.asInstanceOf[js.Any])
    
    inline def setCustomerServicePendingPhoneRegionCodeUndefined: Self = StObject.set(x, "customerServicePendingPhoneRegionCode", js.undefined)
    
    inline def setCustomerServiceVerifiedEmail(value: String): Self = StObject.set(x, "customerServiceVerifiedEmail", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceVerifiedEmailUndefined: Self = StObject.set(x, "customerServiceVerifiedEmail", js.undefined)
    
    inline def setCustomerServiceVerifiedPhoneNumber(value: String): Self = StObject.set(x, "customerServiceVerifiedPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceVerifiedPhoneNumberUndefined: Self = StObject.set(x, "customerServiceVerifiedPhoneNumber", js.undefined)
    
    inline def setCustomerServiceVerifiedPhoneRegionCode(value: String): Self = StObject.set(x, "customerServiceVerifiedPhoneRegionCode", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceVerifiedPhoneRegionCodeUndefined: Self = StObject.set(x, "customerServiceVerifiedPhoneRegionCode", js.undefined)
    
    inline def setOnlineSalesChannel(value: String): Self = StObject.set(x, "onlineSalesChannel", value.asInstanceOf[js.Any])
    
    inline def setOnlineSalesChannelUndefined: Self = StObject.set(x, "onlineSalesChannel", js.undefined)
    
    inline def setParticipationStage(value: String): Self = StObject.set(x, "participationStage", value.asInstanceOf[js.Any])
    
    inline def setParticipationStageUndefined: Self = StObject.set(x, "participationStage", js.undefined)
  }
}
