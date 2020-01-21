package typings.ical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ical.icalStrings.VEVENT
  - typings.ical.icalStrings.VTODO
  - typings.ical.icalStrings.VJOURNAL
  - typings.ical.icalStrings.VFREEBUSY
  - typings.ical.icalStrings.VTIMEZONE
  - typings.ical.icalStrings.VALARM
*/
trait CalendarComponentType extends js.Object

object CalendarComponentType {
  @scala.inline
  def VALARM: typings.ical.icalStrings.VALARM = this.cast("VALARM")
  @scala.inline
  def VEVENT: typings.ical.icalStrings.VEVENT = this.cast("VEVENT")
  @scala.inline
  def VFREEBUSY: typings.ical.icalStrings.VFREEBUSY = this.cast("VFREEBUSY")
  @scala.inline
  def VJOURNAL: typings.ical.icalStrings.VJOURNAL = this.cast("VJOURNAL")
  @scala.inline
  def VTIMEZONE: typings.ical.icalStrings.VTIMEZONE = this.cast("VTIMEZONE")
  @scala.inline
  def VTODO: typings.ical.icalStrings.VTODO = this.cast("VTODO")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

