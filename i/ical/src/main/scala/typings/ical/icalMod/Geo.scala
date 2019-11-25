package typings.ical.icalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geo extends js.Object {
  var lat: Double
  var lon: Double
}

object Geo {
  @scala.inline
  def apply(lat: Double, lon: Double): Geo = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geo]
  }
}

