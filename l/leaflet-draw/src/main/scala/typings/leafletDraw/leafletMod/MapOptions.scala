package typings.leafletDraw.leafletMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var drawControl: js.UndefOr[Boolean] = js.undefined
  
  var drawControlTooltips: js.UndefOr[Boolean] = js.undefined
  
  var touchExtend: js.UndefOr[Boolean] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setDrawControl(value: Boolean): Self = StObject.set(x, "drawControl", value.asInstanceOf[js.Any])
    
    inline def setDrawControlTooltips(value: Boolean): Self = StObject.set(x, "drawControlTooltips", value.asInstanceOf[js.Any])
    
    inline def setDrawControlTooltipsUndefined: Self = StObject.set(x, "drawControlTooltips", js.undefined)
    
    inline def setDrawControlUndefined: Self = StObject.set(x, "drawControl", js.undefined)
    
    inline def setTouchExtend(value: Boolean): Self = StObject.set(x, "touchExtend", value.asInstanceOf[js.Any])
    
    inline def setTouchExtendUndefined: Self = StObject.set(x, "touchExtend", js.undefined)
  }
}
