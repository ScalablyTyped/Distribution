package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Month extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal
  def firstDayOfYear(leapYear: scala.Boolean): scala.Double
  def firstMonthOfQuarter(): Month
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String
  def getLong(field: TemporalField): scala.Double
  def isSupported(field: TemporalField): scala.Boolean
  def length(leapYear: scala.Boolean): scala.Double
  def maxLength(): scala.Double
  def minLength(): scala.Double
  def minus(months: scala.Double): Month
  def plus(months: scala.Double): Month
  def value(): scala.Double
}

object Month {
  @scala.inline
  def apply(
    adjustInto: Temporal => Temporal,
    firstDayOfYear: scala.Boolean => scala.Double,
    firstMonthOfQuarter: () => Month,
    get: TemporalField => scala.Double,
    getDisplayName: (TextStyle, Locale) => java.lang.String,
    getLong: TemporalField => scala.Double,
    isSupported: TemporalField => scala.Boolean,
    length: scala.Boolean => scala.Double,
    maxLength: () => scala.Double,
    minLength: () => scala.Double,
    minus: scala.Double => Month,
    plus: scala.Double => Month,
    query: TemporalQuery => js.Any,
    range: TemporalField => ValueRange,
    toString: () => java.lang.String,
    value: () => scala.Double
  ): Month = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto), firstDayOfYear = js.Any.fromFunction1(firstDayOfYear), firstMonthOfQuarter = js.Any.fromFunction0(firstMonthOfQuarter), get = js.Any.fromFunction1(get), getDisplayName = js.Any.fromFunction2(getDisplayName), getLong = js.Any.fromFunction1(getLong), isSupported = js.Any.fromFunction1(isSupported), length = js.Any.fromFunction1(length), maxLength = js.Any.fromFunction0(maxLength), minLength = js.Any.fromFunction0(minLength), minus = js.Any.fromFunction1(minus), plus = js.Any.fromFunction1(plus), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range), toString = js.Any.fromFunction0(toString), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[Month]
  }
}

