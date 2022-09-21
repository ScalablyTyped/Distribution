package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResult extends StObject {
  
  /**
    * The full name of the cloud resource the entry belongs to. See: https://cloud.google.com/apis/design/resource_names#full_resource_name. Example: * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
    */
  var linkedResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last-modified timestamp of the entry from the managing system.
    */
  var modifyTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relative resource name of the resource in URL format. Examples: * `projects/{project_id\}/locations/{location_id\}/entryGroups/{entry_group_id\}/entries/{entry_id\}` * `projects/{project_id\}/tagTemplates/{tag_template_id\}`
    */
  var relativeResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sub-type of the search result. This is a dot-delimited description of the resource's full type, and is the same as the value callers would provide in the "type" search facet. Examples: `entry.table`, `entry.dataStream`, `tagTemplate`.
    */
  var searchResultSubtype: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the search result. This field can be used to determine which Get method to call to fetch the full resource.
    */
  var searchResultType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResult {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResult]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResult](x: Self) {
    
    inline def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourceNull: Self = StObject.set(x, "linkedResource", null)
    
    inline def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    inline def setModifyTime(value: String): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    inline def setModifyTimeNull: Self = StObject.set(x, "modifyTime", null)
    
    inline def setModifyTimeUndefined: Self = StObject.set(x, "modifyTime", js.undefined)
    
    inline def setRelativeResourceName(value: String): Self = StObject.set(x, "relativeResourceName", value.asInstanceOf[js.Any])
    
    inline def setRelativeResourceNameNull: Self = StObject.set(x, "relativeResourceName", null)
    
    inline def setRelativeResourceNameUndefined: Self = StObject.set(x, "relativeResourceName", js.undefined)
    
    inline def setSearchResultSubtype(value: String): Self = StObject.set(x, "searchResultSubtype", value.asInstanceOf[js.Any])
    
    inline def setSearchResultSubtypeNull: Self = StObject.set(x, "searchResultSubtype", null)
    
    inline def setSearchResultSubtypeUndefined: Self = StObject.set(x, "searchResultSubtype", js.undefined)
    
    inline def setSearchResultType(value: String): Self = StObject.set(x, "searchResultType", value.asInstanceOf[js.Any])
    
    inline def setSearchResultTypeNull: Self = StObject.set(x, "searchResultType", null)
    
    inline def setSearchResultTypeUndefined: Self = StObject.set(x, "searchResultType", js.undefined)
  }
}
