package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewpoint extends StObject {
  
  var pan: Double
  
  var panoId: js.UndefOr[Double] = js.undefined
  
  var tilt: Double
  
  var zoom: Double
}
object Viewpoint {
  
  inline def apply(pan: Double, tilt: Double, zoom: Double): Viewpoint = {
    val __obj = js.Dynamic.literal(pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewpoint]
  }
  
  extension [Self <: Viewpoint](x: Self) {
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanoId(value: Double): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    inline def setPanoIdUndefined: Self = StObject.set(x, "panoId", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
