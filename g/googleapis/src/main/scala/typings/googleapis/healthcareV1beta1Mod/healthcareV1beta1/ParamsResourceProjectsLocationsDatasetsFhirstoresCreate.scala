package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the FHIR store that is being created. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`.
    */
  var fhirStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dataset this FHIR store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFhirStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresCreate](x: Self) {
    
    inline def setFhirStoreId(value: String): Self = StObject.set(x, "fhirStoreId", value.asInstanceOf[js.Any])
    
    inline def setFhirStoreIdUndefined: Self = StObject.set(x, "fhirStoreId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaFhirStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
