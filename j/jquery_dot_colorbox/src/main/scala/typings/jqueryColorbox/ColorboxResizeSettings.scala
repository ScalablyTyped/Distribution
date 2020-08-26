package typings.jqueryColorbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorboxResizeSettings extends js.Object {
  var height: js.UndefOr[Double | String] = js.native
  var innerHeight: js.UndefOr[Double | String] = js.native
  var innerWidth: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ColorboxResizeSettings {
  @scala.inline
  def apply(): ColorboxResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorboxResizeSettings]
  }
  @scala.inline
  implicit class ColorboxResizeSettingsOps[Self <: ColorboxResizeSettings] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInnerHeight(value: Double | String): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHeight: Self = this.set("innerHeight", js.undefined)
    @scala.inline
    def setInnerWidth(value: Double | String): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

