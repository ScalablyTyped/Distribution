package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1Workload extends StObject {
  
  /**
    * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as
    * part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form
    * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.native
  
  /** Required. Immutable. Compliance Regime associated with this workload. */
  var complianceRegime: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The Workload creation timestamp. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers,
    * hyphen, and spaces. Example: My Workload
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations. */
  var etag: js.UndefOr[String] = js.native
  
  /** Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1WorkloadKMSSettings] = js.native
  
  /** Optional. Labels applied to the workload. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.GoogleCloudAssuredworkloadsV1Workload with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If
    * not specified all resources are created under the Workload parent. Formats: folders/{folder_id} organizations/{organization_id}
    */
  var provisionedResourcesParent: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation
    * will fail. Always read only.
    */
  var resources: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsV1WorkloadResourceInfo]] = js.native
}
object GoogleCloudAssuredworkloadsV1Workload {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1Workload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1Workload]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1WorkloadMutableBuilder[Self <: GoogleCloudAssuredworkloadsV1Workload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
    
    @scala.inline
    def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKmsSettings(value: GoogleCloudAssuredworkloadsV1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.GoogleCloudAssuredworkloadsV1Workload with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProvisionedResourcesParent(value: String): Self = StObject.set(x, "provisionedResourcesParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedResourcesParentUndefined: Self = StObject.set(x, "provisionedResourcesParent", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[GoogleCloudAssuredworkloadsV1WorkloadResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: GoogleCloudAssuredworkloadsV1WorkloadResourceInfo*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
