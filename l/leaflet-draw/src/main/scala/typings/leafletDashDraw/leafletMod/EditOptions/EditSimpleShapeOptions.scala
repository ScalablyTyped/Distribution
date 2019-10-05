package typings.leafletDashDraw.leafletMod.EditOptions

import typings.leaflet.leafletMod.DivIcon
import typings.leaflet.leafletMod.Icon
import typings.leaflet.leafletMod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSimpleShapeOptions extends js.Object {
  var moveIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  var resizeIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  var touchMoveIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  var touchResizeIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
}

object EditSimpleShapeOptions {
  @scala.inline
  def apply(
    moveIcon: Icon[IconOptions] | DivIcon = null,
    resizeIcon: Icon[IconOptions] | DivIcon = null,
    touchMoveIcon: Icon[IconOptions] | DivIcon = null,
    touchResizeIcon: Icon[IconOptions] | DivIcon = null
  ): EditSimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (moveIcon != null) __obj.updateDynamic("moveIcon")(moveIcon.asInstanceOf[js.Any])
    if (resizeIcon != null) __obj.updateDynamic("resizeIcon")(resizeIcon.asInstanceOf[js.Any])
    if (touchMoveIcon != null) __obj.updateDynamic("touchMoveIcon")(touchMoveIcon.asInstanceOf[js.Any])
    if (touchResizeIcon != null) __obj.updateDynamic("touchResizeIcon")(touchResizeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSimpleShapeOptions]
  }
}

