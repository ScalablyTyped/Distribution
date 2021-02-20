package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A latitude/longitude object.
  */
@js.native
trait MapLatLonObject extends StObject {
  
  /**
    * The latitude.
    */
  var lat: Double = js.native
  
  /**
    * The longitude.
    */
  var lon: Double = js.native
}
object MapLatLonObject {
  
  @scala.inline
  def apply(lat: Double, lon: Double): MapLatLonObject = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLatLonObject]
  }
  
  @scala.inline
  implicit class MapLatLonObjectMutableBuilder[Self <: MapLatLonObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
