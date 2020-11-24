package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneRules")
@js.native
abstract class ZoneRules () extends js.Object {
  
  def daylightSavings(instant: Instant): Duration = js.native
  
  def isDaylightSavings(instant: Instant): Boolean = js.native
  
  def isFixedOffset(): Boolean = js.native
  
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = js.native
  
  def nextTransition(instant: Instant): ZoneOffsetTransition = js.native
  
  def offset(instantOrLocalDateTime: Instant): ZoneOffset = js.native
  def offset(instantOrLocalDateTime: LocalDateTime): ZoneOffset = js.native
  
  def offsetOfEpochMilli(epochMilli: Double): ZoneOffset = js.native
  
  def offsetOfInstant(instant: Instant): ZoneOffset = js.native
  
  def offsetOfLocalDateTime(localDateTime: LocalDateTime): ZoneOffset = js.native
  
  def previousTransition(instant: Instant): ZoneOffsetTransition = js.native
  
  def standardOffset(instant: Instant): ZoneOffset = js.native
  
  def toJSON(): String = js.native
  
  def transition(localDateTime: LocalDateTime): ZoneOffsetTransition = js.native
  
  def transitionRules(): js.Array[ZoneOffsetTransitionRule] = js.native
  
  def transitions(): js.Array[ZoneOffsetTransition] = js.native
  
  def validOffsets(localDateTime: LocalDateTime): js.Array[ZoneOffset] = js.native
}
/* static members */
@JSImport("js-joda", "ZoneRules")
@js.native
object ZoneRules extends js.Object {
  
  def of(offest: ZoneOffset): ZoneRules = js.native
}
