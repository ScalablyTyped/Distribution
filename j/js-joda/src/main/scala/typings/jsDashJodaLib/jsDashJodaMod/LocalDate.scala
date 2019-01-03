package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalDate")
@js.native
class LocalDate ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate {
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

@JSImport("js-joda", "LocalDate")
@js.native
object LocalDate extends js.Object {
  var EPOCH_0: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  var MAX: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def of(year: scala.Double, month: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def of(year: scala.Double, month: scala.Double, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def ofEpochDay(epochDay: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def ofInstant(
    instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant,
    zoneId: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def ofYearDay(year: scala.Double, dayOfYear: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
}

