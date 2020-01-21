package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for predictions to be issued against a trained model.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictRequest extends js.Object {
  /**
    *  Required. The prediction request body.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.native
}

object SchemaGoogleCloudMlV1PredictRequest {
  @scala.inline
  def apply(httpBody: SchemaGoogleApiHttpBody = null): SchemaGoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    if (httpBody != null) __obj.updateDynamic("httpBody")(httpBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictRequest]
  }
}

