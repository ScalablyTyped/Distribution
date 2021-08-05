package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Backdrop.BackdropClassKey>> */
trait PartialStyleRulesBackdrop extends StObject {
  
  var invisible: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesBackdrop {
  
  inline def apply(): PartialStyleRulesBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBackdrop]
  }
  
  extension [Self <: PartialStyleRulesBackdrop](x: Self) {
    
    inline def setInvisible(value: CSSProperties): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
