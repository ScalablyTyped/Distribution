package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: Full
  var number: Currency
  var time: Long
}

object Date {
  @scala.inline
  def apply(date: Full, number: Currency, time: Long): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

