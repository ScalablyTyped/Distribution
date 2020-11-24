package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialStyleRulesInputAdo extends js.Object {
  
  var disablePointerEvents: js.UndefOr[CSSProperties] = js.native
  
  var filled: js.UndefOr[CSSProperties] = js.native
  
  var positionEnd: js.UndefOr[CSSProperties] = js.native
  
  var positionStart: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesInputAdo {
  
  @scala.inline
  def apply(): PartialStyleRulesInputAdo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesInputAdo]
  }
  
  @scala.inline
  implicit class PartialStyleRulesInputAdoOps[Self <: PartialStyleRulesInputAdo] (val x: Self) extends AnyVal {
    
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
    def setDisablePointerEvents(value: CSSProperties): Self = this.set("disablePointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePointerEvents: Self = this.set("disablePointerEvents", js.undefined)
    
    @scala.inline
    def setFilled(value: CSSProperties): Self = this.set("filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    
    @scala.inline
    def setPositionEnd(value: CSSProperties): Self = this.set("positionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionEnd: Self = this.set("positionEnd", js.undefined)
    
    @scala.inline
    def setPositionStart(value: CSSProperties): Self = this.set("positionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionStart: Self = this.set("positionStart", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
