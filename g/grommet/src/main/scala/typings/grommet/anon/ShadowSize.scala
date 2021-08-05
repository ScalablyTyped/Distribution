package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowSize extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[Width] = js.undefined
  
  var shadowSize: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[String] = js.undefined
}
object ShadowSize {
  
  inline def apply(): ShadowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowSize]
  }
  
  extension [Self <: ShadowSize](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: Width): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setShadowSize(value: String): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    inline def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
