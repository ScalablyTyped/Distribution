package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "ZoneRules")
@js.native
open class ZoneRules () extends StObject {
  
  def daylightSavings(instant: Instant): Duration = js.native
  
  def isDaylightSavings(instant: Instant): Boolean = js.native
  
  def isFixedOffset(): Boolean = js.native
  
  /**
    * Checks if the offset date-time is valid for these rules.
    *
    * To be valid, the local date-time must not be in a gap and the offset must match the
    * valid offsets.
    */
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = js.native
  
  def nextTransition(instant: Instant): ZoneOffsetTransition = js.native
  
  /**
    * Gets the offset applicable at the specified instant in these rules.
    *
    * The mapping from an instant to an offset is simple, there is only one valid offset
    * for each instant. This method returns that offset.
    */
  def offset(instant: Instant): ZoneOffset = js.native
  /**
    * Gets a suitable offset for the specified local date-time in these rules.
    *
    * The mapping from a local date-time to an offset is not straightforward. There are
    * three cases:
    * - Normal, with one valid offset. For the vast majority of the year, the normal case
    * applies, where there is a single valid offset for the local date-time.
    * - Gap, with zero valid offsets. This is when clocks jump forward typically due to the
    * spring daylight savings change from "winter" to "summer". In a gap there are local
    * date-time values with no valid offset.
    * - Overlap, with two valid offsets. This is when clocks are set back typically due to
    * the autumn daylight savings change from "summer" to "winter". In an overlap there are
    * local date-time values with two valid offsets.
    *
    * Thus, for any given local date-time there can be zero, one or two valid offsets. This
    * method returns the single offset in the Normal case, and in the Gap or Overlap case it
    * returns the offset before the transition.
    *
    * Since, in the case of Gap and Overlap, the offset returned is a "best" value, rather
    * than the "correct" value, it should be treated with care. Applications that care about
    * the correct offset should use a combination of this method, `getValidOffsets` and
    * `getTransition`.
    */
  def offset(localDateTime: LocalDateTime): ZoneOffset = js.native
  
  def offsetOfEpochMilli(epochMilli: Double): ZoneOffset = js.native
  
  def offsetOfInstant(instant: Instant): ZoneOffset = js.native
  
  def offsetOfLocalDateTime(localDateTime: LocalDateTime): ZoneOffset = js.native
  
  def previousTransition(instant: Instant): ZoneOffsetTransition = js.native
  
  def standardOffset(instant: Instant): ZoneOffset = js.native
  
  def toJSON(): String = js.native
  
  /**
    * Gets the offset transition applicable at the specified local date-time in these rules.
    *
    * The mapping from a local date-time to an offset is not straightforward. There are
    * three cases:
    * - Normal, with one valid offset. For the vast majority of the year, the normal case
    * applies, where there is a single valid offset for the local date-time.
    * - Gap, with zero valid offsets. This is when clocks jump forward typically due to the
    * spring daylight savings change from "winter" to "summer". In a gap there are local
    * date-time values with no valid offset.
    * - Overlap, with two valid offsets. This is when clocks are set back typically due to
    * the autumn daylight savings change from "summer" to "winter". In an overlap there are
    * local date-time values with two valid offsets.
    *
    * A transition is used to model the cases of a Gap or Overlap. The Normal case will return
    * `null`.
    *
    * There are various ways to handle the conversion from a `LocalDateTime`. One technique,
    * using this method, would be:
    * ```
    * const trans = rules.transition(localDT);
    * if (trans === null) {
    *     // Gap or Overlap: determine what to do from transition
    * } else {
    *     // Normal case: only one valid offset
    *     zoneOffset = rules.offset(localDT);
    * }
    * ```
    *
    * @returns the offset transition, `null` if the local date-time is not in transition.
    */
  def transition(localDateTime: LocalDateTime): ZoneOffsetTransition = js.native
  
  def transitionRules(): js.Array[ZoneOffsetTransitionRule] = js.native
  
  def transitions(): js.Array[ZoneOffsetTransition] = js.native
  
  /**
    * Gets the offset applicable at the specified local date-time in these rules.
    *
    * The mapping from a local date-time to an offset is not straightforward. There are
    * three cases:
    * - Normal, with one valid offset. For the vast majority of the year, the normal case
    * applies, where there is a single valid offset for the local date-time.
    * - Gap, with zero valid offsets. This is when clocks jump forward typically due to the
    * spring daylight savings change from "winter" to "summer". In a gap there are local
    * date-time values with no valid offset.
    * - Overlap, with two valid offsets. This is when clocks are set back typically due to
    * the autumn daylight savings change from "summer" to "winter". In an overlap there are
    * local date-time values with two valid offsets.
    *
    * Thus, for any given local date-time there can be zero, one or two valid offsets. This
    * method returns that list of valid offsets, which is a list of size 0, 1 or 2. In the
    * case where there are two offsets, the earlier offset is returned at index 0 and the
    * later offset at index 1.
    *
    * There are various ways to handle the conversion from a `LocalDateTime`. One technique,
    * using this method, would be:
    * ```
    * const validOffsets = rules.getOffset(localDT);
    * if (validOffsets.length === 1) {
    *     // Normal case: only one valid offset
    *     zoneOffset = validOffsets[0];
    * } else {
    *     // Gap or Overlap: determine what to do from transition
    *     const trans = rules.transition(localDT);
    * }
    * ```
    *
    * In theory, it is possible for there to be more than two valid offsets. This would happen
    * if clocks to be put back more than once in quick succession. This has never happened in
    * the history of time-zones and thus has no special handling. However, if it were to
    * happen, then the list would return more than 2 entries.
    */
  def validOffsets(localDateTime: LocalDateTime): js.Array[ZoneOffset] = js.native
}
/* static members */
object ZoneRules {
  
  @JSImport("@js-joda/core", "ZoneRules")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(offest: ZoneOffset): ZoneRules = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(offest.asInstanceOf[js.Any]).asInstanceOf[ZoneRules]
}
