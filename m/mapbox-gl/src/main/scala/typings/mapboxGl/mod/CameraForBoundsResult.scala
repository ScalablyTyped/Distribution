package typings.mapboxGl.mod

import typings.mapboxGl.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<mapbox-gl.mapbox-gl.CameraOptions, 'zoom' | 'bearing'>> & {  center :{  lng :number,   lat :number}} */
trait CameraForBoundsResult extends StObject {
  
  var bearing: Double
  
  /** Map center */
  var center: Lat
  
  var zoom: Double
}
object CameraForBoundsResult {
  
  inline def apply(bearing: Double, center: Lat, zoom: Double): CameraForBoundsResult = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraForBoundsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraForBoundsResult] (val x: Self) extends AnyVal {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: Lat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
