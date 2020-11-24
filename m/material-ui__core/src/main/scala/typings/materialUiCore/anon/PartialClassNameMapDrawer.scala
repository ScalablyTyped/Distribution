package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey>> */
@js.native
trait PartialClassNameMapDrawer extends js.Object {
  
  var docked: js.UndefOr[String] = js.native
  
  var modal: js.UndefOr[String] = js.native
  
  var paper: js.UndefOr[String] = js.native
  
  var paperAnchorBottom: js.UndefOr[String] = js.native
  
  var paperAnchorDockedBottom: js.UndefOr[String] = js.native
  
  var paperAnchorDockedLeft: js.UndefOr[String] = js.native
  
  var paperAnchorDockedRight: js.UndefOr[String] = js.native
  
  var paperAnchorDockedTop: js.UndefOr[String] = js.native
  
  var paperAnchorLeft: js.UndefOr[String] = js.native
  
  var paperAnchorRight: js.UndefOr[String] = js.native
  
  var paperAnchorTop: js.UndefOr[String] = js.native
}
object PartialClassNameMapDrawer {
  
  @scala.inline
  def apply(): PartialClassNameMapDrawer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDrawer]
  }
  
  @scala.inline
  implicit class PartialClassNameMapDrawerOps[Self <: PartialClassNameMapDrawer] (val x: Self) extends AnyVal {
    
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
    def setDocked(value: String): Self = this.set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    
    @scala.inline
    def setModal(value: String): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPaper(value: String): Self = this.set("paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
    
    @scala.inline
    def setPaperAnchorBottom(value: String): Self = this.set("paperAnchorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorBottom: Self = this.set("paperAnchorBottom", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedBottom(value: String): Self = this.set("paperAnchorDockedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedBottom: Self = this.set("paperAnchorDockedBottom", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedLeft(value: String): Self = this.set("paperAnchorDockedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedLeft: Self = this.set("paperAnchorDockedLeft", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedRight(value: String): Self = this.set("paperAnchorDockedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedRight: Self = this.set("paperAnchorDockedRight", js.undefined)
    
    @scala.inline
    def setPaperAnchorDockedTop(value: String): Self = this.set("paperAnchorDockedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorDockedTop: Self = this.set("paperAnchorDockedTop", js.undefined)
    
    @scala.inline
    def setPaperAnchorLeft(value: String): Self = this.set("paperAnchorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorLeft: Self = this.set("paperAnchorLeft", js.undefined)
    
    @scala.inline
    def setPaperAnchorRight(value: String): Self = this.set("paperAnchorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorRight: Self = this.set("paperAnchorRight", js.undefined)
    
    @scala.inline
    def setPaperAnchorTop(value: String): Self = this.set("paperAnchorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaperAnchorTop: Self = this.set("paperAnchorTop", js.undefined)
  }
}
