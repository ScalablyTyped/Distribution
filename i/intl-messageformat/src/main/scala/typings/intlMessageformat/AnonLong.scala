package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLong extends js.Object {
  var full: AnonSecond
  var long: AnonSecond
  var medium: AnonMinute
  var short: AnonHour
}

object AnonLong {
  @scala.inline
  def apply(full: AnonSecond, long: AnonSecond, medium: AnonMinute, short: AnonHour): AnonLong = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLong]
  }
}

