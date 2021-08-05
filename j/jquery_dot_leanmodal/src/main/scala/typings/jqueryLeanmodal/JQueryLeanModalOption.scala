package typings.jqueryLeanmodal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryLeanModalOption extends StObject {
  
  var closeButton: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object JQueryLeanModalOption {
  
  inline def apply(): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
  
  extension [Self <: JQueryLeanModalOption](x: Self) {
    
    inline def setCloseButton(value: String): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setOverlay(value: Double): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
