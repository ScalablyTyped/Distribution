package typings.latlonDashGeohash.latlonDashGeohashMod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var lat: Double
  var lon: Double
}

object Point {
  @scala.inline
  def apply(lat: Double, lon: Double): Point = {
    val __obj = js.Dynamic.literal(lat = lat, lon = lon)
  
    __obj.asInstanceOf[Point]
  }
}

