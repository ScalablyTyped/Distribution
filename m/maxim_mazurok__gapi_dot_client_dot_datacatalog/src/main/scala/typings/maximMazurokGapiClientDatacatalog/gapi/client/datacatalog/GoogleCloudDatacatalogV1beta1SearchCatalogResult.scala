package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SearchCatalogResult extends js.Object {
  
  /**
    * The full name of the cloud resource the entry belongs to. See: https://cloud.google.com/apis/design/resource_names#full_resource_name. Example: *
    * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
    */
  var linkedResource: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of the resource in URL format. Examples: * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}` *
    * `projects/{project_id}/tagTemplates/{tag_template_id}`
    */
  var relativeResourceName: js.UndefOr[String] = js.native
  
  /**
    * Sub-type of the search result. This is a dot-delimited description of the resource's full type, and is the same as the value callers would provide in the "type" search facet.
    * Examples: `entry.table`, `entry.dataStream`, `tagTemplate`.
    */
  var searchResultSubtype: js.UndefOr[String] = js.native
  
  /** Type of the search result. This field can be used to determine which Get method to call to fetch the full resource. */
  var searchResultType: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1SearchCatalogResult {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogResultOps[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogResult] (val x: Self) extends AnyVal {
    
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
    def setLinkedResource(value: String): Self = this.set("linkedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedResource: Self = this.set("linkedResource", js.undefined)
    
    @scala.inline
    def setRelativeResourceName(value: String): Self = this.set("relativeResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeResourceName: Self = this.set("relativeResourceName", js.undefined)
    
    @scala.inline
    def setSearchResultSubtype(value: String): Self = this.set("searchResultSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResultSubtype: Self = this.set("searchResultSubtype", js.undefined)
    
    @scala.inline
    def setSearchResultType(value: String): Self = this.set("searchResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResultType: Self = this.set("searchResultType", js.undefined)
  }
}
