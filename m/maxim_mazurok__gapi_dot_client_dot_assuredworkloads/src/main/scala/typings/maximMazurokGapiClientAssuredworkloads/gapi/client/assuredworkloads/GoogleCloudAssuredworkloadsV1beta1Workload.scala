package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1beta1Workload extends StObject {
  
  /**
    * Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of
    * Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form
    * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.undefined
  
  /** Input only. Immutable. Settings specific to resources needed for CJIS. */
  var cjisSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings] = js.undefined
  
  /** Required. Immutable. Compliance Regime associated with this workload. */
  var complianceRegime: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The Workload creation timestamp. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers,
    * hyphen, and spaces. Example: My Workload
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers. */
  var enableSovereignControls: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Input only. Immutable. Settings specific to resources needed for FedRAMP High. */
  var fedrampHighSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings] = js.undefined
  
  /** Input only. Immutable. Settings specific to resources needed for FedRAMP Moderate. */
  var fedrampModerateSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings] = js.undefined
  
  /** Input only. Immutable. Settings specific to resources needed for IL4. */
  var il4Settings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings] = js.undefined
  
  /** Output only. Represents the KAJ enrollment state of the given workload. */
  var kajEnrollmentState: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a
    * Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
    */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] = js.undefined
  
  /** Optional. Labels applied to the workload. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not
    * specified all resources are created under the parent organization. Format: folders/{folder_id}
    */
  var provisionedResourcesParent: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible.
    * This field is optional.
    */
  var resourceSettings: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings]] = js.undefined
  
  /**
    * Output only. The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation
    * will fail. Always read only.
    */
  var resources: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo]] = js.undefined
  
  /**
    * Output only. Represents the SAA enrollment response of the given workload. SAA enrollment response is queried during GetWorkload call. In failure cases, user friendly error message
    * is shown in SAA details page.
    */
  var saaEnrollmentResponse: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse] = js.undefined
}
object GoogleCloudAssuredworkloadsV1beta1Workload {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1beta1Workload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1Workload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssuredworkloadsV1beta1Workload] (val x: Self) extends AnyVal {
    
    inline def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
    
    inline def setCjisSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings): Self = StObject.set(x, "cjisSettings", value.asInstanceOf[js.Any])
    
    inline def setCjisSettingsUndefined: Self = StObject.set(x, "cjisSettings", js.undefined)
    
    inline def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    inline def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableSovereignControls(value: Boolean): Self = StObject.set(x, "enableSovereignControls", value.asInstanceOf[js.Any])
    
    inline def setEnableSovereignControlsUndefined: Self = StObject.set(x, "enableSovereignControls", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFedrampHighSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings): Self = StObject.set(x, "fedrampHighSettings", value.asInstanceOf[js.Any])
    
    inline def setFedrampHighSettingsUndefined: Self = StObject.set(x, "fedrampHighSettings", js.undefined)
    
    inline def setFedrampModerateSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings): Self = StObject.set(x, "fedrampModerateSettings", value.asInstanceOf[js.Any])
    
    inline def setFedrampModerateSettingsUndefined: Self = StObject.set(x, "fedrampModerateSettings", js.undefined)
    
    inline def setIl4Settings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings): Self = StObject.set(x, "il4Settings", value.asInstanceOf[js.Any])
    
    inline def setIl4SettingsUndefined: Self = StObject.set(x, "il4Settings", js.undefined)
    
    inline def setKajEnrollmentState(value: String): Self = StObject.set(x, "kajEnrollmentState", value.asInstanceOf[js.Any])
    
    inline def setKajEnrollmentStateUndefined: Self = StObject.set(x, "kajEnrollmentState", js.undefined)
    
    inline def setKmsSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvisionedResourcesParent(value: String): Self = StObject.set(x, "provisionedResourcesParent", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesParentUndefined: Self = StObject.set(x, "provisionedResourcesParent", js.undefined)
    
    inline def setResourceSettings(value: js.Array[GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings]): Self = StObject.set(x, "resourceSettings", value.asInstanceOf[js.Any])
    
    inline def setResourceSettingsUndefined: Self = StObject.set(x, "resourceSettings", js.undefined)
    
    inline def setResourceSettingsVarargs(value: GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings*): Self = StObject.set(x, "resourceSettings", js.Array(value*))
    
    inline def setResources(value: js.Array[GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSaaEnrollmentResponse(value: GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse): Self = StObject.set(x, "saaEnrollmentResponse", value.asInstanceOf[js.Any])
    
    inline def setSaaEnrollmentResponseUndefined: Self = StObject.set(x, "saaEnrollmentResponse", js.undefined)
  }
}
