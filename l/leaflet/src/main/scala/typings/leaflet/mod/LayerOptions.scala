package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerOptions extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
}
object LayerOptions {
  
  inline def apply(): LayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptions]
  }
  
  extension [Self <: LayerOptions](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
