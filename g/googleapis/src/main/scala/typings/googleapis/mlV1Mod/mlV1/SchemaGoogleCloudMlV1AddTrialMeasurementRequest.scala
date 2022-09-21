package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1AddTrialMeasurementRequest extends StObject {
  
  /**
    * Required. The measurement to be added to a trial.
    */
  var measurement: js.UndefOr[SchemaGoogleCloudMlV1Measurement] = js.undefined
}
object SchemaGoogleCloudMlV1AddTrialMeasurementRequest {
  
  inline def apply(): SchemaGoogleCloudMlV1AddTrialMeasurementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AddTrialMeasurementRequest]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1AddTrialMeasurementRequest](x: Self) {
    
    inline def setMeasurement(value: SchemaGoogleCloudMlV1Measurement): Self = StObject.set(x, "measurement", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUndefined: Self = StObject.set(x, "measurement", js.undefined)
  }
}
