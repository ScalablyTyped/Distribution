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

object MonthDay {
  @scala.inline
  def apply(
    adjustInto: Temporal => Temporal,
    atYear: scala.Double => LocalDate,
    compareTo: MonthDay => scala.Double,
    dayOfMonth: () => scala.Double,
    equals: js.Any => scala.Boolean,
    format: DateTimeFormatter => java.lang.String,
    get: TemporalField => scala.Double,
    getLong: TemporalField => scala.Double,
    isAfter: MonthDay => scala.Boolean,
    isBefore: MonthDay => scala.Boolean,
    isSupported: TemporalField => scala.Boolean,
    isValidYear: scala.Double => scala.Boolean,
    month: () => Month,
    monthValue: () => scala.Double,
    query: TemporalQuery => js.Any,
    range: TemporalField => ValueRange,
    toString: () => java.lang.String,
    `with`: Month => MonthDay,
    withDayOfMonth: scala.Double => MonthDay,
    withMonth: scala.Double => MonthDay
  ): MonthDay = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto), atYear = js.Any.fromFunction1(atYear), compareTo = js.Any.fromFunction1(compareTo), dayOfMonth = js.Any.fromFunction0(dayOfMonth), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), get = js.Any.fromFunction1(get), getLong = js.Any.fromFunction1(getLong), isAfter = js.Any.fromFunction1(isAfter), isBefore = js.Any.fromFunction1(isBefore), isSupported = js.Any.fromFunction1(isSupported), isValidYear = js.Any.fromFunction1(isValidYear), month = js.Any.fromFunction0(month), monthValue = js.Any.fromFunction0(monthValue), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range), toString = js.Any.fromFunction0(toString), withDayOfMonth = js.Any.fromFunction1(withDayOfMonth), withMonth = js.Any.fromFunction1(withMonth))
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[MonthDay]
  }
}

