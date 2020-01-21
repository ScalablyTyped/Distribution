package typings.lightpick.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lightpick.lightpickStrings.long
  - typings.lightpick.lightpickStrings.short
  - typings.lightpick.lightpickStrings.narrow
*/
trait WeekdayStyle extends js.Object

object WeekdayStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.lightpick.lightpickStrings.long = this.cast("long")
  @scala.inline
  def narrow: typings.lightpick.lightpickStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typings.lightpick.lightpickStrings.short = this.cast("short")
}

