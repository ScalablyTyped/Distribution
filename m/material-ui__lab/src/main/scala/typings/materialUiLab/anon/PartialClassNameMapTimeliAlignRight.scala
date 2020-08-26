package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TimelineOppositeContent/TimelineOppositeContent.TimelineOppositeContentClassKey>> */
@js.native
trait PartialClassNameMapTimeliAlignRight extends js.Object {
  var alignRight: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTimeliAlignRight {
  @scala.inline
  def apply(): PartialClassNameMapTimeliAlignRight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTimeliAlignRight]
  }
  @scala.inline
  implicit class PartialClassNameMapTimeliAlignRightOps[Self <: PartialClassNameMapTimeliAlignRight] (val x: Self) extends AnyVal {
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
    def setAlignRight(value: String): Self = this.set("alignRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignRight: Self = this.set("alignRight", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

