package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS,
    * or QIDO-RS standard (e.g.,
    * `studies/{study_id}/series/{series_id}/instance/{instance_id}/frames/{frame_list}/rendered`).
    */
  var dicomWebPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DICOM store that is being accessed (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDicomWebPath(value: String): Self = StObject.set(x, "dicomWebPath", value.asInstanceOf[js.Any])
    
    inline def setDicomWebPathUndefined: Self = StObject.set(x, "dicomWebPath", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
