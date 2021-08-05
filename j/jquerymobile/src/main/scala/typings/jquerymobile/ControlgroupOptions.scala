package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlgroupOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.undefined
  
  var excludeInvisible: js.UndefOr[Boolean] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ControlgroupOptions {
  
  inline def apply(): ControlgroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlgroupOptions]
  }
  
  extension [Self <: ControlgroupOptions](x: Self) {
    
    inline def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    inline def setExcludeInvisible(value: Boolean): Self = StObject.set(x, "excludeInvisible", value.asInstanceOf[js.Any])
    
    inline def setExcludeInvisibleUndefined: Self = StObject.set(x, "excludeInvisible", js.undefined)
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
