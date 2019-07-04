package typings
package intlDashMessageformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullLong extends js.Object {
  var full: Anon_HourMinuteSecond
  var long: Anon_HourMinuteSecond
  var medium: Anon_HourMinute
  var short: Anon_Hour
}

object Anon_FullLong {
  @scala.inline
  def apply(
    full: Anon_HourMinuteSecond,
    long: Anon_HourMinuteSecond,
    medium: Anon_HourMinute,
    short: Anon_Hour
  ): Anon_FullLong = {
    val __obj = js.Dynamic.literal(full = full, long = long, medium = medium, short = short)
  
    __obj.asInstanceOf[Anon_FullLong]
  }
}

