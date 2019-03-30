package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalDateTime")
@js.native
class LocalDateTime protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime {
  /* CompleteClass */
  override def adjustInto(temporal: js.Any): js.Any = js.native
  /* CompleteClass */
  override def chronology(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Chronology = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def toEpochSecond(offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): scala.Double = js.native
  /* CompleteClass */
  override def toInstant(offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
}

/* static members */
@JSImport("js-joda", "LocalDateTime")
@js.native
object LocalDateTime extends js.Object {
  var MAX: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def of(
    date: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate,
    time: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def of(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double | jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month],
    dayOfMonth: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    nanoSecond: js.UndefOr[scala.Double]
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def ofEpochSecond(
    epochSecond: scala.Double,
    nanoOfSecond: scala.Double,
    offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def ofEpochSecond(epochSecond: scala.Double, offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def ofInstant(
    instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant,
    zoneId: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
}

