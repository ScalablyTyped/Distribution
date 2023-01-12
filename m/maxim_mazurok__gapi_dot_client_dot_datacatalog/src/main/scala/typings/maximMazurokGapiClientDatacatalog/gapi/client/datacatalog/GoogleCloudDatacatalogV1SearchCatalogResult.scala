package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1SearchCatalogResult extends StObject {
  
  /** Entry description that can consist of several sentences or paragraphs that describe entry contents. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The display name of the result. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified name (FQN) of the resource. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized
    * resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table:
    * `dataproc_metastore:PROJECT_ID.LOCATION_ID.INSTANCE_ID.DATABASE_ID.TABLE_ID`
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  
  /** Output only. The source system that Data Catalog automatically integrates with, such as BigQuery, Cloud Pub/Sub, or Dataproc Metastore. */
  var integratedSystem: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the Google Cloud resource the entry belongs to. For more information, see [Full Resource Name] (/apis/design/resource_names#full_resource_name). Example:
    * `//bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID`
    */
  var linkedResource: js.UndefOr[String] = js.undefined
  
  /** The last modification timestamp of the entry in the source system. */
  var modifyTime: js.UndefOr[String] = js.undefined
  
  /**
    * The relative name of the resource in URL format. Examples: * `projects/{PROJECT_ID}/locations/{LOCATION_ID}/entryGroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}` *
    * `projects/{PROJECT_ID}/tagTemplates/{TAG_TEMPLATE_ID}`
    */
  var relativeResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Sub-type of the search result. A dot-delimited full type of the resource. The same type you specify in the `type` search predicate. Examples: `entry.table`, `entry.dataStream`,
    * `tagTemplate`.
    */
  var searchResultSubtype: js.UndefOr[String] = js.undefined
  
  /** Type of the search result. You can use this field to determine which get method to call to fetch the full resource. */
  var searchResultType: js.UndefOr[String] = js.undefined
  
  /** Custom source system that you can manually integrate Data Catalog with. */
  var userSpecifiedSystem: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1SearchCatalogResult {
  
  inline def apply(): GoogleCloudDatacatalogV1SearchCatalogResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1SearchCatalogResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1SearchCatalogResult] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setIntegratedSystem(value: String): Self = StObject.set(x, "integratedSystem", value.asInstanceOf[js.Any])
    
    inline def setIntegratedSystemUndefined: Self = StObject.set(x, "integratedSystem", js.undefined)
    
    inline def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    inline def setModifyTime(value: String): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    inline def setModifyTimeUndefined: Self = StObject.set(x, "modifyTime", js.undefined)
    
    inline def setRelativeResourceName(value: String): Self = StObject.set(x, "relativeResourceName", value.asInstanceOf[js.Any])
    
    inline def setRelativeResourceNameUndefined: Self = StObject.set(x, "relativeResourceName", js.undefined)
    
    inline def setSearchResultSubtype(value: String): Self = StObject.set(x, "searchResultSubtype", value.asInstanceOf[js.Any])
    
    inline def setSearchResultSubtypeUndefined: Self = StObject.set(x, "searchResultSubtype", js.undefined)
    
    inline def setSearchResultType(value: String): Self = StObject.set(x, "searchResultType", value.asInstanceOf[js.Any])
    
    inline def setSearchResultTypeUndefined: Self = StObject.set(x, "searchResultType", js.undefined)
    
    inline def setUserSpecifiedSystem(value: String): Self = StObject.set(x, "userSpecifiedSystem", value.asInstanceOf[js.Any])
    
    inline def setUserSpecifiedSystemUndefined: Self = StObject.set(x, "userSpecifiedSystem", js.undefined)
  }
}
