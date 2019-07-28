package typings.ibmDashMobilefirst.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends Coordinate {
  var radius: Double
}

object Circle {
  @scala.inline
  def apply(latitute: Double, longitude: Double, radius: Double): Circle = {
    val __obj = js.Dynamic.literal(latitute = latitute, longitude = longitude, radius = radius)
  
    __obj.asInstanceOf[Circle]
  }
}

