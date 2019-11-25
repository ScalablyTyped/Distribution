package typings.intlDashMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: Anon_Full
  var number: Anon_Currency
  var time: Anon_FullLong
}

object Anon_Date {
  @scala.inline
  def apply(date: Anon_Full, number: Anon_Currency, time: Anon_FullLong): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

