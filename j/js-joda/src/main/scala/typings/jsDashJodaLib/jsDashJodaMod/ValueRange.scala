package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ValueRange")
@js.native
class ValueRange protected () extends js.Object {
  def checkValidIntValue(value: scala.Double, field: TemporalField): scala.Double = js.native
  def checkValidValue(value: scala.Double, field: TemporalField): js.Any = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def isFixed(): scala.Boolean = js.native
  def isIntValue(): scala.Boolean = js.native
  def isValidIntValue(value: scala.Double): scala.Boolean = js.native
  def isValidValue(value: js.Any): scala.Boolean = js.native
  def largestMinimum(): scala.Double = js.native
  def maximum(): scala.Double = js.native
  def minimum(): scala.Double = js.native
  def smallestMaximum(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "ValueRange")
@js.native
object ValueRange extends js.Object {
  def of(
    minSmallest: scala.Double,
    minLargest: scala.Double,
    maxSmallest: scala.Double,
    maxLargest: scala.Double
  ): jsDashJodaLib.jsDashJodaMod.ValueRange = js.native
  def of(min: scala.Double, maxSmallest: scala.Double, maxLargest: scala.Double): jsDashJodaLib.jsDashJodaMod.ValueRange = js.native
  def of(min: scala.Double, max: scala.Double): jsDashJodaLib.jsDashJodaMod.ValueRange = js.native
}

