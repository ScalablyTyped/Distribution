package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for predictions to be issued against a trained model.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictRequest extends StObject {
  
  /**
    *  Required. The prediction request body.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.native
}
object SchemaGoogleCloudMlV1PredictRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1PredictRequestMutableBuilder[Self <: SchemaGoogleCloudMlV1PredictRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpBody(value: SchemaGoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
