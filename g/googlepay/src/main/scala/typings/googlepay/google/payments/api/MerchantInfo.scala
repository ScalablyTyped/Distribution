package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about the merchant.
  */
trait MerchantInfo extends StObject {
  
  /**
    * The ID of the merchant account with Google Pay.
    *
    * You can find this ID on {@link
    * https://payments.developers.google.com} once you have registered for
    * the Google Pay API.
    *
    * This field should only be set when you integrate on web on the
    * production environment.
    */
  var merchantId: String
  
  /**
    * A user visible merchant name.
    *
    * This name may be shown to the user in Google Pay to describe who the
    * user made a transaction with.
    *
    * This field is optional. If not set, the Business name in your Google
    * Pay Developer Profile will be used.
    */
  var merchantName: js.UndefOr[String] = js.undefined
  
  /**
    * The info of the software used by merchants to integrate with GPay.
    *
    * This field is optional and its values may be set by software
    * providers to identify the software the merchant is using.
    */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.undefined
}
object MerchantInfo {
  
  inline def apply(merchantId: String): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
  
  extension [Self <: MerchantInfo](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    inline def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
    
    inline def setSoftwareInfo(value: SoftwareInfo): Self = StObject.set(x, "softwareInfo", value.asInstanceOf[js.Any])
    
    inline def setSoftwareInfoUndefined: Self = StObject.set(x, "softwareInfo", js.undefined)
  }
}
