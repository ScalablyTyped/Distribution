package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Company extends StObject {
  
  /** Optional. Email address of customer's users in the admin role. Each email address must be associated with a Google Account. */
  var adminEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The ID of the company. Assigned by the server. */
  var companyId: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the company. For example _XYZ Corp_. Displayed to the company's employees in the zero-touch enrollment portal. */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. The preferred locale of the customer represented as a BCP47 language code. This field is validated on input and requests containing unsupported language codes will be
    * rejected. Supported language codes: Arabic (ar) Chinese (Hong Kong) (zh-HK) Chinese (Simplified) (zh-CN) Chinese (Traditional) (zh-TW) Czech (cs) Danish (da) Dutch (nl) English (UK)
    * (en-GB) English (US) (en-US) Filipino (fil) Finnish (fi) French (fr) German (de) Hebrew (iw) Hindi (hi) Hungarian (hu) Indonesian (id) Italian (it) Japanese (ja) Korean (ko)
    * Norwegian (Bokmal) (no) Polish (pl) Portuguese (Brazil) (pt-BR) Portuguese (Portugal) (pt-PT) Russian (ru) Spanish (es) Spanish (Latin America) (es-419) Swedish (sv) Thai (th)
    * Turkish (tr) Ukrainian (uk) Vietnamese (vi)
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The API resource name of the company. The resource name is one of the following formats: * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]` * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]` Assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Input only. Email address of customer's users in the owner role. At least one `owner_email` is required. Owners share the same access as admins but can also add, delete,
    * and edit your organization's portal users.
    */
  var ownerEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Input only. If set to true, welcome email will not be sent to the customer. It is recommended to skip the welcome email if devices will be claimed with additional DEVICE_PROTECTION
    * service, as the customer will receive separate emails at device claim time. This field is ignored if this is not a Zero-touch customer.
    */
  var skipWelcomeEmail: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Whether any user from the company has accepted the latest Terms of Service (ToS). See TermsStatus. */
  var termsStatus: js.UndefOr[String] = js.undefined
}
object Company {
  
  inline def apply(): Company = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Company]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
    
    inline def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "adminEmails", value.asInstanceOf[js.Any])
    
    inline def setAdminEmailsUndefined: Self = StObject.set(x, "adminEmails", js.undefined)
    
    inline def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "adminEmails", js.Array(value*))
    
    inline def setCompanyId(value: String): Self = StObject.set(x, "companyId", value.asInstanceOf[js.Any])
    
    inline def setCompanyIdUndefined: Self = StObject.set(x, "companyId", js.undefined)
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerEmails(value: js.Array[String]): Self = StObject.set(x, "ownerEmails", value.asInstanceOf[js.Any])
    
    inline def setOwnerEmailsUndefined: Self = StObject.set(x, "ownerEmails", js.undefined)
    
    inline def setOwnerEmailsVarargs(value: String*): Self = StObject.set(x, "ownerEmails", js.Array(value*))
    
    inline def setSkipWelcomeEmail(value: Boolean): Self = StObject.set(x, "skipWelcomeEmail", value.asInstanceOf[js.Any])
    
    inline def setSkipWelcomeEmailUndefined: Self = StObject.set(x, "skipWelcomeEmail", js.undefined)
    
    inline def setTermsStatus(value: String): Self = StObject.set(x, "termsStatus", value.asInstanceOf[js.Any])
    
    inline def setTermsStatusUndefined: Self = StObject.set(x, "termsStatus", js.undefined)
  }
}
