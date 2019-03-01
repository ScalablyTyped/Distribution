package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends Coordinate {
  var radius: scala.Double
}

object Circle {
  @scala.inline
  def apply(latitute: scala.Double, longitude: scala.Double, radius: scala.Double): Circle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitute")(latitute)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("radius")(radius)
    __obj.asInstanceOf[Circle]
  }
}

