package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadviewOptions extends StObject {
  
  var pan: Double
  
  var panoId: Double
  
  var panoX: Double
  
  var panoY: Double
  
  var tilt: Double
  
  var zoom: Double
}
object RoadviewOptions {
  
  inline def apply(pan: Double, panoId: Double, panoX: Double, panoY: Double, tilt: Double, zoom: Double): RoadviewOptions = {
    val __obj = js.Dynamic.literal(pan = pan.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], panoX = panoX.asInstanceOf[js.Any], panoY = panoY.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadviewOptions]
  }
  
  extension [Self <: RoadviewOptions](x: Self) {
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanoId(value: Double): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    inline def setPanoX(value: Double): Self = StObject.set(x, "panoX", value.asInstanceOf[js.Any])
    
    inline def setPanoY(value: Double): Self = StObject.set(x, "panoY", value.asInstanceOf[js.Any])
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
