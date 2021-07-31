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
  
  @scala.inline
  def apply(): LocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateOptions]
  }
  
  @scala.inline
  implicit class LocateOptionsMutableBuilder[Self <: LocateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    @scala.inline
    def setSetView(value: Boolean): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
