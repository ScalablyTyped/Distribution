package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ValueRange")
@js.native
class ValueRange ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange {
  /* CompleteClass */
  override def checkValidIntValue(value: scala.Double, field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def checkValidValue(value: scala.Double, field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): js.Any = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def isFixed(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIntValue(): scala.Boolean = js.native
  /* CompleteClass */
  override def isValidIntValue(value: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def isValidValue(value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def largestMinimum(): scala.Double = js.native
  /* CompleteClass */
  override def maximum(): scala.Double = js.native
  /* CompleteClass */
  override def minimum(): scala.Double = js.native
  /* CompleteClass */
  override def smallestMaximum(): scala.Double = js.native
}

@JSImport("js-joda", "ValueRange")
@js.native
object ValueRange extends js.Object {
  def of(
    minSmallest: scala.Double,
    minLargest: scala.Double,
    maxSmallest: scala.Double,
    maxLargest: scala.Double
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  def of(min: scala.Double, maxSmallest: scala.Double, maxLargest: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  def of(min: scala.Double, max: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

