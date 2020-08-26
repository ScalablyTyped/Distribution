package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey>> */
@js.native
trait PartialClassNameMapTabInd extends js.Object {
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTabInd {
  @scala.inline
  def apply(): PartialClassNameMapTabInd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTabInd]
  }
  @scala.inline
  implicit class PartialClassNameMapTabIndOps[Self <: PartialClassNameMapTabInd] (val x: Self) extends AnyVal {
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
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

