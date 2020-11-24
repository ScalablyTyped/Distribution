package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/AppBar.AppBarClassKey>> */
@js.native
trait PartialStyleRulesAppBarCl extends js.Object {
  
  var colorDefault: js.UndefOr[CSSProperties] = js.native
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  
  var positionAbsolute: js.UndefOr[CSSProperties] = js.native
  
  var positionFixed: js.UndefOr[CSSProperties] = js.native
  
  var positionRelative: js.UndefOr[CSSProperties] = js.native
  
  var positionStatic: js.UndefOr[CSSProperties] = js.native
  
  var positionSticky: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesAppBarCl {
  
  @scala.inline
  def apply(): PartialStyleRulesAppBarCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesAppBarCl]
  }
  
  @scala.inline
  implicit class PartialStyleRulesAppBarClOps[Self <: PartialStyleRulesAppBarCl] (val x: Self) extends AnyVal {
    
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
    def setColorDefault(value: CSSProperties): Self = this.set("colorDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorDefault: Self = this.set("colorDefault", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    
    @scala.inline
    def setPositionAbsolute(value: CSSProperties): Self = this.set("positionAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionAbsolute: Self = this.set("positionAbsolute", js.undefined)
    
    @scala.inline
    def setPositionFixed(value: CSSProperties): Self = this.set("positionFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionFixed: Self = this.set("positionFixed", js.undefined)
    
    @scala.inline
    def setPositionRelative(value: CSSProperties): Self = this.set("positionRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionRelative: Self = this.set("positionRelative", js.undefined)
    
    @scala.inline
    def setPositionStatic(value: CSSProperties): Self = this.set("positionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionStatic: Self = this.set("positionStatic", js.undefined)
    
    @scala.inline
    def setPositionSticky(value: CSSProperties): Self = this.set("positionSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionSticky: Self = this.set("positionSticky", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
