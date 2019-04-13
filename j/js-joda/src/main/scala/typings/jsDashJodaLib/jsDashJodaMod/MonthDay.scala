package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "MonthDay")
@js.native
class MonthDay protected () extends Temporal {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def atYear(year: scala.Double): LocalDate = js.native
  def compareTo(other: MonthDay): scala.Double = js.native
  def dayOfMonth(): scala.Double = js.native
  def equals(obj: js.Any): scala.Boolean = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def isAfter(other: MonthDay): scala.Boolean = js.native
  def isBefore(other: MonthDay): scala.Boolean = js.native
  def isSupported(field: TemporalField): scala.Boolean = js.native
  def isValidYear(year: scala.Double): scala.Boolean = js.native
  def month(): Month = js.native
  def monthValue(): scala.Double = js.native
  def `with`(month: Month): MonthDay = js.native
  def withDayOfMonth(dayOfMonth: scala.Double): MonthDay = js.native
  def withMonth(month: scala.Double): MonthDay = js.native
}

/* static members */
@JSImport("js-joda", "MonthDay")
@js.native
object MonthDay extends js.Object {
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def now(arg1: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def now(arg1: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def of(monthOrNumber: jsDashJodaLib.jsDashJodaMod.Month): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def of(monthOrNumber: jsDashJodaLib.jsDashJodaMod.Month, number: scala.Double): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def of(monthOrNumber: scala.Double): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def of(monthOrNumber: scala.Double, number: scala.Double): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def ofMonthNumber(month: jsDashJodaLib.jsDashJodaMod.Month, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def ofNumberNumber(month: scala.Double, dayOfMonth: scala.Double): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def parseString(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
  def parseStringFormatter(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.MonthDay = js.native
}

