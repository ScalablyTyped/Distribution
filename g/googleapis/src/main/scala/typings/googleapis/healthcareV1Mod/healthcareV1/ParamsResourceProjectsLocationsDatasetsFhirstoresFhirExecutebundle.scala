package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirExecutebundle
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the FHIR store in which this bundle will be executed.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHttpBody] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirExecutebundle {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirExecutebundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirExecutebundle]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirExecutebundle](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaHttpBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
