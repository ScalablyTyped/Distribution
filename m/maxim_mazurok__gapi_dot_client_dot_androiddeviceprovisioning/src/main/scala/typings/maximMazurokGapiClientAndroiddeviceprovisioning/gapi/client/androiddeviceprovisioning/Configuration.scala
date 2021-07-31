package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /** Required. The name of the organization. Zero-touch enrollment shows this organization name to device users during device provisioning. */
  var companyName: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID of the configuration. Assigned by the server. */
  var configurationId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A short name that describes the configuration's purpose. For example, _Sales team_ or _Temporary employees_. The zero-touch enrollment portal displays this name to IT
    * admins.
    */
  var configurationName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The email address that device users can contact to get help. Zero-touch enrollment shows this email address to device users before device provisioning. The value is
    * validated on input.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The telephone number that device users can call, using another device, to get help. Zero-touch enrollment shows this number to device users before device provisioning.
    * Accepts numerals, spaces, the plus sign, hyphens, and parentheses.
    */
  var contactPhone: js.UndefOr[String] = js.undefined
  
  /**
    * A message, containing one or two sentences, to help device users get help or give them more details about what’s happening to their device. Zero-touch enrollment shows this message
    * before the device is provisioned.
    */
  var customMessage: js.UndefOr[String] = js.undefined
  
  /** The JSON-formatted EMM provisioning extras that are passed to the DPC. */
  var dpcExtras: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name of the selected DPC (device policy controller) in the format `customers/[CUSTOMER_ID]/dpcs/ *`. To list the supported DPCs, call `customers.dpcs.list`. */
  var dpcResourcePath: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Whether this is the default configuration that zero-touch enrollment applies to any new devices the organization purchases in the future. Only one customer configuration
    * can be the default. Setting this value to `true`, changes the previous default configuration's `isDefault` value to `false`.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by the server. */
  var name: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    @scala.inline
    def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    @scala.inline
    def setContactPhone(value: String): Self = StObject.set(x, "contactPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPhoneUndefined: Self = StObject.set(x, "contactPhone", js.undefined)
    
    @scala.inline
    def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    @scala.inline
    def setDpcExtras(value: String): Self = StObject.set(x, "dpcExtras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpcExtrasUndefined: Self = StObject.set(x, "dpcExtras", js.undefined)
    
    @scala.inline
    def setDpcResourcePath(value: String): Self = StObject.set(x, "dpcResourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpcResourcePathUndefined: Self = StObject.set(x, "dpcResourcePath", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
