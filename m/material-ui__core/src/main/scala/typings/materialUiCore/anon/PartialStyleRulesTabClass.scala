package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tab.TabClassKey>> */
@js.native
trait PartialStyleRulesTabClass extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var labelContainer: js.UndefOr[CSSProperties] = js.native
  var labelIcon: js.UndefOr[CSSProperties] = js.native
  var labelWrapped: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var selected: js.UndefOr[CSSProperties] = js.native
  var textColorInherit: js.UndefOr[CSSProperties] = js.native
  var textColorPrimary: js.UndefOr[CSSProperties] = js.native
  var textColorSecondary: js.UndefOr[CSSProperties] = js.native
  var wrapper: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTabClass {
  @scala.inline
  def apply(): PartialStyleRulesTabClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTabClass]
  }
  @scala.inline
  implicit class PartialStyleRulesTabClassOps[Self <: PartialStyleRulesTabClass] (val x: Self) extends AnyVal {
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
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFullWidth(value: CSSProperties): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelContainer(value: CSSProperties): Self = this.set("labelContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelContainer: Self = this.set("labelContainer", js.undefined)
    @scala.inline
    def setLabelIcon(value: CSSProperties): Self = this.set("labelIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIcon: Self = this.set("labelIcon", js.undefined)
    @scala.inline
    def setLabelWrapped(value: CSSProperties): Self = this.set("labelWrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapped: Self = this.set("labelWrapped", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSelected(value: CSSProperties): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTextColorInherit(value: CSSProperties): Self = this.set("textColorInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColorInherit: Self = this.set("textColorInherit", js.undefined)
    @scala.inline
    def setTextColorPrimary(value: CSSProperties): Self = this.set("textColorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColorPrimary: Self = this.set("textColorPrimary", js.undefined)
    @scala.inline
    def setTextColorSecondary(value: CSSProperties): Self = this.set("textColorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColorSecondary: Self = this.set("textColorSecondary", js.undefined)
    @scala.inline
    def setWrapper(value: CSSProperties): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

