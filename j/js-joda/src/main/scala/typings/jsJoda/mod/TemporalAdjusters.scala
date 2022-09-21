package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "TemporalAdjusters")
@js.native
/* private */ open class TemporalAdjusters () extends StObject
object TemporalAdjusters {
  
  @JSImport("js-joda", "TemporalAdjusters")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def dayOfWeekInMonth(ordinal: Double, dayOfWeek: DayOfWeek): TemporalAdjuster = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfWeekInMonth")(ordinal.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any])).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def firstDayOfMonth(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfMonth")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def firstDayOfNextMonth(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfNextMonth")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def firstDayOfNextYear(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfNextYear")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def firstDayOfYear(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfYear")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstInMonth")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def lastDayOfMonth(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def lastDayOfYear(): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")().asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastInMonth")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def next(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("nextOrSame")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("previous")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
  
  /* static member */
  inline def previousOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("previousOrSame")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[TemporalAdjuster]
}
