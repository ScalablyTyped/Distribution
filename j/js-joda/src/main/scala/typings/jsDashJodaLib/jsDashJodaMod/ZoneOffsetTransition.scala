package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
class ZoneOffsetTransition protected () extends js.Object {
  def compareTo(transition: ZoneOffsetTransition): scala.Double = js.native
  def dateTimeAfter(): LocalDateTime = js.native
  def dateTimeBefore(): LocalDateTime = js.native
  def duration(): Duration = js.native
  def durationSeconds(): scala.Double = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def instant(): Instant = js.native
  def isGap(): scala.Boolean = js.native
  def isOverlap(): scala.Boolean = js.native
  def isValidOffset(offset: ZoneOffset): scala.Boolean = js.native
  def offsetAfter(): ZoneOffset = js.native
  def offsetBefore(): ZoneOffset = js.native
  def toEpochSecond(): scala.Double = js.native
  def validOffsets(): js.Array[ZoneOffset] = js.native
}

/* static members */
@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
object ZoneOffsetTransition extends js.Object {
  def of(
    transition: jsDashJodaLib.jsDashJodaMod.LocalDateTime,
    offsetBefore: jsDashJodaLib.jsDashJodaMod.ZoneOffset,
    offsetAfter: jsDashJodaLib.jsDashJodaMod.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.ZoneOffsetTransition = js.native
}

