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
  def apply(toDate: () => stdLib.Date, toEpochMilli: () => scala.Double): Anon_ToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
  
    __obj.asInstanceOf[Anon_ToDate]
  }
}

