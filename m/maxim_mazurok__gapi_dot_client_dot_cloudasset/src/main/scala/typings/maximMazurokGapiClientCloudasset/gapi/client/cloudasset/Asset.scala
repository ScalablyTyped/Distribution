package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends js.Object {
  
  /** Please also refer to the [access level user guide](https://cloud.google.com/access-context-manager/docs/overview#access-levels). */
  var accessLevel: js.UndefOr[GoogleIdentityAccesscontextmanagerV1AccessLevel] = js.native
  
  /** Please also refer to the [access policy user guide](https://cloud.google.com/access-context-manager/docs/overview#access-policies). */
  var accessPolicy: js.UndefOr[GoogleIdentityAccesscontextmanagerV1AccessPolicy] = js.native
  
  /**
    * The ancestry path of an asset in Google Cloud [resource hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of
    * relative resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at root. If the asset is a project, folder, or organization, the ancestry path
    * starts from the asset itself. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
    */
  var ancestors: js.UndefOr[js.Array[String]] = js.native
  
  /** The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more information. */
  var assetType: js.UndefOr[String] = js.native
  
  /**
    * A representation of the Cloud IAM policy set on a Google Cloud resource. There can be a maximum of one Cloud IAM policy set on any given resource. In addition, Cloud IAM policies
    * inherit their granted access scope from any policies set on parent resources in the resource hierarchy. Therefore, the effectively policy is the union of both the policy set on this
    * resource and each policy set on all of the resource's ancestry resource levels in the hierarchy. See [this topic](https://cloud.google.com/iam/docs/policies#inheritance) for more
    * information.
    */
  var iamPolicy: js.UndefOr[Policy] = js.native
  
  /**
    * The full name of the asset. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See [Resource
    * names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A representation of an [organization policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy). There can be more than one
    * organization policy with different constraints set on a given resource.
    */
  var orgPolicy: js.UndefOr[js.Array[GoogleCloudOrgpolicyV1Policy]] = js.native
  
  /** A representation of runtime OS Inventory information. See [this topic](https://cloud.google.com/compute/docs/instances/os-inventory-management) for more information. */
  var osInventory: js.UndefOr[Inventory] = js.native
  
  /** A representation of the resource. */
  var resource: js.UndefOr[Resource] = js.native
  
  /** Please also refer to the [service perimeter user guide](https://cloud.google.com/vpc-service-controls/docs/overview). */
  var servicePerimeter: js.UndefOr[GoogleIdentityAccesscontextmanagerV1ServicePerimeter] = js.native
  
  /** The last update timestamp of an asset. update_time is updated when create/update/delete operation is performed. */
  var updateTime: js.UndefOr[String] = js.native
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    
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
    def setAccessLevel(value: GoogleIdentityAccesscontextmanagerV1AccessLevel): Self = this.set("accessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevel: Self = this.set("accessLevel", js.undefined)
    
    @scala.inline
    def setAccessPolicy(value: GoogleIdentityAccesscontextmanagerV1AccessPolicy): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicy: Self = this.set("accessPolicy", js.undefined)
    
    @scala.inline
    def setAncestorsVarargs(value: String*): Self = this.set("ancestors", js.Array(value :_*))
    
    @scala.inline
    def setAncestors(value: js.Array[String]): Self = this.set("ancestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestors: Self = this.set("ancestors", js.undefined)
    
    @scala.inline
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setIamPolicy(value: Policy): Self = this.set("iamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamPolicy: Self = this.set("iamPolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrgPolicyVarargs(value: GoogleCloudOrgpolicyV1Policy*): Self = this.set("orgPolicy", js.Array(value :_*))
    
    @scala.inline
    def setOrgPolicy(value: js.Array[GoogleCloudOrgpolicyV1Policy]): Self = this.set("orgPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgPolicy: Self = this.set("orgPolicy", js.undefined)
    
    @scala.inline
    def setOsInventory(value: Inventory): Self = this.set("osInventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsInventory: Self = this.set("osInventory", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setServicePerimeter(value: GoogleIdentityAccesscontextmanagerV1ServicePerimeter): Self = this.set("servicePerimeter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePerimeter: Self = this.set("servicePerimeter", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
