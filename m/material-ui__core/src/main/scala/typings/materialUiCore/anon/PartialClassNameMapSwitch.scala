package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Switch/Switch.SwitchClassKey>> */
@js.native
trait PartialClassNameMapSwitch extends js.Object {
  var bar: js.UndefOr[String] = js.native
  var checked: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconChecked: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var switchBase: js.UndefOr[String] = js.native
}

object PartialClassNameMapSwitch {
  @scala.inline
  def apply(): PartialClassNameMapSwitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSwitch]
  }
  @scala.inline
  implicit class PartialClassNameMapSwitchOps[Self <: PartialClassNameMapSwitch] (val x: Self) extends AnyVal {
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
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconChecked(value: String): Self = this.set("iconChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconChecked: Self = this.set("iconChecked", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSwitchBase(value: String): Self = this.set("switchBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchBase: Self = this.set("switchBase", js.undefined)
  }
  
}

