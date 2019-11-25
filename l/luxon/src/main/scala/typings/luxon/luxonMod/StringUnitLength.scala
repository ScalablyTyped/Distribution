package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luxon.luxonStrings.narrow
  - typings.luxon.luxonStrings.short
  - typings.luxon.luxonStrings.long
*/
trait StringUnitLength extends js.Object

object StringUnitLength {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.luxon.luxonStrings.long = this.cast("long")
  @scala.inline
  def narrow: typings.luxon.luxonStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typings.luxon.luxonStrings.short = this.cast("short")
}

