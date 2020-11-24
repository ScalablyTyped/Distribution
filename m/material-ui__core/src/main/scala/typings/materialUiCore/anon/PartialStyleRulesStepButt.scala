package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepButton.StepButtonClasskey>> */
@js.native
trait PartialStyleRulesStepButt extends js.Object {
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var touchRipple: js.UndefOr[CSSProperties] = js.native
  
  var vertical: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesStepButt {
  
  @scala.inline
  def apply(): PartialStyleRulesStepButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepButt]
  }
  
  @scala.inline
  implicit class PartialStyleRulesStepButtOps[Self <: PartialStyleRulesStepButt] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setTouchRipple(value: CSSProperties): Self = this.set("touchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRipple: Self = this.set("touchRipple", js.undefined)
    
    @scala.inline
    def setVertical(value: CSSProperties): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
