package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1SearchCatalogRequestScope extends StObject {
  
  /**
    * If `true`, include Google Cloud Platform (GCP) public datasets in search results. By default, they are excluded. See [Google Cloud Public Datasets](/public-datasets) for more
    * information.
    */
  var includeGcpPublicDatasets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of organization IDs to search within. To find your organization ID, follow the steps from [Creating and managing organizations]
    * (/resource-manager/docs/creating-managing-organization).
    */
  var includeOrgIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of project IDs to search within. For more information on the distinction between project names, IDs, and numbers, see [Projects](/docs/overview/#projects). */
  var includeProjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. This field is deprecated. The search mechanism for public and private tag templates is the same. */
  var includePublicTagTemplates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The list of locations to search within. If empty, all locations are searched. Returns an error if any location in the list isn't one of the [Supported
    * regions](https://cloud.google.com/data-catalog/docs/concepts/regions#supported_regions). If a location is unreachable, its name is returned in the
    * `SearchCatalogResponse.unreachable` field. To get additional information on the error, repeat the search request and set the location name as the value of this parameter.
    */
  var restrictedLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. If `true`, search only among starred entries. By default, all results are returned, starred or not. */
  var starredOnly: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatacatalogV1SearchCatalogRequestScope {
  
  inline def apply(): GoogleCloudDatacatalogV1SearchCatalogRequestScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1SearchCatalogRequestScope]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1SearchCatalogRequestScope](x: Self) {
    
    inline def setIncludeGcpPublicDatasets(value: Boolean): Self = StObject.set(x, "includeGcpPublicDatasets", value.asInstanceOf[js.Any])
    
    inline def setIncludeGcpPublicDatasetsUndefined: Self = StObject.set(x, "includeGcpPublicDatasets", js.undefined)
    
    inline def setIncludeOrgIds(value: js.Array[String]): Self = StObject.set(x, "includeOrgIds", value.asInstanceOf[js.Any])
    
    inline def setIncludeOrgIdsUndefined: Self = StObject.set(x, "includeOrgIds", js.undefined)
    
    inline def setIncludeOrgIdsVarargs(value: String*): Self = StObject.set(x, "includeOrgIds", js.Array(value*))
    
    inline def setIncludeProjectIds(value: js.Array[String]): Self = StObject.set(x, "includeProjectIds", value.asInstanceOf[js.Any])
    
    inline def setIncludeProjectIdsUndefined: Self = StObject.set(x, "includeProjectIds", js.undefined)
    
    inline def setIncludeProjectIdsVarargs(value: String*): Self = StObject.set(x, "includeProjectIds", js.Array(value*))
    
    inline def setIncludePublicTagTemplates(value: Boolean): Self = StObject.set(x, "includePublicTagTemplates", value.asInstanceOf[js.Any])
    
    inline def setIncludePublicTagTemplatesUndefined: Self = StObject.set(x, "includePublicTagTemplates", js.undefined)
    
    inline def setRestrictedLocations(value: js.Array[String]): Self = StObject.set(x, "restrictedLocations", value.asInstanceOf[js.Any])
    
    inline def setRestrictedLocationsUndefined: Self = StObject.set(x, "restrictedLocations", js.undefined)
    
    inline def setRestrictedLocationsVarargs(value: String*): Self = StObject.set(x, "restrictedLocations", js.Array(value*))
    
    inline def setStarredOnly(value: Boolean): Self = StObject.set(x, "starredOnly", value.asInstanceOf[js.Any])
    
    inline def setStarredOnlyUndefined: Self = StObject.set(x, "starredOnly", js.undefined)
  }
}
