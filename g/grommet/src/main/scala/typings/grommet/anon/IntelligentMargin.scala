package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntelligentMargin extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[RadiusWidth] = js.undefined
  
  var intelligentMargin: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var shadowSize: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[String] = js.undefined
}
object IntelligentMargin {
  
  inline def apply(): IntelligentMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentMargin]
  }
  
  extension [Self <: IntelligentMargin](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: RadiusWidth): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setIntelligentMargin(value: Boolean): Self = StObject.set(x, "intelligentMargin", value.asInstanceOf[js.Any])
    
    inline def setIntelligentMarginUndefined: Self = StObject.set(x, "intelligentMargin", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setShadowSize(value: String): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    inline def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
