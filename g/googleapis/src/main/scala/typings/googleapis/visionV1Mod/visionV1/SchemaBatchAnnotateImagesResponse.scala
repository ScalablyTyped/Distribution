package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaBatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.native
}

object SchemaBatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaAnnotateImageResponse] = null): SchemaBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchAnnotateImagesResponse]
  }
}

