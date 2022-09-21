package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata
  extends StObject
     with StandardParameters {
  
  /**
    * The path of the RetrieveInstanceMetadata DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}/metadata`.
    */
  var dicomWebPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata](x: Self) {
    
    inline def setDicomWebPath(value: String): Self = StObject.set(x, "dicomWebPath", value.asInstanceOf[js.Any])
    
    inline def setDicomWebPathUndefined: Self = StObject.set(x, "dicomWebPath", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
