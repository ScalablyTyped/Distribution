package typings.luxon.luxonMod

import typings.luxon.Anon_IncludeConfig
import typings.std.Date
import typings.std.IntlNs.ResolvedDateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "DateTime")
@js.native
class DateTime () extends js.Object {
  var day: Double = js.native
  var daysInMonth: Double = js.native
  var daysInYear: Double = js.native
  var hour: Double = js.native
  var invalidExplanation: String | Null = js.native
  var invalidReason: String | Null = js.native
  var isInDST: Boolean = js.native
  var isInLeapYear: Boolean = js.native
  var isOffsetFixed: Boolean = js.native
  var isValid: Boolean = js.native
  var locale: String = js.native
  var millisecond: Double = js.native
  var minute: Double = js.native
  var month: Double = js.native
  var monthLong: String = js.native
  var monthShort: String = js.native
  var numberingSystem: String = js.native
  var offset: Double = js.native
  var offsetNameLong: String = js.native
  var offsetNameShort: String = js.native
  var ordinal: Double = js.native
  var outputCalendar: String = js.native
  var quarter: Double = js.native
  var second: Double = js.native
  var weekNumber: Double = js.native
  var weekYear: Double = js.native
  var weekday: Double = js.native
  var weekdayLong: String = js.native
  var weekdayShort: String = js.native
  var weeksInWeekYear: Double = js.native
  var year: Double = js.native
  var zone: Zone = js.native
  var zoneName: String = js.native
  def diff(other: DateTime): Duration = js.native
  def diff(other: DateTime, unit: js.Array[DurationUnit]): Duration = js.native
  def diff(other: DateTime, unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def diff(other: DateTime, unit: DurationUnit): Duration = js.native
  def diff(other: DateTime, unit: DurationUnit, options: DiffOptions): Duration = js.native
  def diffNow(): Duration = js.native
  def diffNow(unit: js.Array[DurationUnit]): Duration = js.native
  def diffNow(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def diffNow(unit: DurationUnit): Duration = js.native
  def diffNow(unit: DurationUnit, options: DiffOptions): Duration = js.native
  def endOf(unit: DurationUnit): DateTime = js.native
  def equals(other: DateTime): Boolean = js.native
  def get(unit: String): Double = js.native
  def hasSame(other: DateTime, unit: DurationUnit): Boolean = js.native
  def minus(duration: Double): DateTime = js.native
  def minus(duration: Duration): DateTime = js.native
  def minus(duration: DurationObject): DateTime = js.native
  def plus(duration: Double): DateTime = js.native
  def plus(duration: Duration): DateTime = js.native
  def plus(duration: DurationObject): DateTime = js.native
  def reconfigure(properties: LocaleOptions): DateTime = js.native
  def resolvedLocaleOpts(): ResolvedDateTimeFormatOptions = js.native
  def resolvedLocaleOpts(options: DateTimeFormatOptions): ResolvedDateTimeFormatOptions = js.native
  def set(values: DateObjectUnits): DateTime = js.native
  def setLocale(locale: String): DateTime = js.native
  def setZone(zone: String): DateTime = js.native
  def setZone(zone: String, options: ZoneOptions): DateTime = js.native
  def setZone(zone: Zone): DateTime = js.native
  def setZone(zone: Zone, options: ZoneOptions): DateTime = js.native
  def startOf(unit: DurationUnit): DateTime = js.native
  def toBSON(): Date = js.native
  def toFormat(format: String): String = js.native
  def toFormat(format: String, options: DateTimeFormatOptions): String = js.native
  def toHTTP(): String = js.native
  def toISO(): String = js.native
  def toISO(options: ToISOTimeOptions): String = js.native
  def toISODate(): String = js.native
  def toISOTime(): String = js.native
  def toISOTime(options: ToISOTimeOptions): String = js.native
  def toISOWeekDate(): String = js.native
  def toJSDate(): Date = js.native
  def toJSON(): String = js.native
  def toLocal(): DateTime = js.native
  def toLocaleParts(): js.Array[_] = js.native
  def toLocaleParts(options: LocaleOptions with DateTimeFormatOptions): js.Array[_] = js.native
  def toLocaleString(options: LocaleOptions with DateTimeFormatOptions): String = js.native
  def toMillis(): Double = js.native
  def toObject(): DateObject = js.native
  def toObject(options: Anon_IncludeConfig): DateObject = js.native
  def toRFC2822(): String = js.native
  def toRelative(): String | Null = js.native
  def toRelative(options: ToRelativeOptions): String | Null = js.native
  def toRelativeCalendar(): String | Null = js.native
  def toRelativeCalendar(options: ToRelativeCalendarOptions): String | Null = js.native
  def toSQL(): String = js.native
  def toSQL(options: ToSQLOptions): String = js.native
  def toSQLDate(): String = js.native
  def toSQLTime(): String = js.native
  def toSQLTime(options: ToSQLOptions): String = js.native
  def toSeconds(): Double = js.native
  def toUTC(): DateTime = js.native
  def toUTC(offset: Double): DateTime = js.native
  def toUTC(offset: Double, options: ZoneOptions): DateTime = js.native
  def until(other: DateTime): Interval = js.native
}

/* static members */
@JSImport("luxon", "DateTime")
@js.native
object DateTime extends js.Object {
  val DATETIME_FULL: DateTimeFormatOptions = js.native
  val DATETIME_FULL_WITH_SECONDS: DateTimeFormatOptions = js.native
  val DATETIME_HUGE: DateTimeFormatOptions = js.native
  val DATETIME_HUGE_WITH_SECONDS: DateTimeFormatOptions = js.native
  val DATETIME_MED: DateTimeFormatOptions = js.native
  val DATETIME_MED_WITH_SECONDS: DateTimeFormatOptions = js.native
  val DATETIME_SHORT: DateTimeFormatOptions = js.native
  val DATETIME_SHORT_WITH_SECONDS: DateTimeFormatOptions = js.native
  val DATE_FULL: DateTimeFormatOptions = js.native
  val DATE_HUGE: DateTimeFormatOptions = js.native
  val DATE_MED: DateTimeFormatOptions = js.native
  val DATE_SHORT: DateTimeFormatOptions = js.native
  val TIME_24_SIMPLE: DateTimeFormatOptions = js.native
  val TIME_24_WITH_LONG_OFFSET: DateTimeFormatOptions = js.native
  val TIME_24_WITH_SECONDS: DateTimeFormatOptions = js.native
  val TIME_24_WITH_SHORT_OFFSET: DateTimeFormatOptions = js.native
  val TIME_SIMPLE: DateTimeFormatOptions = js.native
  val TIME_WITH_LONG_OFFSET: DateTimeFormatOptions = js.native
  val TIME_WITH_SECONDS: DateTimeFormatOptions = js.native
  val TIME_WITH_SHORT_OFFSET: DateTimeFormatOptions = js.native
  def fromFormat(text: String, format: String): DateTime = js.native
  def fromFormat(text: String, format: String, opts: DateTimeOptions): DateTime = js.native
  def fromFormatExplain(text: String, format: String): ExplainedFormat = js.native
  def fromFormatExplain(text: String, format: String, opts: DateTimeOptions): ExplainedFormat = js.native
  def fromHTTP(text: String): DateTime = js.native
  def fromHTTP(text: String, options: DateTimeOptions): DateTime = js.native
  def fromISO(text: String): DateTime = js.native
  def fromISO(text: String, options: DateTimeOptions): DateTime = js.native
  def fromJSDate(date: Date): DateTime = js.native
  def fromJSDate(date: Date, options: DateTimeJSOptions): DateTime = js.native
  def fromMillis(ms: Double): DateTime = js.native
  def fromMillis(ms: Double, options: DateTimeOptions): DateTime = js.native
  def fromObject(obj: DateObject): DateTime = js.native
  def fromRFC2822(text: String): DateTime = js.native
  def fromRFC2822(text: String, options: DateTimeOptions): DateTime = js.native
  def fromSQL(text: String): DateTime = js.native
  def fromSQL(text: String, options: DateTimeOptions): DateTime = js.native
  def fromSeconds(seconds: Double): DateTime = js.native
  def fromSeconds(seconds: Double, options: DateTimeOptions): DateTime = js.native
  /**
    * @deprecated since 0.3.0. Use fromFormat instead
    */
  def fromString(text: String, format: String): DateTime = js.native
  def fromString(text: String, format: String, options: DateTimeOptions): DateTime = js.native
  /**
    * @deprecated 0.3.0. Use fromFormatExplain instead
    */
  def fromStringExplain(text: String, format: String): ExplainedFormat = js.native
  def fromStringExplain(text: String, format: String, options: DateTimeOptions): ExplainedFormat = js.native
  def invalid(reason: js.Any): DateTime = js.native
  def isDateTime(o: js.Any): /* is luxon.luxon.DateTime */ Boolean = js.native
  def local(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): DateTime = js.native
  def max(): js.UndefOr[scala.Nothing] = js.native
  def max(dateTimes: DateTime*): DateTime = js.native
  def min(): js.UndefOr[scala.Nothing] = js.native
  def min(dateTimes: DateTime*): DateTime = js.native
  def utc(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): DateTime = js.native
}

