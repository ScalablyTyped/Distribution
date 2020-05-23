package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerId extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object OwnerId {
  @scala.inline
  def apply(styleId: String, ownerId: String = null): OwnerId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerId]
  }
}

