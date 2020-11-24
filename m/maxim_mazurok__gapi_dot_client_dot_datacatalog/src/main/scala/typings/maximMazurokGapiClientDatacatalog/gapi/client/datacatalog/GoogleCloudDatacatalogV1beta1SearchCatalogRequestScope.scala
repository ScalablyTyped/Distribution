package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope extends js.Object {
  
  /**
    * If `true`, include Google Cloud Platform (GCP) public datasets in the search results. Info on GCP public datasets is available at https://cloud.google.com/public-datasets/. By
    * default, GCP public datasets are excluded.
    */
  var includeGcpPublicDatasets: js.UndefOr[Boolean] = js.native
  
  /** The list of organization IDs to search within. To find your organization ID, follow instructions in https://cloud.google.com/resource-manager/docs/creating-managing-organization. */
  var includeOrgIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of project IDs to search within. To learn more about the distinction between project names/IDs/numbers, go to https://cloud.google.com/docs/overview/#projects. */
  var includeProjectIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The list of locations to search within. 1. If empty, search will be performed in all locations; 2. If any of the locations are NOT in the valid locations list, error will
    * be returned; 3. Otherwise, search only the given locations for matching results. Typical usage is to leave this field empty. When a location is unreachable as returned in the
    * `SearchCatalogResponse.unreachable` field, users can repeat the search request with this parameter set to get additional information on the error. Valid locations: * asia-east1 *
    * asia-east2 * asia-northeast1 * asia-northeast2 * asia-northeast3 * asia-south1 * asia-southeast1 * australia-southeast1 * eu * europe-north1 * europe-west1 * europe-west2 *
    * europe-west3 * europe-west4 * europe-west6 * global * northamerica-northeast1 * southamerica-east1 * us * us-central1 * us-east1 * us-east4 * us-west1 * us-west2
    */
  var restrictedLocations: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogRequestScopeOps[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope] (val x: Self) extends AnyVal {
    
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
    def setIncludeGcpPublicDatasets(value: Boolean): Self = this.set("includeGcpPublicDatasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGcpPublicDatasets: Self = this.set("includeGcpPublicDatasets", js.undefined)
    
    @scala.inline
    def setIncludeOrgIdsVarargs(value: String*): Self = this.set("includeOrgIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludeOrgIds(value: js.Array[String]): Self = this.set("includeOrgIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOrgIds: Self = this.set("includeOrgIds", js.undefined)
    
    @scala.inline
    def setIncludeProjectIdsVarargs(value: String*): Self = this.set("includeProjectIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludeProjectIds(value: js.Array[String]): Self = this.set("includeProjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeProjectIds: Self = this.set("includeProjectIds", js.undefined)
    
    @scala.inline
    def setRestrictedLocationsVarargs(value: String*): Self = this.set("restrictedLocations", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedLocations(value: js.Array[String]): Self = this.set("restrictedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedLocations: Self = this.set("restrictedLocations", js.undefined)
  }
}
