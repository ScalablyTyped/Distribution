package typings.intlDashMessageformat.distFormattersMod

import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var date: Record[String, DateTimeFormatOptions]
  var number: Record[String, NumberFormatOptions]
  var time: Record[String, DateTimeFormatOptions]
}

object Formats {
  @scala.inline
  def apply(
    date: Record[String, DateTimeFormatOptions],
    number: Record[String, NumberFormatOptions],
    time: Record[String, DateTimeFormatOptions]
  ): Formats = {
    val __obj = js.Dynamic.literal(date = date, number = number, time = time)
  
    __obj.asInstanceOf[Formats]
  }
}

