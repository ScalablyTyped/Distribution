package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSearchResult extends js.Object {
  
  /**
    * The additional searchable attributes of this resource. The attributes may vary from one resource type to another. Examples: `projectId` for Project, `dnsName` for DNS ManagedZone.
    * This field contains a subset of the resource metadata fields that are returned by the List or Get APIs provided by the corresponding GCP service (e.g., Compute Engine). see [API
    * references and supported searchable attributes](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types) for more information. You can search
    * values of these fields through free text search. However, you should not consume the field programically as the field names and values may change as the GCP service updates to a new
    * incompatible API version. To search against the `additional_attributes`: * use a free text query to match the attributes values. Example: to search `additional_attributes = {
    * dnsName: "foobar" }`, you can issue a query `foobar`.
    */
  var additionalAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.ResourceSearchResult with TopLevel[js.Any]
  ] = js.native
  
  /** The type of this resource. Example: `compute.googleapis.com/Disk`. To search against the `asset_type`: * specify the `asset_type` field in your search request. */
  var assetType: js.UndefOr[String] = js.native
  
  /**
    * One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes. To search against the `description`: * use a field query. Example:
    * `description:"*important instance*"` * use a free text query. Example: `"*important instance*"`
    */
  var description: js.UndefOr[String] = js.native
  
  /** The display name of this resource. To search against the `display_name`: * use a field query. Example: `displayName:"My Instance"` * use a free text query. Example: `"My Instance"` */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Labels associated with this resource. See [Labelling and grouping GCP
    * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information. To search against the `labels`: * use a
    * field query: - query on any label's key or value. Example: `labels:prod` - query by a given label. Example: `labels.env:prod` - query by a given label's existence. Example:
    * `labels.env:*` * use a free text query. Example: `prod`
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.ResourceSearchResult with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`. To search against the `location`: * use a field query. Example: `location:us-west*` * use a free text
    * query. Example: `us-west*`
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The full resource name of this resource. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud Asset Inventory Resource Name
    * Format](https://cloud.google.com/asset-inventory/docs/resource-name-format) for more information. To search against the `name`: * use a field query. Example: `name:instance1` * use
    * a free text query. Example: `instance1`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Network tags associated with this resource. Like labels, network tags are a type of annotations used to group GCP resources. See [Labelling GCP
    * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information. To search against the `network_tags`: * use
    * a field query. Example: `networkTags:internal` * use a free text query. Example: `internal`
    */
  var networkTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The project that this resource belongs to, in the form of projects/{PROJECT_NUMBER}. To search against the `project`: * specify the `scope` field as this project in your search
    * request.
    */
  var project: js.UndefOr[String] = js.native
}
object ResourceSearchResult {
  
  @scala.inline
  def apply(): ResourceSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSearchResult]
  }
  
  @scala.inline
  implicit class ResourceSearchResultOps[Self <: ResourceSearchResult] (val x: Self) extends AnyVal {
    
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
    def setAdditionalAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.ResourceSearchResult with TopLevel[js.Any]
    ): Self = this.set("additionalAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAttributes: Self = this.set("additionalAttributes", js.undefined)
    
    @scala.inline
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.ResourceSearchResult with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkTagsVarargs(value: String*): Self = this.set("networkTags", js.Array(value :_*))
    
    @scala.inline
    def setNetworkTags(value: js.Array[String]): Self = this.set("networkTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTags: Self = this.set("networkTags", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
