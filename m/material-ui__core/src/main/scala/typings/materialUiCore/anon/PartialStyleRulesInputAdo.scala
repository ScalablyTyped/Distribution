package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputAdornment.InputAdornmentClassKey>> */
trait PartialStyleRulesInputAdo extends StObject {
  
  var disablePointerEvents: js.UndefOr[CSSProperties] = js.undefined
  
  var filled: js.UndefOr[CSSProperties] = js.undefined
  
  var positionEnd: js.UndefOr[CSSProperties] = js.undefined
  
  var positionStart: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesInputAdo {
  
  inline def apply(): PartialStyleRulesInputAdo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesInputAdo]
  }
  
  extension [Self <: PartialStyleRulesInputAdo](x: Self) {
    
    inline def setDisablePointerEvents(value: CSSProperties): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
    
    inline def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
    
    inline def setFilled(value: CSSProperties): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setPositionEnd(value: CSSProperties): Self = StObject.set(x, "positionEnd", value.asInstanceOf[js.Any])
    
    inline def setPositionEndUndefined: Self = StObject.set(x, "positionEnd", js.undefined)
    
    inline def setPositionStart(value: CSSProperties): Self = StObject.set(x, "positionStart", value.asInstanceOf[js.Any])
    
    inline def setPositionStartUndefined: Self = StObject.set(x, "positionStart", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
