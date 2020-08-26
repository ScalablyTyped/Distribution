package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, Unit]] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconClass: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var spriteCssClass: js.UndefOr[String] = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
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
    def setClick(value: /* e */ ButtonClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
  }
  
}

