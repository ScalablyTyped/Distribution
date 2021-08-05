package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayContentBackground extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var overlayContentBackground: js.UndefOr[String] = js.undefined
  
  var subtitleColor: js.UndefOr[String] = js.undefined
  
  var titleColor: js.UndefOr[String] = js.undefined
}
object OverlayContentBackground {
  
  inline def apply(): OverlayContentBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayContentBackground]
  }
  
  extension [Self <: OverlayContentBackground](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOverlayContentBackground(value: String): Self = StObject.set(x, "overlayContentBackground", value.asInstanceOf[js.Any])
    
    inline def setOverlayContentBackgroundUndefined: Self = StObject.set(x, "overlayContentBackground", js.undefined)
    
    inline def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
  }
}
