package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Fab.FabClassKey>> */
@js.native
trait PartialStyleRulesFabClass extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var extended: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var secondary: js.UndefOr[CSSProperties] = js.native
  var sizeMedium: js.UndefOr[CSSProperties] = js.native
  var sizeSmall: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFabClass {
  @scala.inline
  def apply(): PartialStyleRulesFabClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFabClass]
  }
  @scala.inline
  implicit class PartialStyleRulesFabClassOps[Self <: PartialStyleRulesFabClass] (val x: Self) extends AnyVal {
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
    def setColorInherit(value: CSSProperties): Self = this.set("colorInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInherit: Self = this.set("colorInherit", js.undefined)
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExtended(value: CSSProperties): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setFocusVisible(value: CSSProperties): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPrimary(value: CSSProperties): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSecondary(value: CSSProperties): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSizeMedium(value: CSSProperties): Self = this.set("sizeMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeMedium: Self = this.set("sizeMedium", js.undefined)
    @scala.inline
    def setSizeSmall(value: CSSProperties): Self = this.set("sizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSmall: Self = this.set("sizeSmall", js.undefined)
  }
  
}

