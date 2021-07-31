package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS,
    * or QIDO-RS standard (e.g., `instances`).
    */
  var dicomWebPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DICOM store that is being accessed (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstancesMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDicomWebPath(value: String): Self = StObject.set(x, "dicomWebPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicomWebPathUndefined: Self = StObject.set(x, "dicomWebPath", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
