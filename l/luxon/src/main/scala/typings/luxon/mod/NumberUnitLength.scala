package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luxon.luxonStrings.numeric
  - typings.luxon.luxonStrings.`2-digit`
*/
trait NumberUnitLength extends js.Object

object NumberUnitLength {
  @scala.inline
  def `2-digit`: typings.luxon.luxonStrings.`2-digit` = this.cast("2-digit")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def numeric: typings.luxon.luxonStrings.numeric = this.cast("numeric")
}

