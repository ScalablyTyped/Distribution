package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Popover/Popover.PopoverClassKey>> */
@js.native
trait PartialClassNameMapPopove extends js.Object {
  var paper: js.UndefOr[String] = js.native
}

object PartialClassNameMapPopove {
  @scala.inline
  def apply(): PartialClassNameMapPopove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapPopove]
  }
  @scala.inline
  implicit class PartialClassNameMapPopoveOps[Self <: PartialClassNameMapPopove] (val x: Self) extends AnyVal {
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
    def setPaper(value: String): Self = this.set("paper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
  }
  
}

