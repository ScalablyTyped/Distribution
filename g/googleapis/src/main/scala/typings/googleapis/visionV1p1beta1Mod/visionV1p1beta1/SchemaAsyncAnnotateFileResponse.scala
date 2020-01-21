package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileResponse extends js.Object {
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}

object SchemaAsyncAnnotateFileResponse {
  @scala.inline
  def apply(outputConfig: SchemaOutputConfig = null): SchemaAsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsyncAnnotateFileResponse]
  }
}

