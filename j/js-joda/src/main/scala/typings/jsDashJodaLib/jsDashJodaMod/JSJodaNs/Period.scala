package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Period extends TemporalAmount {
  def chronology(): IsoChronology
  def days(): scala.Double
  def equals(obj: js.Any): scala.Boolean
  def isNegative(): scala.Boolean
  def isZero(): scala.Boolean
  def minus(amountToSubtract: TemporalAmount): Period
  def minusDays(daysToSubtract: scala.Double): Period
  def minusMonths(monthsToSubtract: scala.Double): Period
  def minusYears(yearsToSubtract: scala.Double): Period
  def months(): scala.Double
  def multipliedBy(scalar: scala.Double): Period
  def negated(): Period
  def normalized(): Period
  def plus(amountToAdd: TemporalAmount): Period
  def plusDays(daysToAdd: scala.Double): Period
  def plusMonths(monthsToAdd: scala.Double): Period
  def plusYears(yearsToAdd: scala.Double): Period
  def toJSON(): java.lang.String
  def toTotalMonths(): scala.Double
  def withDays(days: scala.Double): Period
  def withMonths(months: scala.Double): Period
  def withYears(years: scala.Double): Period
  def years(): scala.Double
}

object Period {
  @scala.inline
  def apply(
    addTo: js.Function1[js.Any, js.Any],
    chronology: js.Function0[IsoChronology],
    days: js.Function0[scala.Double],
    equals: js.Function1[js.Any, scala.Boolean],
    get: js.Function1[TemporalUnit, scala.Double],
    hashCode: js.Function0[scala.Double],
    isNegative: js.Function0[scala.Boolean],
    isZero: js.Function0[scala.Boolean],
    minus: js.Function1[TemporalAmount, Period],
    minusDays: js.Function1[scala.Double, Period],
    minusMonths: js.Function1[scala.Double, Period],
    minusYears: js.Function1[scala.Double, Period],
    months: js.Function0[scala.Double],
    multipliedBy: js.Function1[scala.Double, Period],
    negated: js.Function0[Period],
    normalized: js.Function0[Period],
    plus: js.Function1[TemporalAmount, Period],
    plusDays: js.Function1[scala.Double, Period],
    plusMonths: js.Function1[scala.Double, Period],
    plusYears: js.Function1[scala.Double, Period],
    subtractFrom: js.Function1[js.Any, js.Any],
    toJSON: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    toTotalMonths: js.Function0[scala.Double],
    units: js.Function0[js.Array[ChronoUnit]],
    withDays: js.Function1[scala.Double, Period],
    withMonths: js.Function1[scala.Double, Period],
    withYears: js.Function1[scala.Double, Period],
    years: js.Function0[scala.Double]
  ): Period = {
    val __obj = js.Dynamic.literal(addTo = addTo, chronology = chronology, days = days, equals = equals, get = get, hashCode = hashCode, isNegative = isNegative, isZero = isZero, minus = minus, minusDays = minusDays, minusMonths = minusMonths, minusYears = minusYears, months = months, multipliedBy = multipliedBy, negated = negated, normalized = normalized, plus = plus, plusDays = plusDays, plusMonths = plusMonths, plusYears = plusYears, subtractFrom = subtractFrom, toJSON = toJSON, toString = toString, toTotalMonths = toTotalMonths, units = units, withDays = withDays, withMonths = withMonths, withYears = withYears, years = years)
  
    __obj.asInstanceOf[Period]
  }
}

