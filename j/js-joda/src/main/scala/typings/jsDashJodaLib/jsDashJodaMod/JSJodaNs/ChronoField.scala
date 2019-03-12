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
    baseUnit: () => scala.Double,
    checkValidIntValue: scala.Double => scala.Double,
    checkValidValue: scala.Double => js.Any,
    displayName: () => java.lang.String,
    equals: js.Any => scala.Boolean,
    getFrom: TemporalAccessor => scala.Double,
    isDateBased: () => scala.Boolean,
    isTimeBased: () => scala.Boolean,
    name: () => java.lang.String,
    range: () => ValueRange,
    rangeRefinedBy: TemporalAccessor => ValueRange,
    rangeUnit: () => scala.Double,
    toString: () => java.lang.String
  ): ChronoField = {
    val __obj = js.Dynamic.literal(baseUnit = js.Any.fromFunction0(baseUnit), checkValidIntValue = js.Any.fromFunction1(checkValidIntValue), checkValidValue = js.Any.fromFunction1(checkValidValue), displayName = js.Any.fromFunction0(displayName), equals = js.Any.fromFunction1(equals), getFrom = js.Any.fromFunction1(getFrom), isDateBased = js.Any.fromFunction0(isDateBased), isTimeBased = js.Any.fromFunction0(isTimeBased), name = js.Any.fromFunction0(name), range = js.Any.fromFunction0(range), rangeRefinedBy = js.Any.fromFunction1(rangeRefinedBy), rangeUnit = js.Any.fromFunction0(rangeUnit), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ChronoField]
  }
}

