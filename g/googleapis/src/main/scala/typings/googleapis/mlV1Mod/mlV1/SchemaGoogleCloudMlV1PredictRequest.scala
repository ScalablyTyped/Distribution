package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1PredictRequest extends StObject {
  
  /**
    *  Required. The prediction request body. Refer to the [request body details section](#request-body-details) for more information on how to structure your request.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.undefined
}
object SchemaGoogleCloudMlV1PredictRequest {
  
  inline def apply(): SchemaGoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictRequest]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1PredictRequest](x: Self) {
    
    inline def setHttpBody(value: SchemaGoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    inline def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
