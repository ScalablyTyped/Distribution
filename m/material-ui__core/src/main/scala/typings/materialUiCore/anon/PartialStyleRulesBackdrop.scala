package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Backdrop.BackdropClassKey>> */
@js.native
trait PartialStyleRulesBackdrop extends js.Object {
  var invisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesBackdrop {
  @scala.inline
  def apply(): PartialStyleRulesBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBackdrop]
  }
  @scala.inline
  implicit class PartialStyleRulesBackdropOps[Self <: PartialStyleRulesBackdrop] (val x: Self) extends AnyVal {
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
    def setInvisible(value: CSSProperties): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

