package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "LocalDate")
@js.native
/* private */ open class LocalDate () extends ChronoLocalDate {
  
  def atStartOfDay(): LocalDateTime = js.native
  def atStartOfDay(zone: ZoneId): ZonedDateTime = js.native
  
  def atTime(hour: Double, minute: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: Double, nanoOfSecond: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: Unit, nanoOfSecond: Double): LocalDateTime = js.native
  def atTime(time: LocalTime): LocalDateTime = js.native
  def atTime(time: OffsetTime): OffsetDateTime = js.native
  
  def chronology(): Chronology = js.native
  
  def compareTo(other: LocalDate): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def isAfter(other: LocalDate): Boolean = js.native
  
  def isBefore(other: LocalDate): Boolean = js.native
  
  def isEqual(other: LocalDate): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  def isoWeekOfWeekyear(): Double = js.native
  
  def isoWeekyear(): Double = js.native
  
  def lengthOfMonth(): Double = js.native
  
  def lengthOfYear(): Double = js.native
  
  def minusDays(daysToSubtract: Double): LocalDate = js.native
  
  def minusMonths(monthsToSubtract: Double): LocalDate = js.native
  
  def minusWeeks(weeksToSubtract: Double): LocalDate = js.native
  
  def minusYears(yearsToSubtract: Double): LocalDate = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def plusDays(daysToAdd: Double): LocalDate = js.native
  
  def plusMonths(monthsToAdd: Double): LocalDate = js.native
  
  def plusWeeks(weeksToAdd: Double): LocalDate = js.native
  
  def plusYears(yearsToAdd: Double): LocalDate = js.native
  
  def toEpochDay(): Double = js.native
  
  def toJSON(): String = js.native
  
  def until(endDate: TemporalAccessor): Period = js.native
  
  def withDayOfMonth(dayOfMonth: Double): LocalDate = js.native
  
  def withDayOfYear(dayOfYear: Double): LocalDate = js.native
  
  def withMonth(month: Double): LocalDate = js.native
  def withMonth(month: Month): LocalDate = js.native
  
  def withYear(year: Double): LocalDate = js.native
  
  def year(): Double = js.native
}
/* static members */
object LocalDate {
  
  @JSImport("@js-joda/core", "LocalDate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "LocalDate.EPOCH_0")
  @js.native
  def EPOCH_0: LocalDate = js.native
  inline def EPOCH_0_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_0")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalDate.FROM")
  @js.native
  def FROM: TemporalQuery[LocalDate] = js.native
  inline def FROM_=(x: TemporalQuery[LocalDate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalDate.MAX")
  @js.native
  def MAX: LocalDate = js.native
  inline def MAX_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalDate.MIN")
  @js.native
  def MIN: LocalDate = js.native
  inline def MIN_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  inline def now(): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[LocalDate]
  inline def now(clockOrZone: Clock): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  inline def now(clockOrZone: ZoneId): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  inline def of(year: Double, month: Double, dayOfMonth: Double): LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[LocalDate]
  inline def of(year: Double, month: Month, dayOfMonth: Double): LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[LocalDate]
  
  inline def ofEpochDay(epochDay: Double): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochDay")(epochDay.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  inline def ofInstant(instant: Instant): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  inline def ofInstant(instant: Instant, zoneId: ZoneId): LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[LocalDate]
  
  inline def ofYearDay(year: Double, dayOfYear: Double): LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofYearDay")(year.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[LocalDate]
  
  inline def parse(text: String): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  inline def parse(text: String, formatter: DateTimeFormatter): LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[LocalDate]
}
