package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipswitchOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enhanced: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var offText: js.UndefOr[String] = js.native
  var onText: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  var wrapperClass: js.UndefOr[String] = js.native
}

object FlipswitchOptions {
  @scala.inline
  def apply(): FlipswitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipswitchOptions]
  }
  @scala.inline
  implicit class FlipswitchOptionsOps[Self <: FlipswitchOptions] (val x: Self) extends AnyVal {
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
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnhanced(value: Boolean): Self = this.set("enhanced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhanced: Self = this.set("enhanced", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
  
}

