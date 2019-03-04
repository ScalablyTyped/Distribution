package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChronoField extends js.Object {
  def baseUnit(): scala.Double
  def checkValidIntValue(value: scala.Double): scala.Double
  def checkValidValue(value: scala.Double): js.Any
  def displayName(): java.lang.String
  def equals(other: js.Any): scala.Boolean
  def getFrom(temporal: TemporalAccessor): scala.Double
  def isDateBased(): scala.Boolean
  def isTimeBased(): scala.Boolean
  def name(): java.lang.String
  def range(): ValueRange
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange
  def rangeUnit(): scala.Double
}

object ChronoField {
  @scala.inline
  def apply(
    baseUnit: js.Function0[scala.Double],
    checkValidIntValue: js.Function1[scala.Double, scala.Double],
    checkValidValue: js.Function1[scala.Double, js.Any],
    displayName: js.Function0[java.lang.String],
    equals: js.Function1[js.Any, scala.Boolean],
    getFrom: js.Function1[TemporalAccessor, scala.Double],
    isDateBased: js.Function0[scala.Boolean],
    isTimeBased: js.Function0[scala.Boolean],
    name: js.Function0[java.lang.String],
    range: js.Function0[ValueRange],
    rangeRefinedBy: js.Function1[TemporalAccessor, ValueRange],
    rangeUnit: js.Function0[scala.Double],
    toString: js.Function0[java.lang.String]
  ): ChronoField = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit, checkValidIntValue = checkValidIntValue, checkValidValue = checkValidValue, displayName = displayName, equals = equals, getFrom = getFrom, isDateBased = isDateBased, isTimeBased = isTimeBased, name = name, range = range, rangeRefinedBy = rangeRefinedBy, rangeUnit = rangeUnit, toString = toString)
  
    __obj.asInstanceOf[ChronoField]
  }
}

