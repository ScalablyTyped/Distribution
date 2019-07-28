package typings.jsDashJoda

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToDate extends js.Object {
  def toDate(): Date
  def toEpochMilli(): Double
}

object Anon_ToDate {
  @scala.inline
  def apply(toDate: () => Date, toEpochMilli: () => Double): Anon_ToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
  
    __obj.asInstanceOf[Anon_ToDate]
  }
}

