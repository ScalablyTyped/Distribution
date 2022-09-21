package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The trial name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1AddTrialMeasurementRequest] = js.undefined
}
object ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement {
  
  inline def apply(): ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudMlV1AddTrialMeasurementRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
