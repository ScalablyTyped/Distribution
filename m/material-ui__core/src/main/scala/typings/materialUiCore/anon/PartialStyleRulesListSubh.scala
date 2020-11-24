package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListSubheader.ListSubheaderClassKey>> */
@js.native
trait PartialStyleRulesListSubh extends js.Object {
  
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  
  var gutters: js.UndefOr[CSSProperties] = js.native
  
  var inset: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var sticky: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesListSubh {
  
  @scala.inline
  def apply(): PartialStyleRulesListSubh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListSubh]
  }
  
  @scala.inline
  implicit class PartialStyleRulesListSubhOps[Self <: PartialStyleRulesListSubh] (val x: Self) extends AnyVal {
    
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
    def setColorInherit(value: CSSProperties): Self = this.set("colorInherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInherit: Self = this.set("colorInherit", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    
    @scala.inline
    def setGutters(value: CSSProperties): Self = this.set("gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    
    @scala.inline
    def setInset(value: CSSProperties): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSticky(value: CSSProperties): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
  }
}
