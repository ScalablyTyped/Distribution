package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerId extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object AnonOwnerId {
  @scala.inline
  def apply(styleId: String, ownerId: String = null): AnonOwnerId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwnerId]
  }
}

