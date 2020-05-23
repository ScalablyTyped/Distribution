package typings.mapboxGeoViewport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lat extends js.Object {
  var lat: Double
  var lon: Double
}

object Lat {
  @scala.inline
  def apply(lat: Double, lon: Double): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
}

