package typings.leafletDashDraw.leafletMod.EditOptionsNs

import typings.leaflet.leafletMod.DivIcon
import typings.leaflet.leafletMod.Icon
import typings.leaflet.leafletMod.IconOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.DrawErrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditPolyVerticesEditOptions extends js.Object {
  var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
  var icon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  var touchIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
}

object EditPolyVerticesEditOptions {
  @scala.inline
  def apply(
    drawError: DrawErrorOptions = null,
    icon: Icon[IconOptions] | DivIcon = null,
    touchIcon: Icon[IconOptions] | DivIcon = null
  ): EditPolyVerticesEditOptions = {
    val __obj = js.Dynamic.literal()
    if (drawError != null) __obj.updateDynamic("drawError")(drawError)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditPolyVerticesEditOptions]
  }
}

