package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "DateTime")
@js.native
class DateTime () extends js.Object {
  var day: scala.Double = js.native
  var daysInMonth: scala.Double = js.native
  var daysInYear: scala.Double = js.native
  var hour: scala.Double = js.native
  var invalidExplanation: java.lang.String | scala.Null = js.native
  var invalidReason: java.lang.String | scala.Null = js.native
  var isInDST: scala.Boolean = js.native
  var isInLeapYear: scala.Boolean = js.native
  var isOffsetFixed: scala.Boolean = js.native
  var isValid: scala.Boolean = js.native
  var locale: java.lang.String = js.native
  var millisecond: scala.Double = js.native
  var minute: scala.Double = js.native
  var month: scala.Double = js.native
  var monthLong: java.lang.String = js.native
  var monthShort: java.lang.String = js.native
  var numberingSystem: java.lang.String = js.native
  var offset: scala.Double = js.native
  var offsetNameLong: java.lang.String = js.native
  var offsetNameShort: java.lang.String = js.native
  var ordinal: scala.Double = js.native
  var outputCalendar: java.lang.String = js.native
  var quarter: scala.Double = js.native
  var second: scala.Double = js.native
  var weekNumber: scala.Double = js.native
  var weekYear: scala.Double = js.native
  var weekday: scala.Double = js.native
  var weekdayLong: java.lang.String = js.native
  var weekdayShort: java.lang.String = js.native
  var weeksInWeekYear: scala.Double = js.native
  var year: scala.Double = js.native
  var zone: Zone = js.native
  var zoneName: java.lang.String = js.native
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
  def equals(other: DateTime): scala.Boolean = js.native
  def get(unit: java.lang.String): scala.Double = js.native
  def hasSame(other: DateTime, unit: DurationUnit): scala.Boolean = js.native
  def minus(duration: Duration): DateTime = js.native
  def minus(duration: DurationObject): DateTime = js.native
  def minus(duration: scala.Double): DateTime = js.native
  def plus(duration: Duration): DateTime = js.native
  def plus(duration: DurationObject): DateTime = js.native
  def plus(duration: scala.Double): DateTime = js.native
  def reconfigure(properties: LocaleOptions): DateTime = js.native
  def resolvedLocaleOpts(): stdLib.IntlNs.ResolvedDateTimeFormatOptions = js.native
  def resolvedLocaleOpts(options: DateTimeFormatOptions): stdLib.IntlNs.ResolvedDateTimeFormatOptions = js.native
  def set(values: DateObjectUnits): DateTime = js.native
  def setLocale(locale: java.lang.String): DateTime = js.native
  def setZone(zone: java.lang.String): DateTime = js.native
  def setZone(zone: java.lang.String, options: ZoneOptions): DateTime = js.native
  def setZone(zone: Zone): DateTime = js.native
  def setZone(zone: Zone, options: ZoneOptions): DateTime = js.native
  def startOf(unit: DurationUnit): DateTime = js.native
  def toBSON(): stdLib.Date = js.native
  def toFormat(format: java.lang.String): java.lang.String = js.native
  def toFormat(format: java.lang.String, options: DateTimeFormatOptions): java.lang.String = js.native
  def toHTTP(): java.lang.String = js.native
  def toISO(): java.lang.String = js.native
  def toISO(options: ToISOTimeOptions): java.lang.String = js.native
  def toISODate(): java.lang.String = js.native
  def toISOTime(): java.lang.String = js.native
  def toISOTime(options: ToISOTimeOptions): java.lang.String = js.native
  def toISOWeekDate(): java.lang.String = js.native
  def toJSDate(): stdLib.Date = js.native
  def toJSON(): java.lang.String = js.native
  def toLocal(): DateTime = js.native
  def toLocaleParts(): js.Array[_] = js.native
  def toLocaleParts(options: LocaleOptions with DateTimeFormatOptions): js.Array[_] = js.native
  def toLocaleString(options: LocaleOptions with DateTimeFormatOptions): java.lang.String = js.native
  def toMillis(): scala.Double = js.native
  def toObject(): DateObject = js.native
  def toObject(options: luxonLib.Anon_IncludeConfig): DateObject = js.native
  def toRFC2822(): java.lang.String = js.native
  def toRelative(): java.lang.String | scala.Null = js.native
  def toRelative(options: ToRelativeOptions): java.lang.String | scala.Null = js.native
  def toRelativeCalendar(): java.lang.String | scala.Null = js.native
  def toRelativeCalendar(options: ToRelativeCalendarOptions): java.lang.String | scala.Null = js.native
  def toSQL(): java.lang.String = js.native
  def toSQL(options: ToSQLOptions): java.lang.String = js.native
  def toSQLDate(): java.lang.String = js.native
  def toSQLTime(): java.lang.String = js.native
  def toSQLTime(options: ToSQLOptions): java.lang.String = js.native
  def toSeconds(): scala.Double = js.native
  def toUTC(): DateTime = js.native
  def toUTC(offset: scala.Double): DateTime = js.native
  def toUTC(offset: scala.Double, options: ZoneOptions): DateTime = js.native
  def until(other: DateTime): Interval = js.native
}

