package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ChronoField")
@js.native
/* private */ open class ChronoField ()
  extends typings.jsJodaCore.mod.ChronoField
/* static members */
object ChronoField {
  
  @JSGlobal("JSJoda.ChronoField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This represents concept of the count of
    * days within the period of a week where the weeks are aligned to the start of the month.
    * This field is typically used with `ALIGNED_WEEK_OF_MONTH`.
    */
  @JSGlobal("JSJoda.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_MONTH: typings.jsJodaCore.mod.ChronoField = js.native
  inline def ALIGNED_DAY_OF_WEEK_IN_MONTH_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This represents concept of the count of days
    * within the period of a week where the weeks are aligned to the start of the year.
    * This field is typically used with `ALIGNED_WEEK_OF_YEAR`.
    */
  @JSGlobal("JSJoda.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_YEAR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def ALIGNED_DAY_OF_WEEK_IN_YEAR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This represents concept of the count of weeks within
    * the period of a month where the weeks are aligned to the start of the month. This field
    * is typically used with `ALIGNED_DAY_OF_WEEK_IN_MONTH`.
    */
  @JSGlobal("JSJoda.ChronoField.ALIGNED_WEEK_OF_MONTH")
  @js.native
  def ALIGNED_WEEK_OF_MONTH: typings.jsJodaCore.mod.ChronoField = js.native
  inline def ALIGNED_WEEK_OF_MONTH_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * his represents concept of the count of weeks within
    * the period of a year where the weeks are aligned to the start of the year. This field
    * is typically used with `ALIGNED_DAY_OF_WEEK_IN_YEAR`.
    */
  @JSGlobal("JSJoda.ChronoField.ALIGNED_WEEK_OF_YEAR")
  @js.native
  def ALIGNED_WEEK_OF_YEAR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def ALIGNED_WEEK_OF_YEAR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the AM/PM within the day, from 0 (AM) to 1 (PM).
    */
  @JSGlobal("JSJoda.ChronoField.AMPM_OF_DAY")
  @js.native
  def AMPM_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def AMPM_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AMPM_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 1 to 12.
    * This is the hour that would be observed on a standard 12-hour analog wall clock.
    */
  @JSGlobal("JSJoda.ChronoField.CLOCK_HOUR_OF_AMPM")
  @js.native
  def CLOCK_HOUR_OF_AMPM: typings.jsJodaCore.mod.ChronoField = js.native
  inline def CLOCK_HOUR_OF_AMPM_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 1 to 24.
    * This is the hour that would be observed on a 24-hour analog wall clock.
    */
  @JSGlobal("JSJoda.ChronoField.CLOCK_HOUR_OF_DAY")
  @js.native
  def CLOCK_HOUR_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def CLOCK_HOUR_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the day within the month.
    * In the default ISO calendar system, this has values from 1 to 31 in most months.
    * April, June, September, November have days from 1 to 30, while February has days from
    * 1 to 28, or 29 in a leap year.
    */
  @JSGlobal("JSJoda.ChronoField.DAY_OF_MONTH")
  @js.native
  def DAY_OF_MONTH: typings.jsJodaCore.mod.ChronoField = js.native
  inline def DAY_OF_MONTH_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the standard concept of the day of the week.
    * In the default ISO calendar system, this has values from Monday (1) to Sunday (7).
    * The {@link DayOfWeek} class can be used to interpret the result.
    */
  @JSGlobal("JSJoda.ChronoField.DAY_OF_WEEK")
  @js.native
  def DAY_OF_WEEK: typings.jsJodaCore.mod.ChronoField = js.native
  inline def DAY_OF_WEEK_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_WEEK")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the day within the year.
    * In the default ISO calendar system, this has values from 1 to 365 in standard years and
    * 1 to 366 in leap years.
    */
  @JSGlobal("JSJoda.ChronoField.DAY_OF_YEAR")
  @js.native
  def DAY_OF_YEAR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def DAY_OF_YEAR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This field is the sequential count of days where
    * 1970-01-01 (ISO) is zero. Note that this uses the local time-line, ignoring offset and
    * time-zone.
    */
  @JSGlobal("JSJoda.ChronoField.EPOCH_DAY")
  @js.native
  def EPOCH_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def EPOCH_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the era, which is the largest
    * division of the time-line. This field is typically used with `YEAR_OF_ERA`.
    *
    * In the default ISO calendar system, there are two eras defined, 'BCE' and 'CE'. The era
    * 'CE' is the one currently in use and year-of-era runs from 1 to the maximum value.
    * The era 'BCE' is the previous era, and the year-of-era runs backwards.
    */
  @JSGlobal("JSJoda.ChronoField.ERA")
  @js.native
  def ERA: typings.jsJodaCore.mod.ChronoField = js.native
  inline def ERA_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERA")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 0 to 11.
    * This is the hour that would be observed on a standard 12-hour digital clock.
    */
  @JSGlobal("JSJoda.ChronoField.HOUR_OF_AMPM")
  @js.native
  def HOUR_OF_AMPM: typings.jsJodaCore.mod.ChronoField = js.native
  inline def HOUR_OF_AMPM_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the day, from 0 to 23. This is
    * the hour that would be observed on a standard 24-hour digital clock.
    */
  @JSGlobal("JSJoda.ChronoField.HOUR_OF_DAY")
  @js.native
  def HOUR_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def HOUR_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the sequential count of
    * seconds where `1970-01-01T00:00Z` (ISO) is zero. This field may be used with `NANO_OF_DAY`
    * to represent the fraction of the day.
    *
    * An Instant represents an instantaneous point on the time-line. On their own they have
    * no elements which allow a local date-time to be obtained. Only when paired with an offset
    * or time-zone can the local date or time be found. This field allows the seconds part of
    * the instant to be queried.
    */
  @JSGlobal("JSJoda.ChronoField.INSTANT_SECONDS")
  @js.native
  def INSTANT_SECONDS: typings.jsJodaCore.mod.ChronoField = js.native
  inline def INSTANT_SECONDS_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANT_SECONDS")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the microsecond within the day, from `0` to
    * `(24 * 60 * 60 * 1_000_000) - 1`.
    *
    * This field is used to represent the micro-of-day handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_DAY` filling unknown precision with zero.
    *
    * When this field is used for setting a value, it should behave in the same way as
    * setting `NANO_OF_DAY` with the value multiplied by 1,000.
    */
  @JSGlobal("JSJoda.ChronoField.MICRO_OF_DAY")
  @js.native
  def MICRO_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MICRO_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the microsecond within the second, from 0 to 999,999.
    *
    * This field is used to represent the micro-of-second handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_MINUTE`, `SECOND_OF_DAY` or `INSTANT_SECONDS` filling
    * unknown precision with zero.
    */
  @JSGlobal("JSJoda.ChronoField.MICRO_OF_SECOND")
  @js.native
  def MICRO_OF_SECOND: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MICRO_OF_SECOND_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the millisecond within the day, from 0 to
    * `(24 * 60 * 60 * 1,000) - 1`.
    *
    * This field is used to represent the milli-of-day handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_DAY` filling unknown precision with zero.
    *
    * When this field is used for setting a value, it should behave in the same way as
    * setting `NANO_OF_DAY` with the value multiplied by 1,000,000.
    */
  @JSGlobal("JSJoda.ChronoField.MILLI_OF_DAY")
  @js.native
  def MILLI_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MILLI_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the millisecond within the second, from 0 to
    * 999.
    *
    * This field is used to represent the milli-of-second handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they can
    * return a value for `SECOND_OF_MINUTE`, `SECOND_OF_DAY` or `INSTANT_SECONDS` filling unknown
    * precision with zero.
    *
    * When this field is used for setting a value, it should behave in the same way as
    * setting `NANO_OF_SECOND` with the value multiplied by 1,000,000.
    */
  @JSGlobal("JSJoda.ChronoField.MILLI_OF_SECOND")
  @js.native
  def MILLI_OF_SECOND: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MILLI_OF_SECOND_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the minute within the day, from 0 to `(24 * 60) - 1`.
    */
  @JSGlobal("JSJoda.ChronoField.MINUTE_OF_DAY")
  @js.native
  def MINUTE_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MINUTE_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the minute within the hour, from 0 to 59.
    */
  @JSGlobal("JSJoda.ChronoField.MINUTE_OF_HOUR")
  @js.native
  def MINUTE_OF_HOUR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MINUTE_OF_HOUR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_HOUR")(x.asInstanceOf[js.Any])
  
  /**
    * The month-of-year, such as March. This represents the concept
    * of the month within the year. In the default ISO calendar system, this has values from
    * January (1) to December (12).
    */
  @JSGlobal("JSJoda.ChronoField.MONTH_OF_YEAR")
  @js.native
  def MONTH_OF_YEAR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def MONTH_OF_YEAR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the nanosecond within the day, from 0 to
    * `(24 * 60 * 60 * 1,000,000,000) - 1`.
    *
    * This field is used to represent the nano-of-day handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_DAY` filling unknown precision with zero.
    */
  @JSGlobal("JSJoda.ChronoField.NANO_OF_DAY")
  @js.native
  def NANO_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def NANO_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the nanosecond within the second, from 0
    * to 999,999,999.
    *
    * This field is used to represent the nano-of-second handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_MINUTE`, `SECOND_OF_DAY` or `INSTANT_SECONDS` filling
    * unknown precision with zero.
    *
    * When this field is used for setting a value, it should set as much precision as the
    * object stores, using integer division to remove excess precision. For example, if the
    * {@link TemporalAccessor} stores time to millisecond precision, then the nano-of-second must
    * be divided by 1,000,000 before replacing the milli-of-second.
    */
  @JSGlobal("JSJoda.ChronoField.NANO_OF_SECOND")
  @js.native
  def NANO_OF_SECOND: typings.jsJodaCore.mod.ChronoField = js.native
  inline def NANO_OF_SECOND_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the offset in seconds of
    * local time from UTC/Greenwich.
    *
    * A {@link ZoneOffset} represents the period of time that local time differs from
    * UTC/Greenwich. This is usually a fixed number of hours and minutes. It is equivalent to
    * the total amount of the offset in seconds. For example, during the winter Paris has an
    * offset of +01:00, which is 3600 seconds.
    */
  @JSGlobal("JSJoda.ChronoField.OFFSET_SECONDS")
  @js.native
  def OFFSET_SECONDS: typings.jsJodaCore.mod.ChronoField = js.native
  inline def OFFSET_SECONDS_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_SECONDS")(x.asInstanceOf[js.Any])
  
  /**
    * The proleptic-month, which counts months sequentially
    * from year 0.
    *
    * The first month in year zero has the value zero. The value increase for later months
    * and decrease for earlier ones. Note that this uses the local time-line, ignoring offset
    * and time-zone.
    */
  @JSGlobal("JSJoda.ChronoField.PROLEPTIC_MONTH")
  @js.native
  def PROLEPTIC_MONTH: typings.jsJodaCore.mod.ChronoField = js.native
  inline def PROLEPTIC_MONTH_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROLEPTIC_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the second within the day, from 0 to
    * (24 * 60 * 60) - 1.
    */
  @JSGlobal("JSJoda.ChronoField.SECOND_OF_DAY")
  @js.native
  def SECOND_OF_DAY: typings.jsJodaCore.mod.ChronoField = js.native
  inline def SECOND_OF_DAY_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the second within the minute, from 0 to 59.
    */
  @JSGlobal("JSJoda.ChronoField.SECOND_OF_MINUTE")
  @js.native
  def SECOND_OF_MINUTE: typings.jsJodaCore.mod.ChronoField = js.native
  inline def SECOND_OF_MINUTE_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_MINUTE")(x.asInstanceOf[js.Any])
  
  /**
    * The proleptic year, such as 2012. This represents the concept of
    * the year, counting sequentially and using negative numbers. The proleptic year is not
    * interpreted in terms of the era.
    *
    * The standard mental model for a date is based on three concepts - year, month and day.
    * These map onto the `YEAR`, `MONTH_OF_YEAR` and `DAY_OF_MONTH` fields. Note that there is no
    * reference to eras. The full model for a date requires four concepts - era, year, month and
    * day. These map onto the `ERA`, `YEAR_OF_ERA`, `MONTH_OF_YEAR` and `DAY_OF_MONTH` fields.
    * Whether this field or `YEAR_OF_ERA` is used depends on which mental model is being used.
    */
  @JSGlobal("JSJoda.ChronoField.YEAR")
  @js.native
  def YEAR: typings.jsJodaCore.mod.ChronoField = js.native
  inline def YEAR_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the year within the era. This
    * field is typically used with `ERA`. The standard mental model for a date is based on three
    * concepts - year, month and day. These map onto the `YEAR`, `MONTH_OF_YEAR` and
    * `DAY_OF_MONTH` fields. Note that there is no reference to eras. The full model for a date
    * requires four concepts - era, year, month and day. These map onto the `ERA`, `YEAR_OF_ERA`,
    * `MONTH_OF_YEAR` and `DAY_OF_MONTH` fields. Whether this field or `YEAR` is used depends on
    * which mental model is being used.
    *
    * In the default ISO calendar system, there are two eras defined, 'BCE' and 'CE'.
    * The era 'CE' is the one currently in use and year-of-era runs from 1 to the maximum value.
    * The era 'BCE' is the previous era, and the year-of-era runs backwards.
    *
    * For example, subtracting a year each time yield the following:
    * - year-proleptic 2 = 'CE' year-of-era 2
    * - year-proleptic 1 = 'CE' year-of-era 1
    * - year-proleptic 0 = 'BCE' year-of-era 1
    * - year-proleptic -1 = 'BCE' year-of-era 2
    *
    * Note that the ISO-8601 standard does not actually define eras. Note also that the
    * ISO eras do not align with the well-known AD/BC eras due to the change between the Julian
    * and Gregorian calendar systems.
    */
  @JSGlobal("JSJoda.ChronoField.YEAR_OF_ERA")
  @js.native
  def YEAR_OF_ERA: typings.jsJodaCore.mod.ChronoField = js.native
  inline def YEAR_OF_ERA_=(x: typings.jsJodaCore.mod.ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR_OF_ERA")(x.asInstanceOf[js.Any])
}
