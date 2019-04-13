package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffset")
@js.native
class ZoneOffset protected () extends ZoneId {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def compareTo(other: ZoneOffset): scala.Double = js.native
  def get(field: TemporalField): scala.Double = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def query(query: TemporalQuery): js.Any = js.native
  def totalSeconds(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "ZoneOffset")
@js.native
object ZoneOffset extends js.Object {
  var MAX: jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  var MAX_SECONDS: jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  var UTC: jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def of(offsetId: java.lang.String): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def ofHours(hours: scala.Double): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def ofHoursMinutes(hours: scala.Double, minutes: scala.Double): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def ofHoursMinutesSeconds(hours: scala.Double, minutes: scala.Double, seconds: scala.Double): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def ofTotalMinutes(totalMinutes: scala.Double): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
  def ofTotalSeconds(totalSeconds: scala.Double): jsDashJodaLib.jsDashJodaMod.ZoneOffset = js.native
}

