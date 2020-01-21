package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: AnonDayMonth
  var long: AnonDay
  var medium: AnonDay
  var short: AnonDay
}

object AnonFull {
  @scala.inline
  def apply(full: AnonDayMonth, long: AnonDay, medium: AnonDay, short: AnonDay): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFull]
  }
}

