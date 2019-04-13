package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneRules")
@js.native
abstract class ZoneRules () extends js.Object {
  def daylightSavings(instant: Instant): Duration = js.native
  def isDaylightSavings(instant: Instant): scala.Boolean = js.native
  def isFixedOffset(): scala.Boolean = js.native
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): scala.Boolean = js.native
  def nextTransition(instant: Instant): ZoneOffsetTransition = js.native
  def offset(instantOrLocalDateTime: Instant): ZoneOffset = js.native
  def offset(instantOrLocalDateTime: LocalDateTime): ZoneOffset = js.native
  def offsetOfEpochMilli(epochMilli: scala.Double): ZoneOffset = js.native
  def offsetOfInstant(instant: Instant): ZoneOffset = js.native
  def offsetOfLocalDateTime(localDateTime: LocalDateTime): ZoneOffset = js.native
  def previousTransition(instant: Instant): ZoneOffsetTransition = js.native
  def standardOffset(instant: Instant): ZoneOffset = js.native
  def toJSON(): java.lang.String = js.native
  def transition(localDateTime: LocalDateTime): ZoneOffsetTransition = js.native
  def transitionRules(): js.Array[ZoneOffsetTransitionRule] = js.native
  def transitions(): js.Array[ZoneOffsetTransition] = js.native
  def validOffsets(localDateTime: LocalDateTime): js.Array[ZoneOffset] = js.native
}

/* static members */
@JSImport("js-joda", "ZoneRules")
@js.native
object ZoneRules extends js.Object {
  def of(offest: jsDashJodaLib.jsDashJodaMod.ZoneOffset): jsDashJodaLib.jsDashJodaMod.ZoneRules = js.native
}

