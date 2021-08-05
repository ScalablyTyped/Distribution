package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivOverlayOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[PointExpression] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
}
object DivOverlayOptions {
  
  inline def apply(): DivOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivOverlayOptions]
  }
  
  extension [Self <: DivOverlayOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOffset(value: PointExpression): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
    
    inline def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
  }
}
