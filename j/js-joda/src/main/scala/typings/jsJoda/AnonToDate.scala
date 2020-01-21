package typings.jsJoda

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToDate extends js.Object {
  def toDate(): Date
  def toEpochMilli(): Double
}

object AnonToDate {
  @scala.inline
  def apply(toDate: () => Date, toEpochMilli: () => Double): AnonToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
  
    __obj.asInstanceOf[AnonToDate]
  }
}

