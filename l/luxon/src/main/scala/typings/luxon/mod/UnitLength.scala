package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luxon.luxonStrings.narrow
  - typings.luxon.luxonStrings.short
  - typings.luxon.luxonStrings.long
  - typings.luxon.luxonStrings.numeric
  - typings.luxon.luxonStrings.`2-digit`
*/
trait UnitLength extends js.Object

object UnitLength {
  @scala.inline
  def `2-digit`: typings.luxon.luxonStrings.`2-digit` = this.cast("2-digit")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.luxon.luxonStrings.long = this.cast("long")
  @scala.inline
  def narrow: typings.luxon.luxonStrings.narrow = this.cast("narrow")
  @scala.inline
  def numeric: typings.luxon.luxonStrings.numeric = this.cast("numeric")
  @scala.inline
  def short: typings.luxon.luxonStrings.short = this.cast("short")
}

