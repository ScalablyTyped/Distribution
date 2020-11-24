package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
@js.native
trait PartialStyleRulesCardActiFocusHighlight extends js.Object {
  
  var focusHighlight: js.UndefOr[CSSProperties] = js.native
  
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesCardActiFocusHighlight {
  
  @scala.inline
  def apply(): PartialStyleRulesCardActiFocusHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCardActiFocusHighlight]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCardActiFocusHighlightOps[Self <: PartialStyleRulesCardActiFocusHighlight] (val x: Self) extends AnyVal {
    
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
    def setFocusHighlight(value: CSSProperties): Self = this.set("focusHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusHighlight: Self = this.set("focusHighlight", js.undefined)
    
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
