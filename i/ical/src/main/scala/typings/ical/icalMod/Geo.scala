package typings.ical.icalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geo extends js.Object {
  var lat: Double
  var long: Double
}

object Geo {
  @scala.inline
  def apply(lat: Double, long: Double): Geo = {
    val __obj = js.Dynamic.literal(lat = lat, long = long)
  
    __obj.asInstanceOf[Geo]
  }
}

