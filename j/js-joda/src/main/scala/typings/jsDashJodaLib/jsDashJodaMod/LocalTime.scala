package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalTime")
@js.native
class LocalTime ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime {
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

/* static members */
@JSImport("js-joda", "LocalTime")
@js.native
object LocalTime extends js.Object {
  var HOURS_PER_DAY: scala.Double = js.native
  var MAX: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  var MICROS_PER_DAY: scala.Double = js.native
  var MIDNIGHT: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  var MILLIS_PER_DAY: scala.Double = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  var MINUTES_PER_DAY: scala.Double = js.native
  var MINUTES_PER_HOUR: scala.Double = js.native
  var NANOS_PER_DAY: scala.Double = js.native
  var NANOS_PER_HOUR: scala.Double = js.native
  var NANOS_PER_MINUTE: scala.Double = js.native
  var NANOS_PER_SECOND: scala.Double = js.native
  var NOON: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  var SECONDS_PER_DAY: scala.Double = js.native
  var SECONDS_PER_HOUR: scala.Double = js.native
  var SECONDS_PER_MINUTE: scala.Double = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def of(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def of(hour: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double, second: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double, second: scala.Double, nanoOfSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofInstant(
    instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofNanoOfDay(nanoOfDay: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofSecondOfDay(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofSecondOfDay(secondOfDay: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def ofSecondOfDay(secondOfDay: scala.Double, nanoOfSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime = js.native
}

