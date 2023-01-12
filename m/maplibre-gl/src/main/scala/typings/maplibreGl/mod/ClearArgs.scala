package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearArgs extends StObject {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var stencil: js.UndefOr[Double] = js.undefined
}
object ClearArgs {
  
  inline def apply(): ClearArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearArgs] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setStencil(value: Double): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
