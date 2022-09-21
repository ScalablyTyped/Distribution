package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ChronoField")
@js.native
/* private */ open class ChronoField () extends TemporalField {
  
  /**
    * Checks that the specified value is valid for this field and
    * is within the range of a safe integer.
    */
  def checkValidIntValue(value: Double): Double = js.native
  
  /** Checks that the specified value is valid for this field. */
  def checkValidValue(value: Double): Double = js.native
}
/* static members */
object ChronoField {
  
  @JSImport("@js-joda/core", "ChronoField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This represents concept of the count of
    * days within the period of a week where the weeks are aligned to the start of the month.
    * This field is typically used with `ALIGNED_WEEK_OF_MONTH`.
    */
  @JSImport("@js-joda/core", "ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_MONTH: ChronoField = js.native
  inline def ALIGNED_DAY_OF_WEEK_IN_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This represents concept of the count of days
    * within the period of a week where the weeks are aligned to the start of the year.
    * This field is typically used with `ALIGNED_WEEK_OF_YEAR`.
    */
  @JSImport("@js-joda/core", "ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_YEAR: ChronoField = js.native
  inline def ALIGNED_DAY_OF_WEEK_IN_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This represents concept of the count of weeks within
    * the period of a month where the weeks are aligned to the start of the month. This field
    * is typically used with `ALIGNED_DAY_OF_WEEK_IN_MONTH`.
    */
  @JSImport("@js-joda/core", "ChronoField.ALIGNED_WEEK_OF_MONTH")
  @js.native
  def ALIGNED_WEEK_OF_MONTH: ChronoField = js.native
  inline def ALIGNED_WEEK_OF_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * his represents concept of the count of weeks within
    * the period of a year where the weeks are aligned to the start of the year. This field
    * is typically used with `ALIGNED_DAY_OF_WEEK_IN_YEAR`.
    */
  @JSImport("@js-joda/core", "ChronoField.ALIGNED_WEEK_OF_YEAR")
  @js.native
  def ALIGNED_WEEK_OF_YEAR: ChronoField = js.native
  inline def ALIGNED_WEEK_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the AM/PM within the day, from 0 (AM) to 1 (PM).
    */
  @JSImport("@js-joda/core", "ChronoField.AMPM_OF_DAY")
  @js.native
  def AMPM_OF_DAY: ChronoField = js.native
  inline def AMPM_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AMPM_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 1 to 12.
    * This is the hour that would be observed on a standard 12-hour analog wall clock.
    */
  @JSImport("@js-joda/core", "ChronoField.CLOCK_HOUR_OF_AMPM")
  @js.native
  def CLOCK_HOUR_OF_AMPM: ChronoField = js.native
  inline def CLOCK_HOUR_OF_AMPM_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 1 to 24.
    * This is the hour that would be observed on a 24-hour analog wall clock.
    */
  @JSImport("@js-joda/core", "ChronoField.CLOCK_HOUR_OF_DAY")
  @js.native
  def CLOCK_HOUR_OF_DAY: ChronoField = js.native
  inline def CLOCK_HOUR_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the day within the month.
    * In the default ISO calendar system, this has values from 1 to 31 in most months.
    * April, June, September, November have days from 1 to 30, while February has days from
    * 1 to 28, or 29 in a leap year.
    */
  @JSImport("@js-joda/core", "ChronoField.DAY_OF_MONTH")
  @js.native
  def DAY_OF_MONTH: ChronoField = js.native
  inline def DAY_OF_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the standard concept of the day of the week.
    * In the default ISO calendar system, this has values from Monday (1) to Sunday (7).
    * The {@link DayOfWeek} class can be used to interpret the result.
    */
  @JSImport("@js-joda/core", "ChronoField.DAY_OF_WEEK")
  @js.native
  def DAY_OF_WEEK: ChronoField = js.native
  inline def DAY_OF_WEEK_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_WEEK")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the day within the year.
    * In the default ISO calendar system, this has values from 1 to 365 in standard years and
    * 1 to 366 in leap years.
    */
  @JSImport("@js-joda/core", "ChronoField.DAY_OF_YEAR")
  @js.native
  def DAY_OF_YEAR: ChronoField = js.native
  inline def DAY_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This field is the sequential count of days where
    * 1970-01-01 (ISO) is zero. Note that this uses the local time-line, ignoring offset and
    * time-zone.
    */
  @JSImport("@js-joda/core", "ChronoField.EPOCH_DAY")
  @js.native
  def EPOCH_DAY: ChronoField = js.native
  inline def EPOCH_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the era, which is the largest
    * division of the time-line. This field is typically used with `YEAR_OF_ERA`.
    *
    * In the default ISO calendar system, there are two eras defined, 'BCE' and 'CE'. The era
    * 'CE' is the one currently in use and year-of-era runs from 1 to the maximum value.
    * The era 'BCE' is the previous era, and the year-of-era runs backwards.
    */
  @JSImport("@js-joda/core", "ChronoField.ERA")
  @js.native
  def ERA: ChronoField = js.native
  inline def ERA_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERA")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the AM/PM, from 0 to 11.
    * This is the hour that would be observed on a standard 12-hour digital clock.
    */
  @JSImport("@js-joda/core", "ChronoField.HOUR_OF_AMPM")
  @js.native
  def HOUR_OF_AMPM: ChronoField = js.native
  inline def HOUR_OF_AMPM_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the hour within the day, from 0 to 23. This is
    * the hour that would be observed on a standard 24-hour digital clock.
    */
  @JSImport("@js-joda/core", "ChronoField.HOUR_OF_DAY")
  @js.native
  def HOUR_OF_DAY: ChronoField = js.native
  inline def HOUR_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.INSTANT_SECONDS")
  @js.native
  def INSTANT_SECONDS: ChronoField = js.native
  inline def INSTANT_SECONDS_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANT_SECONDS")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.MICRO_OF_DAY")
  @js.native
  def MICRO_OF_DAY: ChronoField = js.native
  inline def MICRO_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the microsecond within the second, from 0 to 999,999.
    *
    * This field is used to represent the micro-of-second handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_MINUTE`, `SECOND_OF_DAY` or `INSTANT_SECONDS` filling
    * unknown precision with zero.
    */
  @JSImport("@js-joda/core", "ChronoField.MICRO_OF_SECOND")
  @js.native
  def MICRO_OF_SECOND: ChronoField = js.native
  inline def MICRO_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_SECOND")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.MILLI_OF_DAY")
  @js.native
  def MILLI_OF_DAY: ChronoField = js.native
  inline def MILLI_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_DAY")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.MILLI_OF_SECOND")
  @js.native
  def MILLI_OF_SECOND: ChronoField = js.native
  inline def MILLI_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the minute within the day, from 0 to `(24 * 60) - 1`.
    */
  @JSImport("@js-joda/core", "ChronoField.MINUTE_OF_DAY")
  @js.native
  def MINUTE_OF_DAY: ChronoField = js.native
  inline def MINUTE_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the minute within the hour, from 0 to 59.
    */
  @JSImport("@js-joda/core", "ChronoField.MINUTE_OF_HOUR")
  @js.native
  def MINUTE_OF_HOUR: ChronoField = js.native
  inline def MINUTE_OF_HOUR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_HOUR")(x.asInstanceOf[js.Any])
  
  /**
    * The month-of-year, such as March. This represents the concept
    * of the month within the year. In the default ISO calendar system, this has values from
    * January (1) to December (12).
    */
  @JSImport("@js-joda/core", "ChronoField.MONTH_OF_YEAR")
  @js.native
  def MONTH_OF_YEAR: ChronoField = js.native
  inline def MONTH_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the nanosecond within the day, from 0 to
    * `(24 * 60 * 60 * 1,000,000,000) - 1`.
    *
    * This field is used to represent the nano-of-day handling any fraction of the second.
    * Implementations of {@link TemporalAccessor} should provide a value for this field if they
    * can return a value for `SECOND_OF_DAY` filling unknown precision with zero.
    */
  @JSImport("@js-joda/core", "ChronoField.NANO_OF_DAY")
  @js.native
  def NANO_OF_DAY: ChronoField = js.native
  inline def NANO_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_DAY")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.NANO_OF_SECOND")
  @js.native
  def NANO_OF_SECOND: ChronoField = js.native
  inline def NANO_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /**
    * This represents the concept of the offset in seconds of
    * local time from UTC/Greenwich.
    *
    * A {@link ZoneOffset} represents the period of time that local time differs from
    * UTC/Greenwich. This is usually a fixed number of hours and minutes. It is equivalent to
    * the total amount of the offset in seconds. For example, during the winter Paris has an
    * offset of +01:00, which is 3600 seconds.
    */
  @JSImport("@js-joda/core", "ChronoField.OFFSET_SECONDS")
  @js.native
  def OFFSET_SECONDS: ChronoField = js.native
  inline def OFFSET_SECONDS_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_SECONDS")(x.asInstanceOf[js.Any])
  
  /**
    * The proleptic-month, which counts months sequentially
    * from year 0.
    *
    * The first month in year zero has the value zero. The value increase for later months
    * and decrease for earlier ones. Note that this uses the local time-line, ignoring offset
    * and time-zone.
    */
  @JSImport("@js-joda/core", "ChronoField.PROLEPTIC_MONTH")
  @js.native
  def PROLEPTIC_MONTH: ChronoField = js.native
  inline def PROLEPTIC_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROLEPTIC_MONTH")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the second within the day, from 0 to
    * (24 * 60 * 60) - 1.
    */
  @JSImport("@js-joda/core", "ChronoField.SECOND_OF_DAY")
  @js.native
  def SECOND_OF_DAY: ChronoField = js.native
  inline def SECOND_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_DAY")(x.asInstanceOf[js.Any])
  
  /**
    * This counts the second within the minute, from 0 to 59.
    */
  @JSImport("@js-joda/core", "ChronoField.SECOND_OF_MINUTE")
  @js.native
  def SECOND_OF_MINUTE: ChronoField = js.native
  inline def SECOND_OF_MINUTE_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_MINUTE")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.YEAR")
  @js.native
  def YEAR: ChronoField = js.native
  inline def YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
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
  @JSImport("@js-joda/core", "ChronoField.YEAR_OF_ERA")
  @js.native
  def YEAR_OF_ERA: ChronoField = js.native
  inline def YEAR_OF_ERA_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR_OF_ERA")(x.asInstanceOf[js.Any])
}
