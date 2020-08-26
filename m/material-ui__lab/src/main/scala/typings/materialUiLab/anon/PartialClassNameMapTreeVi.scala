package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TreeView/TreeView.TreeViewClassKey>> */
@js.native
trait PartialClassNameMapTreeVi extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTreeVi {
  @scala.inline
  def apply(): PartialClassNameMapTreeVi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTreeVi]
  }
  @scala.inline
  implicit class PartialClassNameMapTreeViOps[Self <: PartialClassNameMapTreeVi] (val x: Self) extends AnyVal {
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

