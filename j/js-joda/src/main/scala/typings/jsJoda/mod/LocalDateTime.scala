package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "LocalDateTime")
@js.native
class LocalDateTime protected () extends ChronoLocalDateTime {
  
  def adjustInto(temporal: TemporalAdjuster): LocalDateTime = js.native
  
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  
  def compareTo(other: LocalDateTime): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def hour(): Double = js.native
  
  def isAfter(other: LocalDateTime): Boolean = js.native
  
  def isBefore(other: LocalDateTime): Boolean = js.native
  
  def isEqual(other: js.Any): Boolean = js.native
  
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
  
  def minus(amountToSubtract: Double, unit: TemporalUnit): LocalDateTime = js.native
  def minus(amount: TemporalAmount): LocalDateTime = js.native
  
  def minusDays(days: Double): LocalDateTime = js.native
  
  def minusHours(hours: Double): LocalDateTime = js.native
  
  def minusMinutes(minutes: Double): LocalDateTime = js.native
  
  def minusMonths(months: Double): LocalDateTime = js.native
  
  def minusNanos(nanos: Double): LocalDateTime = js.native
  
  def minusSeconds(seconds: Double): LocalDateTime = js.native
  
  def minusTemporalAmount(amount: TemporalAmount): LocalDateTime = js.native
  
  def minusWeeks(weeks: Double): LocalDateTime = js.native
  
  def minusYears(years: Double): LocalDateTime = js.native
  
  def minute(): Double = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def nano(): Double = js.native
  
  def plus(amountToAdd: Double, unit: TemporalUnit): LocalDateTime = js.native
  def plus(amount: TemporalAmount): LocalDateTime = js.native
  
  def plusDays(days: Double): LocalDateTime = js.native
  
  def plusHours(hours: Double): LocalDateTime = js.native
  
  def plusMinutes(minutes: Double): LocalDateTime = js.native
  
  def plusMonths(months: Double): LocalDateTime = js.native
  
  def plusNanos(nanos: Double): LocalDateTime = js.native
  
  def plusSeconds(seconds: Double): LocalDateTime = js.native
  
  def plusTemporalAmount(amount: TemporalAmount): LocalDateTime = js.native
  
  def plusWeeks(weeks: Double): LocalDateTime = js.native
  
  def plusYears(years: Double): LocalDateTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toLocalDate(): LocalDate = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def truncatedTo(unit: TemporalUnit): LocalDateTime = js.native
  
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  
  def `with`(adjuster: TemporalAdjuster): LocalDateTime = js.native
  def `with`(field: TemporalField, newValue: Double): LocalDateTime = js.native
  
  def withDayOfMonth(dayOfMonth: Double): LocalDateTime = js.native
  
  def withDayOfYear(dayOfYear: Double): LocalDateTime = js.native
  
  def withHour(hour: Double): LocalDateTime = js.native
  
  def withMinute(minute: Double): LocalDateTime = js.native
  
  def withMonth(month: Double): LocalDateTime = js.native
  def withMonth(month: Month): LocalDateTime = js.native
  
  def withNano(nanoOfSecond: Double): LocalDateTime = js.native
  
  def withSecond(second: Double): LocalDateTime = js.native
  
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDateTime = js.native
  
  def withYear(year: Double): LocalDateTime = js.native
  
  def year(): Double = js.native
}
object LocalDateTime {
  
  @JSImport("js-joda", "LocalDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.MAX")
  @js.native
  def MAX: LocalDateTime = js.native
  @scala.inline
  def MAX_=(x: LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.MIN")
  @js.native
  def MIN: LocalDateTime = js.native
  @scala.inline
  def MIN_=(x: LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.from")
  @js.native
  def from(temporal: TemporalAccessor): LocalDateTime = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.now")
  @js.native
  def now(): LocalDateTime = js.native
  @JSImport("js-joda", "LocalDateTime.now")
  @js.native
  def now(clockOrZone: Clock): LocalDateTime = js.native
  @JSImport("js-joda", "LocalDateTime.now")
  @js.native
  def now(clockOrZone: ZoneId): LocalDateTime = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.of")
  @js.native
  def of(date: LocalDate, time: LocalTime): LocalDateTime = js.native
  /* static member */
  @JSImport("js-joda", "LocalDateTime.of")
  @js.native
  def of(
    year: js.UndefOr[Double],
    month: js.UndefOr[Month | Double],
    dayOfMonth: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    nanoSecond: js.UndefOr[Double]
  ): LocalDateTime = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.ofEpochSecond")
  @js.native
  def ofEpochSecond(epochSecond: Double, nanoOfSecond: Double, offset: ZoneOffset): LocalDateTime = js.native
  /* static member */
  @JSImport("js-joda", "LocalDateTime.ofEpochSecond")
  @js.native
  def ofEpochSecond(epochSecond: Double, offset: ZoneOffset): LocalDateTime = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.ofInstant")
  @js.native
  def ofInstant(instant: Instant): LocalDateTime = js.native
  @JSImport("js-joda", "LocalDateTime.ofInstant")
  @js.native
  def ofInstant(instant: Instant, zoneId: ZoneId): LocalDateTime = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDateTime.parse")
  @js.native
  def parse(text: String): LocalDateTime = js.native
  @JSImport("js-joda", "LocalDateTime.parse")
  @js.native
  def parse(text: String, formatter: DateTimeFormatter): LocalDateTime = js.native
}
