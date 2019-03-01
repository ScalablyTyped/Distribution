package typings
package leafletDashDrawLib.leafletMod.EditOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditPolyVerticesEditOptions extends js.Object {
  var drawError: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.DrawErrorOptions] = js.undefined
  var icon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  var touchIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
}

object EditPolyVerticesEditOptions {
  @scala.inline
  def apply(
    drawError: leafletDashDrawLib.leafletMod.DrawOptionsNs.DrawErrorOptions = null,
    icon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    touchIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null
  ): EditPolyVerticesEditOptions = {
    val __obj = js.Dynamic.literal()
    if (drawError != null) __obj.updateDynamic("drawError")(drawError)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditPolyVerticesEditOptions]
  }
}

