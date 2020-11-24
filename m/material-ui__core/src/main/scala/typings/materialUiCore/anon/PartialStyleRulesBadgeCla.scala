package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Badge.BadgeClassKey>> */
@js.native
trait PartialStyleRulesBadgeCla extends js.Object {
  
  var badge: js.UndefOr[CSSProperties] = js.native
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  
  var dot: js.UndefOr[CSSProperties] = js.native
  
  var invisible: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesBadgeCla {
  
  @scala.inline
  def apply(): PartialStyleRulesBadgeCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBadgeCla]
  }
  
  @scala.inline
  implicit class PartialStyleRulesBadgeClaOps[Self <: PartialStyleRulesBadgeCla] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: CSSProperties): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    
    @scala.inline
    def setDot(value: CSSProperties): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
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
