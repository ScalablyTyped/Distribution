package typings.leafletDraw.mod.EditOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSimpleShapeOptions extends js.Object {
  var moveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  var resizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  var touchMoveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  var touchResizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
}

object EditSimpleShapeOptions {
  @scala.inline
  def apply(
    moveIcon: Icon_[IconOptions] | DivIcon_ = null,
    resizeIcon: Icon_[IconOptions] | DivIcon_ = null,
    touchMoveIcon: Icon_[IconOptions] | DivIcon_ = null,
    touchResizeIcon: Icon_[IconOptions] | DivIcon_ = null
  ): EditSimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (moveIcon != null) __obj.updateDynamic("moveIcon")(moveIcon.asInstanceOf[js.Any])
    if (resizeIcon != null) __obj.updateDynamic("resizeIcon")(resizeIcon.asInstanceOf[js.Any])
    if (touchMoveIcon != null) __obj.updateDynamic("touchMoveIcon")(touchMoveIcon.asInstanceOf[js.Any])
    if (touchResizeIcon != null) __obj.updateDynamic("touchResizeIcon")(touchResizeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSimpleShapeOptions]
  }
}

