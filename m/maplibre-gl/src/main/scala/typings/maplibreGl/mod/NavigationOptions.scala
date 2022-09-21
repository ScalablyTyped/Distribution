package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions extends StObject {
  
  var showCompass: js.UndefOr[Boolean] = js.undefined
  
  var showZoom: js.UndefOr[Boolean] = js.undefined
  
  var visualizePitch: js.UndefOr[Boolean] = js.undefined
}
object NavigationOptions {
  
  inline def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  extension [Self <: NavigationOptions](x: Self) {
    
    inline def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
    
    inline def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
    
    inline def setShowZoom(value: Boolean): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
    
    inline def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
    
    inline def setVisualizePitch(value: Boolean): Self = StObject.set(x, "visualizePitch", value.asInstanceOf[js.Any])
    
    inline def setVisualizePitchUndefined: Self = StObject.set(x, "visualizePitch", js.undefined)
  }
}
