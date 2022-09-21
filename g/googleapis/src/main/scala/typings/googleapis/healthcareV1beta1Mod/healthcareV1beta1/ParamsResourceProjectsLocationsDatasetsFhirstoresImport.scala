package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresImport
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the FHIR store to import FHIR resources to, in the format of `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/fhirStores/{fhir_store_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaImportResourcesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresImport {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresImport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresImport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaImportResourcesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
