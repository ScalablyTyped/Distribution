package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListModels method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListModelsResponse extends js.Object {
  /**
    * The list of models.
    */
  var models: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Model]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1ListModelsResponse {
  @scala.inline
  def apply(models: js.Array[SchemaGoogleCloudMlV1Model] = null, nextPageToken: String = null): SchemaGoogleCloudMlV1ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListModelsResponse]
  }
}

