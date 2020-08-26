package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridList/GridList.GridListClassKey>> */
@js.native
trait PartialClassNameMapGridLi extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapGridLi {
  @scala.inline
  def apply(): PartialClassNameMapGridLi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapGridLi]
  }
  @scala.inline
  implicit class PartialClassNameMapGridLiOps[Self <: PartialClassNameMapGridLi] (val x: Self) extends AnyVal {
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

