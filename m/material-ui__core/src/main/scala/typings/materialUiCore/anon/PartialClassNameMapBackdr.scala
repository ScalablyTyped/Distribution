package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey>> */
@js.native
trait PartialClassNameMapBackdr extends js.Object {
  var invisible: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapBackdr {
  @scala.inline
  def apply(): PartialClassNameMapBackdr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapBackdr]
  }
  @scala.inline
  implicit class PartialClassNameMapBackdrOps[Self <: PartialClassNameMapBackdr] (val x: Self) extends AnyVal {
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
    def setInvisible(value: String): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

