package typings
package latlonDashGeohashLib.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var lat: scala.Double
  var lon: scala.Double
}

object Point {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lon")(lon)
    __obj.asInstanceOf[Point]
  }
}

