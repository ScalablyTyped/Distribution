package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanel/ExpansionPanel.ExpansionPanelClassKey>> */
@js.native
trait PartialClassNameMapExpans extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var expanded: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var rounded: js.UndefOr[String] = js.native
}

object PartialClassNameMapExpans {
  @scala.inline
  def apply(): PartialClassNameMapExpans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapExpans]
  }
  @scala.inline
  implicit class PartialClassNameMapExpansOps[Self <: PartialClassNameMapExpans] (val x: Self) extends AnyVal {
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExpanded(value: String): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRounded(value: String): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
  }
  
}

