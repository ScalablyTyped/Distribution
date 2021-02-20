package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about the merchant.
  */
@js.native
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
  var merchantId: String = js.native
  
  /**
    * A user visible merchant name.
    *
    * This name may be shown to the user in Google Pay to describe who the
    * user made a transaction with.
    *
    * This field is optional. If not set, the Business name in your Google
    * Pay Developer Profile will be used.
    */
  var merchantName: js.UndefOr[String] = js.native
  
  /**
    * The info of the software used by merchants to integrate with GPay.
    *
    * This field is optional and its values may be set by software
    * providers to identify the software the merchant is using.
    */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.native
}
object MerchantInfo {
  
  @scala.inline
  def apply(merchantId: String): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
  
  @scala.inline
  implicit class MerchantInfoMutableBuilder[Self <: MerchantInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
    
    @scala.inline
    def setSoftwareInfo(value: SoftwareInfo): Self = StObject.set(x, "softwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareInfoUndefined: Self = StObject.set(x, "softwareInfo", js.undefined)
  }
}
