package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  normal :std.Partial<gorilla-engine.GorillaEngine.UI.SliceStyle>,   hover :std.Partial<gorilla-engine.GorillaEngine.UI.SliceStyle>,   selected :std.Partial<gorilla-engine.GorillaEngine.UI.SliceStyle>}> */
trait PartialnormalPartialSlice extends StObject {
  
  var hover: js.UndefOr[PartialSliceStyle] = js.undefined
  
  var normal: js.UndefOr[PartialSliceStyle] = js.undefined
  
  var selected: js.UndefOr[PartialSliceStyle] = js.undefined
}
object PartialnormalPartialSlice {
  
  inline def apply(): PartialnormalPartialSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialnormalPartialSlice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialnormalPartialSlice] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PartialSliceStyle): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setNormal(value: PartialSliceStyle): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setSelected(value: PartialSliceStyle): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
