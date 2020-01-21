package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.stylesMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerIdStyle extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var style: Style
}

object AnonOwnerIdStyle {
  @scala.inline
  def apply(style: Style, ownerId: String = null): AnonOwnerIdStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwnerIdStyle]
  }
}

