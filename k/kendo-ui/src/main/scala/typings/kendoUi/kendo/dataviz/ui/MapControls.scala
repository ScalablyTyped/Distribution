package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControls extends StObject {
  
  var attribution: js.UndefOr[Boolean | MapControlsAttribution] = js.undefined
  
  var navigator: js.UndefOr[Boolean | MapControlsNavigator] = js.undefined
  
  var zoom: js.UndefOr[Boolean | MapControlsZoom] = js.undefined
}
object MapControls {
  
  inline def apply(): MapControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControls]
  }
  
  extension [Self <: MapControls](x: Self) {
    
    inline def setAttribution(value: Boolean | MapControlsAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setNavigator(value: Boolean | MapControlsNavigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    inline def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
    
    inline def setZoom(value: Boolean | MapControlsZoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
