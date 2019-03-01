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
    checkValidIntValue: js.Function2[scala.Double, TemporalField, scala.Double],
    checkValidValue: js.Function2[scala.Double, TemporalField, js.Any],
    equals: js.Function1[js.Any, scala.Boolean],
    hashCode: js.Function0[scala.Double],
    isFixed: js.Function0[scala.Boolean],
    isIntValue: js.Function0[scala.Boolean],
    isValidIntValue: js.Function1[scala.Double, scala.Boolean],
    isValidValue: js.Function1[js.Any, scala.Boolean],
    largestMinimum: js.Function0[scala.Double],
    maximum: js.Function0[scala.Double],
    minimum: js.Function0[scala.Double],
    smallestMaximum: js.Function0[scala.Double],
    toString: js.Function0[java.lang.String]
  ): ValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkValidIntValue")(checkValidIntValue)
    __obj.updateDynamic("checkValidValue")(checkValidValue)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("hashCode")(hashCode)
    __obj.updateDynamic("isFixed")(isFixed)
    __obj.updateDynamic("isIntValue")(isIntValue)
    __obj.updateDynamic("isValidIntValue")(isValidIntValue)
    __obj.updateDynamic("isValidValue")(isValidValue)
    __obj.updateDynamic("largestMinimum")(largestMinimum)
    __obj.updateDynamic("maximum")(maximum)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("smallestMaximum")(smallestMaximum)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[ValueRange]
  }
}

