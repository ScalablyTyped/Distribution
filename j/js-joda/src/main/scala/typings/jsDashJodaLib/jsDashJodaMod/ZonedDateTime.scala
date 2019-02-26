package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZonedDateTime")
@js.native
class ZonedDateTime ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime {
  /* CompleteClass */
  override def compareTo(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Double = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def format(formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): java.lang.String = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def isAfter(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def isBefore(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def isEqual(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def query(query: js.Any): js.Any = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def toEpochSecond(): scala.Double = js.native
  /* CompleteClass */
  override def toInstant(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
}

/* static members */
@JSImport("js-joda", "ZonedDateTime")
@js.native
object ZonedDateTime extends js.Object {
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def of(): js.Any = js.native
  def of(
    date: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate,
    time: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def of(
    localDateTime: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def of(
    year: scala.Double,
    month: scala.Double,
    dayOfMonth: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double,
    nanoOfSecond: scala.Double,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofInstant(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofInstant(
    instant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofInstant(
    localDateTime: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofLocal(
    localDateTime: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofLocal(
    localDateTime: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId,
    preferredOffset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def ofStrict(
    localDateTime: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime = js.native
}

