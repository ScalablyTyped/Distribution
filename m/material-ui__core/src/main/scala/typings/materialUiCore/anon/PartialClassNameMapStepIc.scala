package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepIcon/StepIcon.StepIconClasskey>> */
@js.native
trait PartialClassNameMapStepIc extends js.Object {
  var active: js.UndefOr[String] = js.native
  var completed: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepIc {
  @scala.inline
  def apply(): PartialClassNameMapStepIc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapStepIc]
  }
  @scala.inline
  implicit class PartialClassNameMapStepIcOps[Self <: PartialClassNameMapStepIc] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCompleted(value: String): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

