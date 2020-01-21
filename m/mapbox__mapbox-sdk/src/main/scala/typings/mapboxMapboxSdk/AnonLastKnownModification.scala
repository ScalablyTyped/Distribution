package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.stylesMod.Style
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastKnownModification extends js.Object {
  var lastKnownModification: js.UndefOr[String | Double | Date] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var style: Style
  var styleId: String
}

object AnonLastKnownModification {
  @scala.inline
  def apply(
    style: Style,
    styleId: String,
    lastKnownModification: String | Double | Date = null,
    ownerId: String = null
  ): AnonLastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (lastKnownModification != null) __obj.updateDynamic("lastKnownModification")(lastKnownModification.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastKnownModification]
  }
}

