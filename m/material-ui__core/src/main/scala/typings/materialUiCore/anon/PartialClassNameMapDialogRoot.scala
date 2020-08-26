package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogTitle/DialogTitle.DialogTitleClassKey>> */
@js.native
trait PartialClassNameMapDialogRoot extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapDialogRoot {
  @scala.inline
  def apply(): PartialClassNameMapDialogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialogRoot]
  }
  @scala.inline
  implicit class PartialClassNameMapDialogRootOps[Self <: PartialClassNameMapDialogRoot] (val x: Self) extends AnyVal {
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

