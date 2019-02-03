package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "MonthDay")
@js.native
class MonthDay ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay {
  /* CompleteClass */
  override def adjustInto(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal = js.native
  /* CompleteClass */
  override def atYear(year: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate = js.native
  /* CompleteClass */
  override def compareTo(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay): scala.Double = js.native
  /* CompleteClass */
  override def dayOfMonth(): scala.Double = js.native
  /* CompleteClass */
  override def equals(obj: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def format(formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): java.lang.String = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def getLong(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def isAfter(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay): scala.Boolean = js.native
  /* CompleteClass */
  override def isBefore(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay): scala.Boolean = js.native
  /* CompleteClass */
  override def isSupported(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Boolean = js.native
  /* CompleteClass */
  override def isValidYear(year: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def month(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  /* CompleteClass */
  override def monthValue(): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def `with`(month: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  /* CompleteClass */
  override def withDayOfMonth(dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  /* CompleteClass */
  override def withMonth(month: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
}

/* static members */
@JSImport("js-joda", "MonthDay")
@js.native
object MonthDay extends js.Object {
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def now(arg1: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def now(arg1: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def of(monthOrNumber: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def of(monthOrNumber: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month, number: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def of(monthOrNumber: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def of(monthOrNumber: scala.Double, number: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def ofMonthNumber(month: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def ofNumberNumber(month: scala.Double, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def parseString(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
  def parseStringFormatter(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.MonthDay = js.native
}

