package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest extends js.Object {
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest] = null): SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest]
  }
}

