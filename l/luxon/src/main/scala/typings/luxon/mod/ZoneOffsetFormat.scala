package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luxon.luxonStrings.narrow
  - typings.luxon.luxonStrings.short
  - typings.luxon.luxonStrings.techie
*/
trait ZoneOffsetFormat extends js.Object

object ZoneOffsetFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def narrow: typings.luxon.luxonStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typings.luxon.luxonStrings.short = this.cast("short")
  @scala.inline
  def techie: typings.luxon.luxonStrings.techie = this.cast("techie")
}

