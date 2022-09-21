package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegistration extends StObject {
  
  /**
    * Required. Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
    */
  var contactSettings: js.UndefOr[SchemaContactSettings] = js.undefined
  
  /**
    * Output only. The creation timestamp of the `Registration` resource.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
    */
  var dnsSettings: js.UndefOr[SchemaDnsSettings] = js.undefined
  
  /**
    * Required. Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The expiration timestamp of the `Registration`.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The set of issues with the `Registration` that require attention.
    */
  var issues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of labels associated with the `Registration`.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
    */
  var managementSettings: js.UndefOr[SchemaManagementSettings] = js.undefined
  
  /**
    * Output only. Name of the `Registration` resource, in the format `projects/x/locations/x/registrations/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
    */
  var pendingContactSettings: js.UndefOr[SchemaContactSettings] = js.undefined
  
  /**
    * Output only. The reason the domain registration failed. Only set for domains in REGISTRATION_FAILED state.
    */
  var registerFailureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the `Registration`
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Set of options for the `contact_settings.privacy` field that this `Registration` supports.
    */
  var supportedPrivacy: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The reason the domain transfer failed. Only set for domains in TRANSFER_FAILED state.
    */
  var transferFailureReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegistration {
  
  inline def apply(): SchemaRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegistration]
  }
  
  extension [Self <: SchemaRegistration](x: Self) {
    
    inline def setContactSettings(value: SchemaContactSettings): Self = StObject.set(x, "contactSettings", value.asInstanceOf[js.Any])
    
    inline def setContactSettingsUndefined: Self = StObject.set(x, "contactSettings", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDnsSettings(value: SchemaDnsSettings): Self = StObject.set(x, "dnsSettings", value.asInstanceOf[js.Any])
    
    inline def setDnsSettingsUndefined: Self = StObject.set(x, "dnsSettings", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setIssues(value: js.Array[String]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesNull: Self = StObject.set(x, "issues", null)
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: String*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManagementSettings(value: SchemaManagementSettings): Self = StObject.set(x, "managementSettings", value.asInstanceOf[js.Any])
    
    inline def setManagementSettingsUndefined: Self = StObject.set(x, "managementSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingContactSettings(value: SchemaContactSettings): Self = StObject.set(x, "pendingContactSettings", value.asInstanceOf[js.Any])
    
    inline def setPendingContactSettingsUndefined: Self = StObject.set(x, "pendingContactSettings", js.undefined)
    
    inline def setRegisterFailureReason(value: String): Self = StObject.set(x, "registerFailureReason", value.asInstanceOf[js.Any])
    
    inline def setRegisterFailureReasonNull: Self = StObject.set(x, "registerFailureReason", null)
    
    inline def setRegisterFailureReasonUndefined: Self = StObject.set(x, "registerFailureReason", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    inline def setSupportedPrivacyNull: Self = StObject.set(x, "supportedPrivacy", null)
    
    inline def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    inline def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value*))
    
    inline def setTransferFailureReason(value: String): Self = StObject.set(x, "transferFailureReason", value.asInstanceOf[js.Any])
    
    inline def setTransferFailureReasonNull: Self = StObject.set(x, "transferFailureReason", null)
    
    inline def setTransferFailureReasonUndefined: Self = StObject.set(x, "transferFailureReason", js.undefined)
  }
}
