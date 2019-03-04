package typings
package japaneseDashHolidaysLib.japaneseDashHolidaysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holiday extends js.Object {
  var date: scala.Double
  var month: scala.Double
  var name: java.lang.String
}

object Holiday {
  @scala.inline
  def apply(date: scala.Double, month: scala.Double, name: java.lang.String): Holiday = {
    val __obj = js.Dynamic.literal(date = date, month = month, name = name)
  
    __obj.asInstanceOf[Holiday]
  }
}

