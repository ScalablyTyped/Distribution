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
    adjustInto: js.Function1[TemporalAdjuster, DayOfWeek],
    equals: js.Function1[js.Any, scala.Boolean],
    get: js.Function1[TemporalField, scala.Double],
    getDisplayName: js.Function2[TextStyle, Locale, java.lang.String],
    getLong: js.Function1[TemporalField, scala.Double],
    isSupported: js.Function1[TemporalField, scala.Boolean],
    minus: js.Function1[scala.Double, DayOfWeek],
    name: js.Function0[java.lang.String],
    ordinal: js.Function0[scala.Double],
    plus: js.Function1[scala.Double, DayOfWeek],
    query: js.Function1[TemporalQuery, js.Any],
    range: js.Function1[TemporalField, ValueRange],
    toString: js.Function0[java.lang.String],
    value: js.Function0[scala.Double]
  ): DayOfWeek = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustInto")(adjustInto)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getDisplayName")(getDisplayName)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("minus")(minus)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ordinal")(ordinal)
    __obj.updateDynamic("plus")(plus)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DayOfWeek]
  }
}

