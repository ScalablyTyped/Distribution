package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonth extends js.Object {
  var day: String
  var month: String
  var weekday: String
  var year: String
}

object AnonMonth {
  @scala.inline
  def apply(day: String, month: String, weekday: String, year: String): AnonMonth = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMonth]
  }
}

