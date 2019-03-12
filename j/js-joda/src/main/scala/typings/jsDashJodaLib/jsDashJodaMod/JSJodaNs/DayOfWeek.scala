package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayOfWeek extends TemporalAccessor {
  def adjustInto(temporal: TemporalAdjuster): this.type
  def equals(other: js.Any): scala.Boolean
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String
  def getLong(field: TemporalField): scala.Double
  def isSupported(field: TemporalField): scala.Boolean
  def minus(days: scala.Double): DayOfWeek
  def name(): java.lang.String
  def ordinal(): scala.Double
  def plus(days: scala.Double): DayOfWeek
  def value(): scala.Double
}

object DayOfWeek {
  @scala.inline
  def apply(
    adjustInto: TemporalAdjuster => DayOfWeek,
    equals: js.Any => scala.Boolean,
    get: TemporalField => scala.Double,
    getDisplayName: (TextStyle, Locale) => java.lang.String,
    getLong: TemporalField => scala.Double,
    isSupported: TemporalField => scala.Boolean,
    minus: scala.Double => DayOfWeek,
    name: () => java.lang.String,
    ordinal: () => scala.Double,
    plus: scala.Double => DayOfWeek,
    query: TemporalQuery => js.Any,
    range: TemporalField => ValueRange,
    toString: () => java.lang.String,
    value: () => scala.Double
  ): DayOfWeek = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto), equals = js.Any.fromFunction1(equals), get = js.Any.fromFunction1(get), getDisplayName = js.Any.fromFunction2(getDisplayName), getLong = js.Any.fromFunction1(getLong), isSupported = js.Any.fromFunction1(isSupported), minus = js.Any.fromFunction1(minus), name = js.Any.fromFunction0(name), ordinal = js.Any.fromFunction0(ordinal), plus = js.Any.fromFunction1(plus), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range), toString = js.Any.fromFunction0(toString), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[DayOfWeek]
  }
}

