package typings
package intlDashMessageformatLib.libCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var date: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormatOptions]
  var number: stdLib.Record[java.lang.String, stdLib.IntlNs.NumberFormatOptions]
  var time: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormatOptions]
}

object Formats {
  @scala.inline
  def apply(
    date: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormatOptions],
    number: stdLib.Record[java.lang.String, stdLib.IntlNs.NumberFormatOptions],
    time: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormatOptions]
  ): Formats = {
    val __obj = js.Dynamic.literal(date = date, number = number, time = time)
  
    __obj.asInstanceOf[Formats]
  }
}

