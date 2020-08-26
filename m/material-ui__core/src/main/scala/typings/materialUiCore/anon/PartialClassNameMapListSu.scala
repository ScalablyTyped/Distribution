package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListSubheader/ListSubheader.ListSubheaderClassKey>> */
@js.native
trait PartialClassNameMapListSu extends js.Object {
  var colorInherit: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var gutters: js.UndefOr[String] = js.native
  var inset: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var sticky: js.UndefOr[String] = js.native
}

object PartialClassNameMapListSu {
  @scala.inline
  def apply(): PartialClassNameMapListSu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapListSu]
  }
  @scala.inline
  implicit class PartialClassNameMapListSuOps[Self <: PartialClassNameMapListSu] (val x: Self) extends AnyVal {
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
    def setColorInherit(value: String): Self = this.set("colorInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInherit: Self = this.set("colorInherit", js.undefined)
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setGutters(value: String): Self = this.set("gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    @scala.inline
    def setInset(value: String): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSticky(value: String): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
  }
  
}

