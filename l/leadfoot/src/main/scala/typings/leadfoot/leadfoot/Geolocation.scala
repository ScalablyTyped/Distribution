package typings.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that describes a geographical location.
	 */
trait Geolocation extends js.Object {
  /**
  		 * Altitude in meters above the WGS84 ellipsoid.
  		 */
  var altitude: Double
  /**
  		 * Latitude in WGS84 decimal coordinate system.
  		 */
  var latitude: Double
  /**
  		 * Longitude in WGS84 decimal coordinate system.
  		 */
  var longitude: Double
}

object Geolocation {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): Geolocation = {
    val __obj = js.Dynamic.literal(altitude = altitude, latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Geolocation]
  }
}

