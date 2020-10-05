package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepLabel.StepLabelClasskey>> */
@js.native
trait PartialStyleRulesStepLabe extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.native
  var alternativeLabel: js.UndefOr[CSSProperties] = js.native
  var completed: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var horizontal: js.UndefOr[CSSProperties] = js.native
  var iconContainer: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var labelContainer: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var vertical: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesStepLabe {
  @scala.inline
  def apply(): PartialStyleRulesStepLabe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepLabe]
  }
  @scala.inline
  implicit class PartialStyleRulesStepLabeOps[Self <: PartialStyleRulesStepLabe] (val x: Self) extends AnyVal {
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
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlternativeLabel(value: CSSProperties): Self = this.set("alternativeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeLabel: Self = this.set("alternativeLabel", js.undefined)
    @scala.inline
    def setCompleted(value: CSSProperties): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: CSSProperties): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHorizontal(value: CSSProperties): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setIconContainer(value: CSSProperties): Self = this.set("iconContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconContainer: Self = this.set("iconContainer", js.undefined)
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelContainer(value: CSSProperties): Self = this.set("labelContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelContainer: Self = this.set("labelContainer", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setVertical(value: CSSProperties): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

