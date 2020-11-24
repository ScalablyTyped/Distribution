package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1Workload extends js.Object {
  
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
  implicit class GoogleCloudAssuredworkloadsV1WorkloadOps[Self <: GoogleCloudAssuredworkloadsV1Workload] (val x: Self) extends AnyVal {
    
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
    def setBillingAccount(value: String): Self = this.set("billingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAccount: Self = this.set("billingAccount", js.undefined)
    
    @scala.inline
    def setComplianceRegime(value: String): Self = this.set("complianceRegime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceRegime: Self = this.set("complianceRegime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKmsSettings(value: GoogleCloudAssuredworkloadsV1WorkloadKMSSettings): Self = this.set("kmsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsSettings: Self = this.set("kmsSettings", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.GoogleCloudAssuredworkloadsV1Workload with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProvisionedResourcesParent(value: String): Self = this.set("provisionedResourcesParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedResourcesParent: Self = this.set("provisionedResourcesParent", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: GoogleCloudAssuredworkloadsV1WorkloadResourceInfo*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[GoogleCloudAssuredworkloadsV1WorkloadResourceInfo]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
