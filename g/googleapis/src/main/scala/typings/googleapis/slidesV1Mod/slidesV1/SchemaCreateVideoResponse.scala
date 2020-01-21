package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a video.
  */
@js.native
trait SchemaCreateVideoResponse extends js.Object {
  /**
    * The object ID of the created video.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateVideoResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateVideoResponse]
  }
}

