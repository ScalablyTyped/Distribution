package typings
package intlDashMessageformatLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Anon_Date]
  }
}

