package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var text: java.lang.String
  var time_zone: java.lang.String
  var value: stdLib.Date
}

object Time {
  @scala.inline
  def apply(text: java.lang.String, time_zone: java.lang.String, value: stdLib.Date): Time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("time_zone")(time_zone)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Time]
  }
}

