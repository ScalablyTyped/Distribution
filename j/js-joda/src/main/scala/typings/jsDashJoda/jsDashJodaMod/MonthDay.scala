package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "MonthDay")
@js.native
class MonthDay protected () extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def atYear(year: Double): LocalDate = js.native
  def compareTo(other: MonthDay): Double = js.native
  def dayOfMonth(): Double = js.native
  def equals(obj: js.Any): Boolean = js.native
  def format(formatter: DateTimeFormatter): String = js.native
  def getLong(field: TemporalField): Double = js.native
  def isAfter(other: MonthDay): Boolean = js.native
  def isBefore(other: MonthDay): Boolean = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def isValidYear(year: Double): Boolean = js.native
  def month(): Month = js.native
  def monthValue(): Double = js.native
  def `with`(month: Month): MonthDay = js.native
  def withDayOfMonth(dayOfMonth: Double): MonthDay = js.native
  def withMonth(month: Double): MonthDay = js.native
}

/* static members */
@JSImport("js-joda", "MonthDay")
@js.native
object MonthDay extends js.Object {
  def from(temporal: TemporalAccessor): MonthDay = js.native
  def now(): MonthDay = js.native
  def now(arg1: Clock): MonthDay = js.native
  def now(arg1: ZoneId): MonthDay = js.native
  def of(monthOrNumber: Double): MonthDay = js.native
  def of(monthOrNumber: Double, number: Double): MonthDay = js.native
  def of(monthOrNumber: Month): MonthDay = js.native
  def of(monthOrNumber: Month, number: Double): MonthDay = js.native
  def ofMonthNumber(month: Month, dayOfMonth: Double): MonthDay = js.native
  def ofNumberNumber(month: Double, dayOfMonth: Double): MonthDay = js.native
  def parse(text: String): MonthDay = js.native
  def parse(text: String, formatter: DateTimeFormatter): MonthDay = js.native
  def parseString(text: String): MonthDay = js.native
  def parseStringFormatter(text: String, formatter: DateTimeFormatter): MonthDay = js.native
}

