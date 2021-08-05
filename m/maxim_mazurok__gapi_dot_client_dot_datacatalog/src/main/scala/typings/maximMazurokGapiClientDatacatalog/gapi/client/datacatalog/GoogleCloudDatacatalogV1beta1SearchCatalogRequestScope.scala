package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope extends StObject {
  
  /**
    * If `true`, include Google Cloud Platform (GCP) public datasets in the search results. Info on GCP public datasets is available at https://cloud.google.com/public-datasets/. By
    * default, GCP public datasets are excluded.
    */
  var includeGcpPublicDatasets: js.UndefOr[Boolean] = js.undefined
  
  /** The list of organization IDs to search within. To find your organization ID, follow instructions in https://cloud.google.com/resource-manager/docs/creating-managing-organization. */
  var includeOrgIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of project IDs to search within. To learn more about the distinction between project names/IDs/numbers, go to https://cloud.google.com/docs/overview/#projects. */
  var includeProjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The list of locations to search within. 1. If empty, search will be performed in all locations; 2. If any of the locations are NOT in the valid locations list, error will
    * be returned; 3. Otherwise, search only the given locations for matching results. Typical usage is to leave this field empty. When a location is unreachable as returned in the
    * `SearchCatalogResponse.unreachable` field, users can repeat the search request with this parameter set to get additional information on the error. Valid locations: * asia-east1 *
    * asia-east2 * asia-northeast1 * asia-northeast2 * asia-northeast3 * asia-south1 * asia-southeast1 * australia-southeast1 * eu * europe-north1 * europe-west1 * europe-west2 *
    * europe-west3 * europe-west4 * europe-west6 * global * northamerica-northeast1 * southamerica-east1 * us * us-central1 * us-east1 * us-east4 * us-west1 * us-west2
    */
  var restrictedLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope](x: Self) {
    
    inline def setIncludeGcpPublicDatasets(value: Boolean): Self = StObject.set(x, "includeGcpPublicDatasets", value.asInstanceOf[js.Any])
    
    inline def setIncludeGcpPublicDatasetsUndefined: Self = StObject.set(x, "includeGcpPublicDatasets", js.undefined)
    
    inline def setIncludeOrgIds(value: js.Array[String]): Self = StObject.set(x, "includeOrgIds", value.asInstanceOf[js.Any])
    
    inline def setIncludeOrgIdsUndefined: Self = StObject.set(x, "includeOrgIds", js.undefined)
    
    inline def setIncludeOrgIdsVarargs(value: String*): Self = StObject.set(x, "includeOrgIds", js.Array(value :_*))
    
    inline def setIncludeProjectIds(value: js.Array[String]): Self = StObject.set(x, "includeProjectIds", value.asInstanceOf[js.Any])
    
    inline def setIncludeProjectIdsUndefined: Self = StObject.set(x, "includeProjectIds", js.undefined)
    
    inline def setIncludeProjectIdsVarargs(value: String*): Self = StObject.set(x, "includeProjectIds", js.Array(value :_*))
    
    inline def setRestrictedLocations(value: js.Array[String]): Self = StObject.set(x, "restrictedLocations", value.asInstanceOf[js.Any])
    
    inline def setRestrictedLocationsUndefined: Self = StObject.set(x, "restrictedLocations", js.undefined)
    
    inline def setRestrictedLocationsVarargs(value: String*): Self = StObject.set(x, "restrictedLocations", js.Array(value :_*))
  }
}
