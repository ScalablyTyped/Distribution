package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepContent.StepContentClasskey>> */
@js.native
trait PartialStyleRulesStepCont extends js.Object {
  var last: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var transition: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesStepCont {
  @scala.inline
  def apply(): PartialStyleRulesStepCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepCont]
  }
  @scala.inline
  implicit class PartialStyleRulesStepContOps[Self <: PartialStyleRulesStepCont] (val x: Self) extends AnyVal {
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
    def setLast(value: CSSProperties): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setTransition(value: CSSProperties): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

