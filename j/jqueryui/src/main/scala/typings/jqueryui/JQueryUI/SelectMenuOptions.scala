package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SelectMenu //////////////////////////////////////////////////
@js.native
trait SelectMenuOptions extends SelectMenuEvents {
  var appendTo: js.UndefOr[String] = js.native
  var classes: js.UndefOr[SelectMenuClasses] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var position: js.UndefOr[JQueryPositionOptions] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SelectMenuOptions {
  @scala.inline
  def apply(): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuOptions]
  }
  @scala.inline
  implicit class SelectMenuOptionsOps[Self <: SelectMenuOptions] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setClasses(value: SelectMenuClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setPosition(value: JQueryPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

