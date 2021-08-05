package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateOptions extends StObject {
  
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  var setView: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
}
object LocateOptions {
  
  inline def apply(): LocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateOptions]
  }
  
  extension [Self <: LocateOptions](x: Self) {
    
    inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setSetView(value: Boolean): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
    
    inline def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
