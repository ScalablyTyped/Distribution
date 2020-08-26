package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Button.ButtonClassKey>> */
@js.native
trait PartialStyleRulesButtonCl extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var contained: js.UndefOr[CSSProperties] = js.native
  var containedPrimary: js.UndefOr[CSSProperties] = js.native
  var containedSecondary: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var extendedFab: js.UndefOr[CSSProperties] = js.native
  var fab: js.UndefOr[CSSProperties] = js.native
  var flat: js.UndefOr[CSSProperties] = js.native
  var flatPrimary: js.UndefOr[CSSProperties] = js.native
  var flatSecondary: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var mini: js.UndefOr[CSSProperties] = js.native
  var outlined: js.UndefOr[CSSProperties] = js.native
  var outlinedPrimary: js.UndefOr[CSSProperties] = js.native
  var outlinedSecondary: js.UndefOr[CSSProperties] = js.native
  var raised: js.UndefOr[CSSProperties] = js.native
  var raisedPrimary: js.UndefOr[CSSProperties] = js.native
  var raisedSecondary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var sizeLarge: js.UndefOr[CSSProperties] = js.native
  var sizeSmall: js.UndefOr[CSSProperties] = js.native
  var text: js.UndefOr[CSSProperties] = js.native
  var textPrimary: js.UndefOr[CSSProperties] = js.native
  var textSecondary: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesButtonCl {
  @scala.inline
  def apply(): PartialStyleRulesButtonCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesButtonCl]
  }
  @scala.inline
  implicit class PartialStyleRulesButtonClOps[Self <: PartialStyleRulesButtonCl] (val x: Self) extends AnyVal {
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
    def setContained(value: CSSProperties): Self = this.set("contained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContained: Self = this.set("contained", js.undefined)
    @scala.inline
    def setContainedPrimary(value: CSSProperties): Self = this.set("containedPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainedPrimary: Self = this.set("containedPrimary", js.undefined)
    @scala.inline
    def setContainedSecondary(value: CSSProperties): Self = this.set("containedSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainedSecondary: Self = this.set("containedSecondary", js.undefined)
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExtendedFab(value: CSSProperties): Self = this.set("extendedFab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedFab: Self = this.set("extendedFab", js.undefined)
    @scala.inline
    def setFab(value: CSSProperties): Self = this.set("fab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFab: Self = this.set("fab", js.undefined)
    @scala.inline
    def setFlat(value: CSSProperties): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setFlatPrimary(value: CSSProperties): Self = this.set("flatPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatPrimary: Self = this.set("flatPrimary", js.undefined)
    @scala.inline
    def setFlatSecondary(value: CSSProperties): Self = this.set("flatSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatSecondary: Self = this.set("flatSecondary", js.undefined)
    @scala.inline
    def setFocusVisible(value: CSSProperties): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    @scala.inline
    def setFullWidth(value: CSSProperties): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMini(value: CSSProperties): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setOutlined(value: CSSProperties): Self = this.set("outlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    @scala.inline
    def setOutlinedPrimary(value: CSSProperties): Self = this.set("outlinedPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinedPrimary: Self = this.set("outlinedPrimary", js.undefined)
    @scala.inline
    def setOutlinedSecondary(value: CSSProperties): Self = this.set("outlinedSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinedSecondary: Self = this.set("outlinedSecondary", js.undefined)
    @scala.inline
    def setRaised(value: CSSProperties): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setRaisedPrimary(value: CSSProperties): Self = this.set("raisedPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaisedPrimary: Self = this.set("raisedPrimary", js.undefined)
    @scala.inline
    def setRaisedSecondary(value: CSSProperties): Self = this.set("raisedSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaisedSecondary: Self = this.set("raisedSecondary", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSizeLarge(value: CSSProperties): Self = this.set("sizeLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLarge: Self = this.set("sizeLarge", js.undefined)
    @scala.inline
    def setSizeSmall(value: CSSProperties): Self = this.set("sizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSmall: Self = this.set("sizeSmall", js.undefined)
    @scala.inline
    def setText(value: CSSProperties): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextPrimary(value: CSSProperties): Self = this.set("textPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPrimary: Self = this.set("textPrimary", js.undefined)
    @scala.inline
    def setTextSecondary(value: CSSProperties): Self = this.set("textSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSecondary: Self = this.set("textSecondary", js.undefined)
  }
  
}

