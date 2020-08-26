package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelSummary/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
@js.native
trait PartialClassNameMapExpansContent extends js.Object {
  var content: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var expandIcon: js.UndefOr[String] = js.native
  var expanded: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapExpansContent {
  @scala.inline
  def apply(): PartialClassNameMapExpansContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapExpansContent]
  }
  @scala.inline
  implicit class PartialClassNameMapExpansContentOps[Self <: PartialClassNameMapExpansContent] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExpandIcon(value: String): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setExpanded(value: String): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

