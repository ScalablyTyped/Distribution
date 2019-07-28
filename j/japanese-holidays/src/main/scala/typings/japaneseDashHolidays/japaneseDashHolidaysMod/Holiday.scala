package typings.japaneseDashHolidays.japaneseDashHolidaysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holiday extends js.Object {
  var date: Double
  var month: Double
  var name: String
}

object Holiday {
  @scala.inline
  def apply(date: Double, month: Double, name: String): Holiday = {
    val __obj = js.Dynamic.literal(date = date, month = month, name = name)
  
    __obj.asInstanceOf[Holiday]
  }
}

