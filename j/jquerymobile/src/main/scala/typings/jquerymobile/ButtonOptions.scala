package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconpos: js.UndefOr[String] = js.native
  var iconshadow: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
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
    def setCorners(value: Boolean): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconpos(value: String): Self = this.set("iconpos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconpos: Self = this.set("iconpos", js.undefined)
    @scala.inline
    def setIconshadow(value: Boolean): Self = this.set("iconshadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconshadow: Self = this.set("iconshadow", js.undefined)
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

