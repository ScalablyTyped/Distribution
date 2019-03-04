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
    adjustInto: js.Function1[Temporal, Temporal],
    firstDayOfYear: js.Function1[scala.Boolean, scala.Double],
    firstMonthOfQuarter: js.Function0[Month],
    get: js.Function1[TemporalField, scala.Double],
    getDisplayName: js.Function2[TextStyle, Locale, java.lang.String],
    getLong: js.Function1[TemporalField, scala.Double],
    isSupported: js.Function1[TemporalField, scala.Boolean],
    length: js.Function1[scala.Boolean, scala.Double],
    maxLength: js.Function0[scala.Double],
    minLength: js.Function0[scala.Double],
    minus: js.Function1[scala.Double, Month],
    plus: js.Function1[scala.Double, Month],
    query: js.Function1[TemporalQuery, js.Any],
    range: js.Function1[TemporalField, ValueRange],
    toString: js.Function0[java.lang.String],
    value: js.Function0[scala.Double]
  ): Month = {
    val __obj = js.Dynamic.literal(adjustInto = adjustInto, firstDayOfYear = firstDayOfYear, firstMonthOfQuarter = firstMonthOfQuarter, get = get, getDisplayName = getDisplayName, getLong = getLong, isSupported = isSupported, length = length, maxLength = maxLength, minLength = minLength, minus = minus, plus = plus, query = query, range = range, toString = toString, value = value)
  
    __obj.asInstanceOf[Month]
  }
}

