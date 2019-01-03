package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthDay extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal
  def atYear(year: scala.Double): LocalDate
  def compareTo(other: MonthDay): scala.Double
  def dayOfMonth(): scala.Double
  def equals(obj: js.Any): scala.Boolean
  def format(formatter: DateTimeFormatter): java.lang.String
  def getLong(field: TemporalField): scala.Double
  def isAfter(other: MonthDay): scala.Boolean
  def isBefore(other: MonthDay): scala.Boolean
  def isSupported(field: TemporalField): scala.Boolean
  def isValidYear(year: scala.Double): scala.Boolean
  def month(): Month
  def monthValue(): scala.Double
  def `with`(month: Month): MonthDay
  def withDayOfMonth(dayOfMonth: scala.Double): MonthDay
  def withMonth(month: scala.Double): MonthDay
}

