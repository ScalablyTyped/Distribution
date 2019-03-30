package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
class ZoneOffsetTransition protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffsetTransition {
  /* CompleteClass */
  override def compareTo(transition: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffsetTransition): scala.Double = js.native
  /* CompleteClass */
  override def dateTimeAfter(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  /* CompleteClass */
  override def dateTimeBefore(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime = js.native
  /* CompleteClass */
  override def duration(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  /* CompleteClass */
  override def durationSeconds(): scala.Double = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def instant(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  /* CompleteClass */
  override def isGap(): scala.Boolean = js.native
  /* CompleteClass */
  override def isOverlap(): scala.Boolean = js.native
  /* CompleteClass */
  override def isValidOffset(offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): scala.Boolean = js.native
  /* CompleteClass */
  override def offsetAfter(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  /* CompleteClass */
  override def offsetBefore(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  /* CompleteClass */
  override def toEpochSecond(): scala.Double = js.native
  /* CompleteClass */
  override def validOffsets(): js.Array[jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset] = js.native
}

/* static members */
@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
object ZoneOffsetTransition extends js.Object {
  def of(
    transition: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    offsetBefore: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset,
    offsetAfter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffsetTransition = js.native
}

