package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Avatar.AvatarClassKey>> */
trait PartialStyleRulesAvatarCl extends StObject {
  
  var colorDefault: js.UndefOr[CSSProperties] = js.undefined
  
  var img: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesAvatarCl {
  
  @scala.inline
  def apply(): PartialStyleRulesAvatarCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesAvatarCl]
  }
  
  @scala.inline
  implicit class PartialStyleRulesAvatarClMutableBuilder[Self <: PartialStyleRulesAvatarCl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorDefault(value: CSSProperties): Self = StObject.set(x, "colorDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDefaultUndefined: Self = StObject.set(x, "colorDefault", js.undefined)
    
    @scala.inline
    def setImg(value: CSSProperties): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
