package typings
package jsDashJodaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToDate extends js.Object {
  def toDate(): stdLib.Date
  def toEpochMilli(): scala.Double
}

object Anon_ToDate {
  @scala.inline
  def apply(toDate: js.Function0[stdLib.Date], toEpochMilli: js.Function0[scala.Double]): Anon_ToDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDate")(toDate)
    __obj.updateDynamic("toEpochMilli")(toEpochMilli)
    __obj.asInstanceOf[Anon_ToDate]
  }
}

