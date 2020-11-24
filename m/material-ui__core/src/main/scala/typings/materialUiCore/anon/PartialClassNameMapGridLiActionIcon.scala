package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey>> */
@js.native
trait PartialClassNameMapGridLiActionIcon extends js.Object {
  
  var actionIcon: js.UndefOr[String] = js.native
  
  var actionIconActionPosLeft: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var rootSubtitle: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titlePositionBottom: js.UndefOr[String] = js.native
  
  var titlePositionTop: js.UndefOr[String] = js.native
  
  var titleWrap: js.UndefOr[String] = js.native
  
  var titleWrapActionPosLeft: js.UndefOr[String] = js.native
  
  var titleWrapActionPosRight: js.UndefOr[String] = js.native
}
object PartialClassNameMapGridLiActionIcon {
  
  @scala.inline
  def apply(): PartialClassNameMapGridLiActionIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapGridLiActionIcon]
  }
  
  @scala.inline
  implicit class PartialClassNameMapGridLiActionIconOps[Self <: PartialClassNameMapGridLiActionIcon] (val x: Self) extends AnyVal {
    
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
    def setActionIcon(value: String): Self = this.set("actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionIcon: Self = this.set("actionIcon", js.undefined)
    
    @scala.inline
    def setActionIconActionPosLeft(value: String): Self = this.set("actionIconActionPosLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionIconActionPosLeft: Self = this.set("actionIconActionPosLeft", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootSubtitle(value: String): Self = this.set("rootSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootSubtitle: Self = this.set("rootSubtitle", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitlePositionBottom(value: String): Self = this.set("titlePositionBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePositionBottom: Self = this.set("titlePositionBottom", js.undefined)
    
    @scala.inline
    def setTitlePositionTop(value: String): Self = this.set("titlePositionTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePositionTop: Self = this.set("titlePositionTop", js.undefined)
    
    @scala.inline
    def setTitleWrap(value: String): Self = this.set("titleWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleWrap: Self = this.set("titleWrap", js.undefined)
    
    @scala.inline
    def setTitleWrapActionPosLeft(value: String): Self = this.set("titleWrapActionPosLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleWrapActionPosLeft: Self = this.set("titleWrapActionPosLeft", js.undefined)
    
    @scala.inline
    def setTitleWrapActionPosRight(value: String): Self = this.set("titleWrapActionPosRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleWrapActionPosRight: Self = this.set("titleWrapActionPosRight", js.undefined)
  }
}
