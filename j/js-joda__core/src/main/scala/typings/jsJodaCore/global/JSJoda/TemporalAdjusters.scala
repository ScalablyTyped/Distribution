package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemporalAdjusters {
  
  @JSGlobal("JSJoda.TemporalAdjusters")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the day-of-week in month adjuster, which returns a new date in the same month with
    * the ordinal day-of-week. This is used for expressions like the 'second Tuesday in March'.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-12-15 for (1,TUESDAY) will return 2011-12-06.
    * - The input 2011-12-15 for (2,TUESDAY) will return 2011-12-13.
    * - The input 2011-12-15 for (3,TUESDAY) will return 2011-12-20.
    * - The input 2011-12-15 for (4,TUESDAY) will return 2011-12-27.
    * - The input 2011-12-15 for (5,TUESDAY) will return 2012-01-03.
    * - The input 2011-12-15 for (-1,TUESDAY) will return 2011-12-27 (last in month).
    * - The input 2011-12-15 for (-4,TUESDAY) will return 2011-12-06 (3 weeks before last in month).
    * - The input 2011-12-15 for (-5,TUESDAY) will return 2011-11-29 (4 weeks before last in month).
    * - The input 2011-12-15 for (0,TUESDAY) will return 2011-11-29 (last in previous month).
    *
    * For a positive or zero ordinal, the algorithm is equivalent to finding the first day-of-week
    * that matches within the month and then adding a number of weeks to it. For a negative
    * ordinal, the algorithm is equivalent to finding the last day-of-week that matches within the
    * month and then subtracting a number of weeks to it. The ordinal number of weeks is not
    * validated and is interpreted leniently according to this algorithm. This definition means
    * that an ordinal of zero finds the last matching day-of-week in the previous month.
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * and `DAY_OF_MONTH` fields and the `DAYS` unit, and assumes a seven day week.
    */
  inline def dayOfWeekInMonth(ordinal: Double, dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfWeekInMonth")(ordinal.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "first day of month" adjuster, which returns a new date set to the first day
    * of the current month.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2011-01-01.
    * - The input 2011-02-15 will return 2011-02-01.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * temporal.with(DAY_OF_MONTH, 1);
    * ```
    */
  inline def firstDayOfMonth(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfMonth")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "first day of next month" adjuster, which returns a new date set to the first
    * day of the next month.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2011-02-01.
    * - The input 2011-02-15 will return 2011-03-01.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * temporal.with(DAY_OF_MONTH, 1).plus(1, MONTHS);
    * ```
    */
  inline def firstDayOfNextMonth(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfNextMonth")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "first day of next year" adjuster, which returns a new date set to the first
    * day of the next year.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2012-01-01.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * temporal.with(DAY_OF_YEAR, 1).plus(1, YEARS);
    * ```
    */
  inline def firstDayOfNextYear(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfNextYear")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "first day of year" adjuster, which returns a new date set to the first day
    * of the current year.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2011-01-01.
    * - The input 2011-02-15 will return 2011-01-01.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * temporal.with(DAY_OF_YEAR, 1);
    * ```
    */
  inline def firstDayOfYear(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfYear")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the first in month adjuster, which returns a new date in the same month with the
    * first matching day-of-week. This is used for expressions like 'first Tuesday in March'.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-12-15 for (MONDAY) will return 2011-12-05.
    * - The input 2011-12-15 for (FRIDAY) will return 2011-12-02.
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * and `DAY_OF_MONTH` fields and the `DAYS` unit, and assumes a seven day week.
    */
  inline def firstInMonth(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("firstInMonth")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "last day of month" adjuster, which returns a new date set to the last day of
    * the current month.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2011-01-31.
    * - The input 2011-02-15 will return 2011-02-28.
    * - The input 2012-02-15 will return 2012-02-29 (leap year).
    * - The input 2011-04-15 will return 2011-04-30.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * const lastDay = temporal.range(DAY_OF_MONTH).getMaximum();
    * temporal.with(DAY_OF_MONTH, lastDay);
    * ```
    */
  inline def lastDayOfMonth(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the "last day of year" adjuster, which returns a new date set to the last day of
    * the current year.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 will return 2011-12-31.
    * - The input 2011-02-15 will return 2011-12-31.
    *
    * The behavior is suitable for use with most calendar systems. It is equivalent to:
    * ```
    * const lastDay = temporal.range(DAY_OF_YEAR).getMaximum();
    * temporal.with(DAY_OF_YEAR, lastDay);
    * ```
    */
  inline def lastDayOfYear(): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")().asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the last in month adjuster, which returns a new date in the same month with the
    * last matching day-of-week. This is used for expressions like 'last Tuesday in March'.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-12-15 for (MONDAY) will return 2011-12-26.
    * - The input 2011-12-15 for (FRIDAY) will return 2011-12-30.
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * and `DAY_OF_MONTH` fields and the `DAYS` unit, and assumes a seven day week.
    */
  inline def lastInMonth(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("lastInMonth")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the next day-of-week adjuster, which adjusts the date to the first occurrence of
    * the specified day-of-week after the date being adjusted.
    *
    * - The ISO calendar system behaves as follows:
    * - The input 2011-01-15 (a Saturday) for parameter (MONDAY) will return 2011-01-17 (two
    * days later).
    * - The input 2011-01-15 (a Saturday) for parameter (WEDNESDAY) will return 2011-01-19 (four
    * days later).
    * - The input 2011-01-15 (a Saturday) for parameter (SATURDAY) will return 2011-01-22 (seven
    * days later).
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * field and the `DAYS` unit, and assumes a seven day week.
    */
  inline def next(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the next-or-same day-of-week adjuster, which adjusts the date to the first
    * occurrence of the specified day-of-week after the date being adjusted unless it is already
    * on that day in which case the same object is returned.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 (a Saturday) for parameter (MONDAY) will return 2011-01-17 (two
    * days later).
    * - The input 2011-01-15 (a Saturday) for parameter (WEDNESDAY) will return 2011-01-19 (four
    * days later).
    * - The input 2011-01-15 (a Saturday) for parameter (SATURDAY) will return 2011-01-15 (same
    * as input).
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * field and the `DAYS` unit, and assumes a seven day week.
    */
  inline def nextOrSame(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("nextOrSame")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the previous day-of-week adjuster, which adjusts the date to the first occurrence
    * of the specified day-of-week before the date being adjusted.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 (a Saturday) for parameter (MONDAY) will return 2011-01-10 (five
    * days earlier).
    * - The input 2011-01-15 (a Saturday) for parameter (WEDNESDAY) will return 2011-01-12 (three
    * days earlier).
    * - The input 2011-01-15 (a Saturday) for parameter (SATURDAY) will return 2011-01-08 (seven
    * days earlier).
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK` field
    * and the `DAYS` unit, and assumes a seven day week.
    */
  inline def previous(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("previous")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
  
  /**
    * Returns the previous-or-same day-of-week adjuster, which adjusts the date to the first
    * occurrence of the specified day-of-week before the date being adjusted unless it is already
    * on that day in which case the same object is returned.
    *
    * The ISO calendar system behaves as follows:
    * - The input 2011-01-15 (a Saturday) for parameter (MONDAY) will return 2011-01-10 (five
    * days earlier).
    * - The input 2011-01-15 (a Saturday) for parameter (WEDNESDAY) will return 2011-01-12 (three
    * days earlier).
    * - The input 2011-01-15 (a Saturday) for parameter (SATURDAY) will return 2011-01-15 (same
    * as input).
    *
    * The behavior is suitable for use with most calendar systems. It uses the `DAY_OF_WEEK`
    * field and the `DAYS` unit, and assumes a seven day week.
    */
  inline def previousOrSame(dayOfWeek: typings.jsJodaCore.mod.DayOfWeek): typings.jsJodaCore.mod.TemporalAdjuster = ^.asInstanceOf[js.Dynamic].applyDynamic("previousOrSame")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.TemporalAdjuster]
}