/* static members */
@JSImport("luxon", "DateTime")
@js.native
object DateTime extends js.Object {
  val DATETIME_FULL: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_FULL_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_HUGE: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_HUGE_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_MED: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_MED_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_SHORT: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATETIME_SHORT_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATE_FULL: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATE_HUGE: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATE_MED: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val DATE_SHORT: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_24_SIMPLE: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_24_WITH_LONG_OFFSET: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_24_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_24_WITH_SHORT_OFFSET: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_SIMPLE: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_WITH_LONG_OFFSET: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_WITH_SECONDS: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  val TIME_WITH_SHORT_OFFSET: luxonLib.luxonMod.DateTimeFormatOptions = js.native
  def fromFormat(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromFormat(text: java.lang.String, format: java.lang.String, opts: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromFormatExplain(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.ExplainedFormat = js.native
  def fromFormatExplain(text: java.lang.String, format: java.lang.String, opts: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.ExplainedFormat = js.native
  def fromHTTP(text: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromHTTP(text: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromISO(text: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromISO(text: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromJSDate(date: stdLib.Date): luxonLib.luxonMod.DateTime = js.native
  def fromJSDate(date: stdLib.Date, options: luxonLib.luxonMod.DateTimeJSOptions): luxonLib.luxonMod.DateTime = js.native
  def fromMillis(ms: scala.Double): luxonLib.luxonMod.DateTime = js.native
  def fromMillis(ms: scala.Double, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromObject(obj: luxonLib.luxonMod.DateObject): luxonLib.luxonMod.DateTime = js.native
  def fromRFC2822(text: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromRFC2822(text: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromSQL(text: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromSQL(text: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  def fromSeconds(seconds: scala.Double): luxonLib.luxonMod.DateTime = js.native
  def fromSeconds(seconds: scala.Double, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  /**
    * @deprecated since 0.3.0. Use fromFormat instead
    */
  def fromString(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.DateTime = js.native
  def fromString(text: java.lang.String, format: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.DateTime = js.native
  /**
    * @deprecated 0.3.0. Use fromFormatExplain instead
    */
  def fromStringExplain(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.ExplainedFormat = js.native
  def fromStringExplain(text: java.lang.String, format: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.ExplainedFormat = js.native
  def invalid(reason: js.Any): luxonLib.luxonMod.DateTime = js.native
  def isDateTime(o: js.Any): /* is luxon.luxon.DateTime */ scala.Boolean = js.native
  def local(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double]
  ): luxonLib.luxonMod.DateTime = js.native
  def max(): js.UndefOr[scala.Nothing] = js.native
  def max(dateTimes: luxonLib.luxonMod.DateTime*): luxonLib.luxonMod.DateTime = js.native
  def min(): js.UndefOr[scala.Nothing] = js.native
  def min(dateTimes: luxonLib.luxonMod.DateTime*): luxonLib.luxonMod.DateTime = js.native
  def utc(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double]
  ): luxonLib.luxonMod.DateTime = js.native
}

