package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ChronoUnit")
@js.native
/* private */ open class ChronoUnit () extends TemporalUnit {
  
  /**
    * Compares this ChronoUnit to the specified {@link TemporalUnit}.
    * The comparison is based on the total length of the durations.
    */
  def compareTo(other: TemporalUnit): Double = js.native
}
/* static members */
object ChronoUnit {
  
  @JSImport("@js-joda/core", "ChronoUnit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Unit that represents the concept of a century. For the ISO calendar
    * system, it is equal to 100 years.
    */
  @JSImport("@js-joda/core", "ChronoUnit.CENTURIES")
  @js.native
  def CENTURIES: ChronoUnit = js.native
  inline def CENTURIES_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTURIES")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a day. For the ISO calendar system, it
    * is the standard day from midnight to midnight. The estimated duration of a day is 24 Hours.
    */
  @JSImport("@js-joda/core", "ChronoUnit.DAYS")
  @js.native
  def DAYS: ChronoUnit = js.native
  inline def DAYS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAYS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a decade. For the ISO calendar system,
    * it is equal to 10 years.
    */
  @JSImport("@js-joda/core", "ChronoUnit.DECADES")
  @js.native
  def DECADES: ChronoUnit = js.native
  inline def DECADES_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECADES")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of an era. The ISO calendar system doesn't
    * have eras thus it is impossible to add an era to a date or date-time. The estimated duration
    * of the era is artificially defined as 1,000,000,000 Years.
    */
  @JSImport("@js-joda/core", "ChronoUnit.ERAS")
  @js.native
  def ERAS: ChronoUnit = js.native
  inline def ERAS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERAS")(x.asInstanceOf[js.Any])
  
  /**
    * Artificial unit that represents the concept of forever. This is primarily
    * used with {@link TemporalField} to represent unbounded fields such as the year or era. The
    * estimated duration of the era is artificially defined as the largest duration supported by
    * {@link Duration}.
    */
  @JSImport("@js-joda/core", "ChronoUnit.FOREVER")
  @js.native
  def FOREVER: ChronoUnit = js.native
  inline def FOREVER_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREVER")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of half a day, as used in AM/PM. For
    * the ISO calendar system, it is equal to 12 hours.
    */
  @JSImport("@js-joda/core", "ChronoUnit.HALF_DAYS")
  @js.native
  def HALF_DAYS: ChronoUnit = js.native
  inline def HALF_DAYS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_DAYS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of an hour. For the ISO calendar system,
    * it is equal to 60 minutes.
    */
  @JSImport("@js-joda/core", "ChronoUnit.HOURS")
  @js.native
  def HOURS: ChronoUnit = js.native
  inline def HOURS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOURS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a microsecond. For the ISO calendar
    * system, it is equal to the 1,000,000th part of the second unit.
    */
  @JSImport("@js-joda/core", "ChronoUnit.MICROS")
  @js.native
  def MICROS: ChronoUnit = js.native
  inline def MICROS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICROS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a millennium. For the ISO calendar
    * system, it is equal to 1,000 years.
    */
  @JSImport("@js-joda/core", "ChronoUnit.MILLENNIA")
  @js.native
  def MILLENNIA: ChronoUnit = js.native
  inline def MILLENNIA_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLENNIA")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a millisecond. For the ISO calendar
    * system, it is equal to the 1000th part of the second unit.
    */
  @JSImport("@js-joda/core", "ChronoUnit.MILLIS")
  @js.native
  def MILLIS: ChronoUnit = js.native
  inline def MILLIS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLIS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a minute. For the ISO calendar system,
    * it is equal to 60 seconds.
    */
  @JSImport("@js-joda/core", "ChronoUnit.MINUTES")
  @js.native
  def MINUTES: ChronoUnit = js.native
  inline def MINUTES_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTES")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a month. For the ISO calendar system,
    * the length of the month varies by month-of-year. The estimated duration of a month is
    * one twelfth of 365.2425 Days.
    */
  @JSImport("@js-joda/core", "ChronoUnit.MONTHS")
  @js.native
  def MONTHS: ChronoUnit = js.native
  inline def MONTHS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTHS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a nanosecond, the smallest supported unit
    * of time. For the ISO calendar system, it is equal to the 1,000,000,000th part of the second unit.
    */
  @JSImport("@js-joda/core", "ChronoUnit.NANOS")
  @js.native
  def NANOS: ChronoUnit = js.native
  inline def NANOS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANOS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a second. For the ISO calendar system,
    * it is equal to the second in the SI system of units, except around a leap-second.
    */
  @JSImport("@js-joda/core", "ChronoUnit.SECONDS")
  @js.native
  def SECONDS: ChronoUnit = js.native
  inline def SECONDS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a week. For the ISO calendar system,
    * it is equal to 7 Days.
    */
  @JSImport("@js-joda/core", "ChronoUnit.WEEKS")
  @js.native
  def WEEKS: ChronoUnit = js.native
  inline def WEEKS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEKS")(x.asInstanceOf[js.Any])
  
  /**
    * Unit that represents the concept of a year. For the ISO calendar system, it
    * is equal to 12 months. The estimated duration of a year is 365.2425 Days.
    */
  @JSImport("@js-joda/core", "ChronoUnit.YEARS")
  @js.native
  def YEARS: ChronoUnit = js.native
  inline def YEARS_=(x: ChronoUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEARS")(x.asInstanceOf[js.Any])
}
