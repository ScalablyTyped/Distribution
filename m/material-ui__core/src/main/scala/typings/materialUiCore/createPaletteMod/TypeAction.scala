package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAction extends js.Object {
  var active: String = js.native
  var disabled: String = js.native
  var disabledBackground: String = js.native
  var hover: String = js.native
  var hoverOpacity: Double = js.native
  var selected: String = js.native
}

object TypeAction {
  @scala.inline
  def apply(
    active: String,
    disabled: String,
    disabledBackground: String,
    hover: String,
    hoverOpacity: Double,
    selected: String
  ): TypeAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAction]
  }
  @scala.inline
  implicit class TypeActionOps[Self <: TypeAction] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledBackground(value: String): Self = this.set("disabledBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setHover(value: String): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverOpacity(value: Double): Self = this.set("hoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

