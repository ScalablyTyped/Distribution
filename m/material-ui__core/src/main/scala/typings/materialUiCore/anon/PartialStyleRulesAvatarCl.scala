package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Avatar.AvatarClassKey>> */
@js.native
trait PartialStyleRulesAvatarCl extends js.Object {
  
  var colorDefault: js.UndefOr[CSSProperties] = js.native
  
  var img: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesAvatarCl {
  
  @scala.inline
  def apply(): PartialStyleRulesAvatarCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesAvatarCl]
  }
  
  @scala.inline
  implicit class PartialStyleRulesAvatarClOps[Self <: PartialStyleRulesAvatarCl] (val x: Self) extends AnyVal {
    
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
    def setImg(value: CSSProperties): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
