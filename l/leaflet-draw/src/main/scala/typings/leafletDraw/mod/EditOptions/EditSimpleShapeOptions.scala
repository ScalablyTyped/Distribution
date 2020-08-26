package typings.leafletDraw.mod.EditOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSimpleShapeOptions extends js.Object {
  var moveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var resizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var touchMoveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var touchResizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
}

object EditSimpleShapeOptions {
  @scala.inline
  def apply(): EditSimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSimpleShapeOptions]
  }
  @scala.inline
  implicit class EditSimpleShapeOptionsOps[Self <: EditSimpleShapeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("moveIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveIcon: Self = this.set("moveIcon", js.undefined)
    @scala.inline
    def setResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("resizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeIcon: Self = this.set("resizeIcon", js.undefined)
    @scala.inline
    def setTouchMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("touchMoveIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchMoveIcon: Self = this.set("touchMoveIcon", js.undefined)
    @scala.inline
    def setTouchResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("touchResizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchResizeIcon: Self = this.set("touchResizeIcon", js.undefined)
  }
  
}

