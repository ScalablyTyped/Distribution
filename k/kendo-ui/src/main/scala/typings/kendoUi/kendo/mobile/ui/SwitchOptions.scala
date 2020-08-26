package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var offLabel: js.UndefOr[String] = js.native
  var onLabel: js.UndefOr[String] = js.native
}

object SwitchOptions {
  @scala.inline
  def apply(): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchOptions]
  }
  @scala.inline
  implicit class SwitchOptionsOps[Self <: SwitchOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ SwitchChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffLabel(value: String): Self = this.set("offLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffLabel: Self = this.set("offLabel", js.undefined)
    @scala.inline
    def setOnLabel(value: String): Self = this.set("onLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLabel: Self = this.set("onLabel", js.undefined)
  }
  
}

