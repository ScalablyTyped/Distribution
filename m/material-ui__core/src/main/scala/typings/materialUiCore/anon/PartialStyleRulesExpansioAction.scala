package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelActions.ExpansionPanelActionsClassKey>> */
@js.native
trait PartialStyleRulesExpansioAction extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesExpansioAction {
  @scala.inline
  def apply(): PartialStyleRulesExpansioAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesExpansioAction]
  }
  @scala.inline
  implicit class PartialStyleRulesExpansioActionOps[Self <: PartialStyleRulesExpansioAction] (val x: Self) extends AnyVal {
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
    def setAction(value: CSSProperties): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

