package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlMouseEvent extends StObject {
  
  var featureData: KmlFeatureData
  
  var latLng: LatLng
  
  var pixelOffset: Size
}
object KmlMouseEvent {
  
  inline def apply(featureData: KmlFeatureData, latLng: LatLng, pixelOffset: Size): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(featureData = featureData.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], pixelOffset = pixelOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlMouseEvent]
  }
  
  extension [Self <: KmlMouseEvent](x: Self) {
    
    inline def setFeatureData(value: KmlFeatureData): Self = StObject.set(x, "featureData", value.asInstanceOf[js.Any])
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
  }
}
