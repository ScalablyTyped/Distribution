package typings.googlemaps.googleNs.mapsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var text: String
  var time_zone: String
  var value: Date
}

object Time {
  @scala.inline
  def apply(text: String, time_zone: String, value: Date): Time = {
    val __obj = js.Dynamic.literal(text = text, time_zone = time_zone, value = value)
  
    __obj.asInstanceOf[Time]
  }
}

