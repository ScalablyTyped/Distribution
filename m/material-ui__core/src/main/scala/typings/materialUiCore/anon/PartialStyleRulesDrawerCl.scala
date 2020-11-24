package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Drawer.DrawerClassKey>> */
@js.native
trait PartialStyleRulesDrawerCl extends js.Object {
  
  var docked: js.UndefOr[CSSProperties] = js.native
  
  var modal: js.UndefOr[CSSProperties] = js.native
  
  var paper: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorBottom: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorDockedBottom: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorDockedLeft: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorDockedRight: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorDockedTop: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorLeft: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorRight: js.UndefOr[CSSProperties] = js.native
  
  var paperAnchorTop: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesDrawerCl {
  
  @scala.inline
  def apply(): PartialStyleRulesDrawerCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDrawerCl]
  }
  
  @scala.inline
  implicit class PartialStyleRulesDrawerClOps[Self <: PartialStyleRulesDrawerCl] (val x: Self) extends AnyVal {
    
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
    def setDocked(value: CSSProperties): Self = this.set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    
    @scala.inline
    def setModal(value: CSSProperties): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPaper(value: CSSProperties): Self = this.set("paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
    
    @scala.inline
    def setPaperAnchorBottom(value: CSSProperties): Self = this.set("paperAnchorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorBottom: Self = this.set("paperAnchorBottom", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedBottom(value: CSSProperties): Self = this.set("paperAnchorDockedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedBottom: Self = this.set("paperAnchorDockedBottom", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedLeft(value: CSSProperties): Self = this.set("paperAnchorDockedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedLeft: Self = this.set("paperAnchorDockedLeft", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedRight(value: CSSProperties): Self = this.set("paperAnchorDockedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedRight: Self = this.set("paperAnchorDockedRight", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedTop(value: CSSProperties): Self = this.set("paperAnchorDockedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedTop: Self = this.set("paperAnchorDockedTop", js.undefined)
    
    @scala.inline
    def setPaperAnchorLeft(value: CSSProperties): Self = this.set("paperAnchorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorLeft: Self = this.set("paperAnchorLeft", js.undefined)
    
    @scala.inline
    def setPaperAnchorRight(value: CSSProperties): Self = this.set("paperAnchorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorRight: Self = this.set("paperAnchorRight", js.undefined)
    
    @scala.inline
    def setPaperAnchorTop(value: CSSProperties): Self = this.set("paperAnchorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorTop: Self = this.set("paperAnchorTop", js.undefined)
  }
}
