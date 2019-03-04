package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var latitute: scala.Double
  var longitude: scala.Double
}

object Coordinate {
  @scala.inline
  def apply(latitute: scala.Double, longitude: scala.Double): Coordinate = {
    val __obj = js.Dynamic.literal(latitute = latitute, longitude = longitude)
  
    __obj.asInstanceOf[Coordinate]
  }
}

