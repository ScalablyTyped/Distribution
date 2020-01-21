package typings.mapboxGeoViewport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoViewport extends js.Object {
  var center: js.Tuple2[Double, Double]
  var zoom: Double
}

object GeoViewport {
  @scala.inline
  def apply(center: js.Tuple2[Double, Double], zoom: Double): GeoViewport = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoViewport]
  }
}

