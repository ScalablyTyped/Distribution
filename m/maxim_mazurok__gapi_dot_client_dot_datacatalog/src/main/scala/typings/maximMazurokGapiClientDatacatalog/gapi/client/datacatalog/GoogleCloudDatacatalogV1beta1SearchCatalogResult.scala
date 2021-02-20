package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SearchCatalogResult extends StObject {
  
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
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogResultMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    @scala.inline
    def setRelativeResourceName(value: String): Self = StObject.set(x, "relativeResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeResourceNameUndefined: Self = StObject.set(x, "relativeResourceName", js.undefined)
    
    @scala.inline
    def setSearchResultSubtype(value: String): Self = StObject.set(x, "searchResultSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultSubtypeUndefined: Self = StObject.set(x, "searchResultSubtype", js.undefined)
    
    @scala.inline
    def setSearchResultType(value: String): Self = StObject.set(x, "searchResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultTypeUndefined: Self = StObject.set(x, "searchResultType", js.undefined)
  }
}
