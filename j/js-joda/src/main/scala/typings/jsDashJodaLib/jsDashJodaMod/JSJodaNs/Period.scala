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
    addTo: js.Any => js.Any,
    chronology: () => IsoChronology,
    days: () => scala.Double,
    equals: js.Any => scala.Boolean,
    get: TemporalUnit => scala.Double,
    hashCode: () => scala.Double,
    isNegative: () => scala.Boolean,
    isZero: () => scala.Boolean,
    minus: TemporalAmount => Period,
    minusDays: scala.Double => Period,
    minusMonths: scala.Double => Period,
    minusYears: scala.Double => Period,
    months: () => scala.Double,
    multipliedBy: scala.Double => Period,
    negated: () => Period,
    normalized: () => Period,
    plus: TemporalAmount => Period,
    plusDays: scala.Double => Period,
    plusMonths: scala.Double => Period,
    plusYears: scala.Double => Period,
    subtractFrom: js.Any => js.Any,
    toJSON: () => java.lang.String,
    toString: () => java.lang.String,
    toTotalMonths: () => scala.Double,
    units: () => js.Array[ChronoUnit],
    withDays: scala.Double => Period,
    withMonths: scala.Double => Period,
    withYears: scala.Double => Period,
    years: () => scala.Double
  ): Period = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), chronology = js.Any.fromFunction0(chronology), days = js.Any.fromFunction0(days), equals = js.Any.fromFunction1(equals), get = js.Any.fromFunction1(get), hashCode = js.Any.fromFunction0(hashCode), isNegative = js.Any.fromFunction0(isNegative), isZero = js.Any.fromFunction0(isZero), minus = js.Any.fromFunction1(minus), minusDays = js.Any.fromFunction1(minusDays), minusMonths = js.Any.fromFunction1(minusMonths), minusYears = js.Any.fromFunction1(minusYears), months = js.Any.fromFunction0(months), multipliedBy = js.Any.fromFunction1(multipliedBy), negated = js.Any.fromFunction0(negated), normalized = js.Any.fromFunction0(normalized), plus = js.Any.fromFunction1(plus), plusDays = js.Any.fromFunction1(plusDays), plusMonths = js.Any.fromFunction1(plusMonths), plusYears = js.Any.fromFunction1(plusYears), subtractFrom = js.Any.fromFunction1(subtractFrom), toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString), toTotalMonths = js.Any.fromFunction0(toTotalMonths), units = js.Any.fromFunction0(units), withDays = js.Any.fromFunction1(withDays), withMonths = js.Any.fromFunction1(withMonths), withYears = js.Any.fromFunction1(withYears), years = js.Any.fromFunction0(years))
  
    __obj.asInstanceOf[Period]
  }
}

