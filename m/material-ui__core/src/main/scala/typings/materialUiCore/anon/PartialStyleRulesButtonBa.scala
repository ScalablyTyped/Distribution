package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseClassKey>> */
@js.native
trait PartialStyleRulesButtonBa extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesButtonBa {
  @scala.inline
  def apply(): PartialStyleRulesButtonBa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesButtonBa]
  }
  @scala.inline
  implicit class PartialStyleRulesButtonBaOps[Self <: PartialStyleRulesButtonBa] (val x: Self) extends AnyVal {
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
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocusVisible(value: CSSProperties): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

