package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresExport
  extends StObject
     with StandardParameters {
  
  /**
    * The DICOM store resource name from which to export the data. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExportDicomDataRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresExport {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresExport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresExport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaExportDicomDataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
