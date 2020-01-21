package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffset")
@js.native
class ZoneOffset protected () extends ZoneId {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def compareTo(other: ZoneOffset): Double = js.native
  def get(field: TemporalField): Double = js.native
  def getLong(field: TemporalField): Double = js.native
  def query(query: TemporalQuery): js.Any = js.native
  def totalSeconds(): Double = js.native
}

/* static members */
@JSImport("js-joda", "ZoneOffset")
@js.native
object ZoneOffset extends js.Object {
  var MAX: ZoneOffset = js.native
  var MAX_SECONDS: ZoneOffset = js.native
  var MIN: ZoneOffset = js.native
  var UTC: ZoneOffset = js.native
  def of(offsetId: String): ZoneOffset = js.native
  def ofHours(hours: Double): ZoneOffset = js.native
  def ofHoursMinutes(hours: Double, minutes: Double): ZoneOffset = js.native
  def ofHoursMinutesSeconds(hours: Double, minutes: Double, seconds: Double): ZoneOffset = js.native
  def ofTotalMinutes(totalMinutes: Double): ZoneOffset = js.native
  def ofTotalSeconds(totalSeconds: Double): ZoneOffset = js.native
}

