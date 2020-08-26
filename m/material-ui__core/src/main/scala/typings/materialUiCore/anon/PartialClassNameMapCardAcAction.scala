package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActions/CardActions.CardActionsClassKey>> */
@js.native
trait PartialClassNameMapCardAcAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var disableActionSpacing: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapCardAcAction {
  @scala.inline
  def apply(): PartialClassNameMapCardAcAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardAcAction]
  }
  @scala.inline
  implicit class PartialClassNameMapCardAcActionOps[Self <: PartialClassNameMapCardAcAction] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDisableActionSpacing(value: String): Self = this.set("disableActionSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableActionSpacing: Self = this.set("disableActionSpacing", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

