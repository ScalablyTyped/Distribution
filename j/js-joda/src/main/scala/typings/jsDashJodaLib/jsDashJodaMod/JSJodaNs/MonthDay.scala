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
    adjustInto: js.Function1[Temporal, Temporal],
    atYear: js.Function1[scala.Double, LocalDate],
    compareTo: js.Function1[MonthDay, scala.Double],
    dayOfMonth: js.Function0[scala.Double],
    equals: js.Function1[js.Any, scala.Boolean],
    format: js.Function1[DateTimeFormatter, java.lang.String],
    get: js.Function1[TemporalField, scala.Double],
    getLong: js.Function1[TemporalField, scala.Double],
    isAfter: js.Function1[MonthDay, scala.Boolean],
    isBefore: js.Function1[MonthDay, scala.Boolean],
    isSupported: js.Function1[TemporalField, scala.Boolean],
    isValidYear: js.Function1[scala.Double, scala.Boolean],
    month: js.Function0[Month],
    monthValue: js.Function0[scala.Double],
    query: js.Function1[TemporalQuery, js.Any],
    range: js.Function1[TemporalField, ValueRange],
    toString: js.Function0[java.lang.String],
    `with`: js.Function1[Month, MonthDay],
    withDayOfMonth: js.Function1[scala.Double, MonthDay],
    withMonth: js.Function1[scala.Double, MonthDay]
  ): MonthDay = {
    val __obj = js.Dynamic.literal(adjustInto = adjustInto, atYear = atYear, compareTo = compareTo, dayOfMonth = dayOfMonth, equals = equals, format = format, get = get, getLong = getLong, isAfter = isAfter, isBefore = isBefore, isSupported = isSupported, isValidYear = isValidYear, month = month, monthValue = monthValue, query = query, range = range, toString = toString, withDayOfMonth = withDayOfMonth, withMonth = withMonth)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[MonthDay]
  }
}

