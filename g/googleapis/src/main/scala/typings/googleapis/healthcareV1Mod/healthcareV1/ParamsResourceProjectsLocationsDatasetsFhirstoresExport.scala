package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresExport
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the FHIR store to export resource from, in the format of `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/fhirStores/{fhir_store_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExportResourcesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresExport {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresExport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresExport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaExportResourcesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
