package typings.ical.icalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ical.icalStrings.FREE
  - typings.ical.icalStrings.BUSY
*/
trait FreeBusyType extends js.Object

object FreeBusyType {
  @scala.inline
  def BUSY: typings.ical.icalStrings.BUSY = this.cast("BUSY")
  @scala.inline
  def FREE: typings.ical.icalStrings.FREE = this.cast("FREE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

