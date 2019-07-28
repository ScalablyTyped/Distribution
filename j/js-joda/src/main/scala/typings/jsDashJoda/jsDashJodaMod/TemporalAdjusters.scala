package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "TemporalAdjusters")
@js.native
class TemporalAdjusters protected () extends js.Object

/* static members */
@JSImport("js-joda", "TemporalAdjusters")
@js.native
object TemporalAdjusters extends js.Object {
  def dayOfWeekInMonth(ordinal: Double, dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def firstDayOfMonth(): TemporalAdjuster = js.native
  def firstDayOfNextMonth(): TemporalAdjuster = js.native
  def firstDayOfNextYear(): TemporalAdjuster = js.native
  def firstDayOfYear(): TemporalAdjuster = js.native
  def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def lastDayOfMonth(): TemporalAdjuster = js.native
  def lastDayOfYear(): TemporalAdjuster = js.native
  def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def next(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def previousOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
}

