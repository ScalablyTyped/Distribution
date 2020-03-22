package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: AnonFull
  var number: AnonCurrency
  var time: AnonLong
}

object AnonDate {
  @scala.inline
  def apply(date: AnonFull, number: AnonCurrency, time: AnonLong): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

