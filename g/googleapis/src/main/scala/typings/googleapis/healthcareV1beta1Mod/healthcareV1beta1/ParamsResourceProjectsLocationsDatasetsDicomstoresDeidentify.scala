package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeidentifyDicomStoreRequest] = js.undefined
  
  /**
    * Source DICOM store resource name. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    */
  var sourceStore: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify](x: Self) {
    
    inline def setRequestBody(value: SchemaDeidentifyDicomStoreRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSourceStore(value: String): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
    
    inline def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
  }
}
