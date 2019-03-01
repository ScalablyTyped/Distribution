package typings
package leafletDashDrawLib.leafletMod.EditOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSimpleShapeOptions extends js.Object {
  var moveIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  var resizeIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  var touchMoveIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  var touchResizeIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
}

object EditSimpleShapeOptions {
  @scala.inline
  def apply(
    moveIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    resizeIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    touchMoveIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    touchResizeIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null
  ): EditSimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (moveIcon != null) __obj.updateDynamic("moveIcon")(moveIcon.asInstanceOf[js.Any])
    if (resizeIcon != null) __obj.updateDynamic("resizeIcon")(resizeIcon.asInstanceOf[js.Any])
    if (touchMoveIcon != null) __obj.updateDynamic("touchMoveIcon")(touchMoveIcon.asInstanceOf[js.Any])
    if (touchResizeIcon != null) __obj.updateDynamic("touchResizeIcon")(touchResizeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSimpleShapeOptions]
  }
}

