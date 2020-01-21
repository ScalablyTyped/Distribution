package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait SchemaBatchAnnotateImagesRequest extends js.Object {
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaAnnotateImageRequest]] = js.native
}

object SchemaBatchAnnotateImagesRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaAnnotateImageRequest] = null): SchemaBatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchAnnotateImagesRequest]
  }
}

