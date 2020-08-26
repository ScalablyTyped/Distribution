package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Fab/Fab.FabClassKey>> */
@js.native
trait PartialClassNameMapFabCla extends js.Object {
  var colorInherit: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var extended: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var primary: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var secondary: js.UndefOr[String] = js.native
  var sizeMedium: js.UndefOr[String] = js.native
  var sizeSmall: js.UndefOr[String] = js.native
}

object PartialClassNameMapFabCla {
  @scala.inline
  def apply(): PartialClassNameMapFabCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFabCla]
  }
  @scala.inline
  implicit class PartialClassNameMapFabClaOps[Self <: PartialClassNameMapFabCla] (val x: Self) extends AnyVal {
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
    def setColorInherit(value: String): Self = this.set("colorInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInherit: Self = this.set("colorInherit", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExtended(value: String): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setFocusVisible(value: String): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSizeMedium(value: String): Self = this.set("sizeMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeMedium: Self = this.set("sizeMedium", js.undefined)
    @scala.inline
    def setSizeSmall(value: String): Self = this.set("sizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSmall: Self = this.set("sizeSmall", js.undefined)
  }
  
}

