package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardHeader.CardHeaderClassKey>> */
trait PartialStyleRulesCardHead extends StObject {
  
  var action: js.UndefOr[CSSProperties] = js.undefined
  
  var avatar: js.UndefOr[CSSProperties] = js.undefined
  
  var content: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var subheader: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCardHead {
  
  inline def apply(): PartialStyleRulesCardHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCardHead]
  }
  
  extension [Self <: PartialStyleRulesCardHead](x: Self) {
    
    inline def setAction(value: CSSProperties): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAvatar(value: CSSProperties): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSubheader(value: CSSProperties): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setTitle(value: CSSProperties): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
