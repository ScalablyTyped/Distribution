package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffsetTransition extends js.Object {
  def compareTo(transition: ZoneOffsetTransition): scala.Double
  def dateTimeAfter(): LocalDateTime
  def dateTimeBefore(): LocalDateTime
  def duration(): Duration
  def durationSeconds(): scala.Double
  def equals(other: js.Any): scala.Boolean
  def instant(): Instant
  def isGap(): scala.Boolean
  def isOverlap(): scala.Boolean
  def isValidOffset(offset: ZoneOffset): scala.Boolean
  def offsetAfter(): ZoneOffset
  def offsetBefore(): ZoneOffset
  def toEpochSecond(): scala.Double
  def validOffsets(): js.Array[ZoneOffset]
}

object ZoneOffsetTransition {
  @scala.inline
  def apply(
    compareTo: ZoneOffsetTransition => scala.Double,
    dateTimeAfter: () => LocalDateTime,
    dateTimeBefore: () => LocalDateTime,
    duration: () => Duration,
    durationSeconds: () => scala.Double,
    equals: js.Any => scala.Boolean,
    hashCode: () => scala.Double,
    instant: () => Instant,
    isGap: () => scala.Boolean,
    isOverlap: () => scala.Boolean,
    isValidOffset: ZoneOffset => scala.Boolean,
    offsetAfter: () => ZoneOffset,
    offsetBefore: () => ZoneOffset,
    toEpochSecond: () => scala.Double,
    toString: () => java.lang.String,
    validOffsets: () => js.Array[ZoneOffset]
  ): ZoneOffsetTransition = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), dateTimeAfter = js.Any.fromFunction0(dateTimeAfter), dateTimeBefore = js.Any.fromFunction0(dateTimeBefore), duration = js.Any.fromFunction0(duration), durationSeconds = js.Any.fromFunction0(durationSeconds), equals = js.Any.fromFunction1(equals), hashCode = js.Any.fromFunction0(hashCode), instant = js.Any.fromFunction0(instant), isGap = js.Any.fromFunction0(isGap), isOverlap = js.Any.fromFunction0(isOverlap), isValidOffset = js.Any.fromFunction1(isValidOffset), offsetAfter = js.Any.fromFunction0(offsetAfter), offsetBefore = js.Any.fromFunction0(offsetBefore), toEpochSecond = js.Any.fromFunction0(toEpochSecond), toString = js.Any.fromFunction0(toString), validOffsets = js.Any.fromFunction0(validOffsets))
  
    __obj.asInstanceOf[ZoneOffsetTransition]
  }
}

