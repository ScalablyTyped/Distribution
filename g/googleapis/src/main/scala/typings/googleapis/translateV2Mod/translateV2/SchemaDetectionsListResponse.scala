package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDetectionsListResponse extends js.Object {
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[SchemaDetectionsResource]] = js.native
}

object SchemaDetectionsListResponse {
  @scala.inline
  def apply(detections: js.Array[SchemaDetectionsResource] = null): SchemaDetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (detections != null) __obj.updateDynamic("detections")(detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetectionsListResponse]
  }
}

