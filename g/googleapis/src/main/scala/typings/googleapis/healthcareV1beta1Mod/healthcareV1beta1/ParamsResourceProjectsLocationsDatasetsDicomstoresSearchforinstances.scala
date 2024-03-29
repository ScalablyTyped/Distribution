package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances
  extends StObject
     with StandardParameters {
  
  /**
    * The path of the SearchForInstancesRequest DICOMweb request. For example, `instances`, `series/{series_uid\}/instances`, or `studies/{study_uid\}/instances`.
    */
  var dicomWebPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances](x: Self) {
    
    inline def setDicomWebPath(value: String): Self = StObject.set(x, "dicomWebPath", value.asInstanceOf[js.Any])
    
    inline def setDicomWebPathUndefined: Self = StObject.set(x, "dicomWebPath", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
