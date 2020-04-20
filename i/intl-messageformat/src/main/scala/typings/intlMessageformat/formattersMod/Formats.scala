package typings.intlMessageformat.formattersMod

import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
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
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
}

