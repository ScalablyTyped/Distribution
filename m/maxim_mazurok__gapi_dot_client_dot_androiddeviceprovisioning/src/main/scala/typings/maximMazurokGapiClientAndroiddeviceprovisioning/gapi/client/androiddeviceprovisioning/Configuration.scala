package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  /** Required. The name of the organization. Zero-touch enrollment shows this organization name to device users during device provisioning. */
  var companyName: js.UndefOr[String] = js.native
  
  /** Output only. The ID of the configuration. Assigned by the server. */
  var configurationId: js.UndefOr[String] = js.native
  
  /**
    * Required. A short name that describes the configuration's purpose. For example, _Sales team_ or _Temporary employees_. The zero-touch enrollment portal displays this name to IT
    * admins.
    */
  var configurationName: js.UndefOr[String] = js.native
  
  /**
    * Required. The email address that device users can contact to get help. Zero-touch enrollment shows this email address to device users before device provisioning. The value is
    * validated on input.
    */
  var contactEmail: js.UndefOr[String] = js.native
  
  /**
    * Required. The telephone number that device users can call, using another device, to get help. Zero-touch enrollment shows this number to device users before device provisioning.
    * Accepts numerals, spaces, the plus sign, hyphens, and parentheses.
    */
  var contactPhone: js.UndefOr[String] = js.native
  
  /**
    * A message, containing one or two sentences, to help device users get help or give them more details about what’s happening to their device. Zero-touch enrollment shows this message
    * before the device is provisioned.
    */
  var customMessage: js.UndefOr[String] = js.native
  
  /** The JSON-formatted EMM provisioning extras that are passed to the DPC. */
  var dpcExtras: js.UndefOr[String] = js.native
  
  /** Required. The resource name of the selected DPC (device policy controller) in the format `customers/[CUSTOMER_ID]/dpcs/ *`. To list the supported DPCs, call `customers.dpcs.list`. */
  var dpcResourcePath: js.UndefOr[String] = js.native
  
  /**
    * Required. Whether this is the default configuration that zero-touch enrollment applies to any new devices the organization purchases in the future. Only one customer configuration
    * can be the default. Setting this value to `true`, changes the previous default configuration's `isDefault` value to `false`.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /** Output only. The API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by the server. */
  var name: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setConfigurationId(value: String): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: String): Self = this.set("configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationName: Self = this.set("configurationName", js.undefined)
    
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    
    @scala.inline
    def setContactPhone(value: String): Self = this.set("contactPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactPhone: Self = this.set("contactPhone", js.undefined)
    
    @scala.inline
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    
    @scala.inline
    def setDpcExtras(value: String): Self = this.set("dpcExtras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpcExtras: Self = this.set("dpcExtras", js.undefined)
    
    @scala.inline
    def setDpcResourcePath(value: String): Self = this.set("dpcResourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpcResourcePath: Self = this.set("dpcResourcePath", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
