package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
class ZoneOffsetTransition protected () extends StObject {
  
  def compareTo(transition: ZoneOffsetTransition): Double = js.native
  
  def dateTimeAfter(): LocalDateTime = js.native
  
  def dateTimeBefore(): LocalDateTime = js.native
  
  def duration(): Duration = js.native
  
  def durationSeconds(): Double = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def instant(): Instant = js.native
  
  def isGap(): Boolean = js.native
  
  def isOverlap(): Boolean = js.native
  
  def isValidOffset(offset: ZoneOffset): Boolean = js.native
  
  def offsetAfter(): ZoneOffset = js.native
  
  def offsetBefore(): ZoneOffset = js.native
  
  def toEpochSecond(): Double = js.native
  
  def validOffsets(): js.Array[ZoneOffset] = js.native
}
object ZoneOffsetTransition {
  
  /* static member */
  @JSImport("js-joda", "ZoneOffsetTransition.of")
  @js.native
  def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition = js.native
}
