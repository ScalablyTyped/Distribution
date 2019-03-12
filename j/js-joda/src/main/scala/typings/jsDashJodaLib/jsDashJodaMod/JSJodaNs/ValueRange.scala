package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueRange extends js.Object {
  def checkValidIntValue(value: scala.Double, field: TemporalField): scala.Double
  def checkValidValue(value: scala.Double, field: TemporalField): js.Any
  def equals(other: js.Any): scala.Boolean
  def isFixed(): scala.Boolean
  def isIntValue(): scala.Boolean
  def isValidIntValue(value: scala.Double): scala.Boolean
  def isValidValue(value: js.Any): scala.Boolean
  def largestMinimum(): scala.Double
  def maximum(): scala.Double
  def minimum(): scala.Double
  def smallestMaximum(): scala.Double
}

object ValueRange {
  @scala.inline
  def apply(
    checkValidIntValue: (scala.Double, TemporalField) => scala.Double,
    checkValidValue: (scala.Double, TemporalField) => js.Any,
    equals: js.Any => scala.Boolean,
    hashCode: () => scala.Double,
    isFixed: () => scala.Boolean,
    isIntValue: () => scala.Boolean,
    isValidIntValue: scala.Double => scala.Boolean,
    isValidValue: js.Any => scala.Boolean,
    largestMinimum: () => scala.Double,
    maximum: () => scala.Double,
    minimum: () => scala.Double,
    smallestMaximum: () => scala.Double,
    toString: () => java.lang.String
  ): ValueRange = {
    val __obj = js.Dynamic.literal(checkValidIntValue = js.Any.fromFunction2(checkValidIntValue), checkValidValue = js.Any.fromFunction2(checkValidValue), equals = js.Any.fromFunction1(equals), hashCode = js.Any.fromFunction0(hashCode), isFixed = js.Any.fromFunction0(isFixed), isIntValue = js.Any.fromFunction0(isIntValue), isValidIntValue = js.Any.fromFunction1(isValidIntValue), isValidValue = js.Any.fromFunction1(isValidValue), largestMinimum = js.Any.fromFunction0(largestMinimum), maximum = js.Any.fromFunction0(maximum), minimum = js.Any.fromFunction0(minimum), smallestMaximum = js.Any.fromFunction0(smallestMaximum), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ValueRange]
  }
}

