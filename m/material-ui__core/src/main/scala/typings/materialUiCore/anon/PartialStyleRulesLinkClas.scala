package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey>> */
@js.native
trait PartialStyleRulesLinkClas extends js.Object {
  
  var button: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var underlineAlways: js.UndefOr[CSSProperties] = js.native
  
  var underlineHover: js.UndefOr[CSSProperties] = js.native
  
  var underlineNone: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesLinkClas {
  
  @scala.inline
  def apply(): PartialStyleRulesLinkClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesLinkClas]
  }
  
  @scala.inline
  implicit class PartialStyleRulesLinkClasOps[Self <: PartialStyleRulesLinkClas] (val x: Self) extends AnyVal {
    
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
    def setButton(value: CSSProperties): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setUnderlineAlways(value: CSSProperties): Self = this.set("underlineAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineAlways: Self = this.set("underlineAlways", js.undefined)
    
    @scala.inline
    def setUnderlineHover(value: CSSProperties): Self = this.set("underlineHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineHover: Self = this.set("underlineHover", js.undefined)
    
    @scala.inline
    def setUnderlineNone(value: CSSProperties): Self = this.set("underlineNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineNone: Self = this.set("underlineNone", js.undefined)
  }
}
