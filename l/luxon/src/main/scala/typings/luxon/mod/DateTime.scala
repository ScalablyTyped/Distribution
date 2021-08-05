package typings.luxon.mod

import typings.luxon.anon.IncludeConfig
import typings.std.Date
import typings.std.Intl.ResolvedDateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "DateTime")
@js.native
class DateTime () extends StObject {
  
  var day: Double = js.native
  
  var daysInMonth: Double = js.native
  
  var daysInYear: Double = js.native
  
  def diff(other: DateTime): Duration = js.native
  def diff(other: DateTime, unit: js.Array[DurationUnit]): Duration = js.native
  def diff(other: DateTime, unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def diff(other: DateTime, unit: Unit, options: DiffOptions): Duration = js.native
  def diff(other: DateTime, unit: DurationUnit): Duration = js.native
  def diff(other: DateTime, unit: DurationUnit, options: DiffOptions): Duration = js.native
  
  def diffNow(): Duration = js.native
  def diffNow(unit: js.Array[DurationUnit]): Duration = js.native
  def diffNow(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def diffNow(unit: Unit, options: DiffOptions): Duration = js.native
  def diffNow(unit: DurationUnit): Duration = js.native
  def diffNow(unit: DurationUnit, options: DiffOptions): Duration = js.native
  
  def endOf(unit: DurationUnit): DateTime = js.native
  
  def equals(other: DateTime): Boolean = js.native
  
  def get(
    unit: /* keyof luxon.luxon.DateTime */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
  ): Double = js.native
  
  def hasSame(other: DateTime, unit: DurationUnit): Boolean = js.native
  
  var hour: Double = js.native
  
  var invalidExplanation: String | Null = js.native
  
  var invalidReason: String | Null = js.native
  
  var isInDST: Boolean = js.native
  
  var isInLeapYear: Boolean = js.native
  
  var isOffsetFixed: Boolean = js.native
  
  var isValid: Boolean = js.native
  
  var locale: String = js.native
  
  var millisecond: Double = js.native
  
  def minus(duration: Double): DateTime = js.native
  def minus(duration: Duration): DateTime = js.native
  def minus(duration: DurationObject): DateTime = js.native
  
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
  
  def plus(duration: Double): DateTime = js.native
  def plus(duration: Duration): DateTime = js.native
  def plus(duration: DurationObject): DateTime = js.native
  
  var quarter: Double = js.native
  
  def reconfigure(properties: LocaleOptions): DateTime = js.native
  
  def resolvedLocaleOpts(): ResolvedDateTimeFormatOptions = js.native
  def resolvedLocaleOpts(options: DateTimeFormatOptions): ResolvedDateTimeFormatOptions = js.native
  
  var second: Double = js.native
  
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
  
  /** Returns an ISO 8601-compliant string representation of this DateTime's date component */
  def toISODate(): String = js.native
  def toISODate(options: ToISODateOptions): String = js.native
  
  def toISOTime(): String = js.native
  def toISOTime(options: ToISOTimeOptions): String = js.native
  
  def toISOWeekDate(): String = js.native
  
  def toJSDate(): Date = js.native
  
  def toJSON(): String = js.native
  
  def toLocal(): DateTime = js.native
  
  def toLocaleParts(): js.Array[js.Any] = js.native
  def toLocaleParts(options: LocaleOptions & DateTimeFormatOptions): js.Array[js.Any] = js.native
  
  def toLocaleString(options: LocaleOptions & DateTimeFormatOptions): String = js.native
  
  def toMillis(): Double = js.native
  
  def toObject(): DateObject = js.native
  def toObject(options: IncludeConfig): DateObject = js.native
  
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
  def toUTC(offset: Unit, options: ZoneOptions): DateTime = js.native
  
  def until(other: DateTime): Interval = js.native
  
  var weekNumber: Double = js.native
  
  var weekYear: Double = js.native
  
  var weekday: Double = js.native
  
  var weekdayLong: String = js.native
  
  var weekdayShort: String = js.native
  
  var weeksInWeekYear: Double = js.native
  
  var year: Double = js.native
  
  var zone: Zone = js.native
  
  var zoneName: String = js.native
}
/* static members */
object DateTime {
  
  @JSImport("luxon", "DateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_FULL")
  @js.native
  val DATETIME_FULL: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_FULL_WITH_SECONDS")
  @js.native
  val DATETIME_FULL_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_HUGE")
  @js.native
  val DATETIME_HUGE: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_HUGE_WITH_SECONDS")
  @js.native
  val DATETIME_HUGE_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_MED")
  @js.native
  val DATETIME_MED: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_MED_WITH_SECONDS")
  @js.native
  val DATETIME_MED_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_SHORT")
  @js.native
  val DATETIME_SHORT: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATETIME_SHORT_WITH_SECONDS")
  @js.native
  val DATETIME_SHORT_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATE_FULL")
  @js.native
  val DATE_FULL: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATE_HUGE")
  @js.native
  val DATE_HUGE: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATE_MED")
  @js.native
  val DATE_MED: DateTimeFormatOptions = js.native
  
  /** abbreviated date with weekday */
  @JSImport("luxon", "DateTime.DATE_MED_WITH_WEEKDAY")
  @js.native
  val DATE_MED_WITH_WEEKDAY: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.DATE_SHORT")
  @js.native
  val DATE_SHORT: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_24_SIMPLE")
  @js.native
  val TIME_24_SIMPLE: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_24_WITH_LONG_OFFSET")
  @js.native
  val TIME_24_WITH_LONG_OFFSET: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_24_WITH_SECONDS")
  @js.native
  val TIME_24_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_24_WITH_SHORT_OFFSET")
  @js.native
  val TIME_24_WITH_SHORT_OFFSET: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_SIMPLE")
  @js.native
  val TIME_SIMPLE: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_WITH_LONG_OFFSET")
  @js.native
  val TIME_WITH_LONG_OFFSET: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_WITH_SECONDS")
  @js.native
  val TIME_WITH_SECONDS: DateTimeFormatOptions = js.native
  
  @JSImport("luxon", "DateTime.TIME_WITH_SHORT_OFFSET")
  @js.native
  val TIME_WITH_SHORT_OFFSET: DateTimeFormatOptions = js.native
  
  inline def fromFormat(text: String, format: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def fromFormat(text: String, format: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromFormatExplain(text: String, format: String): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormatExplain")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  inline def fromFormatExplain(text: String, format: String, opts: DateTimeOptions): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormatExplain")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  
  inline def fromHTTP(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromHTTP(text: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromISO(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromISO(text: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromJSDate(date: Date): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromJSDate(date: Date, options: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromMillis(ms: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(ms.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromMillis(ms: Double, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(ms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromObject(obj: DateObject): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  inline def fromRFC2822(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromRFC2822(text: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromSQL(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromSQL(text: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def fromSeconds(seconds: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromSeconds(seconds: Double, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * @deprecated since 0.3.0. Use fromFormat instead
    */
  inline def fromString(text: String, format: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def fromString(text: String, format: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * @deprecated 0.3.0. Use fromFormatExplain instead
    */
  inline def fromStringExplain(text: String, format: String): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringExplain")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  inline def fromStringExplain(text: String, format: String, options: DateTimeOptions): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringExplain")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  
  /**
    * Create an invalid DateTime.
    * @param reason - simple string of why this DateTime is invalid.
    * Should not contain parameters or anything else data-dependent
    * @param [explanation=null] - longer explanation, may include parameters and other useful debugging information
    */
  inline def invalid(reason: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def invalid(reason: String, explanation: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def isDateTime(o: js.Any): /* is luxon.luxon.DateTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTime")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon.DateTime */ Boolean]
  
  inline def local(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  inline def max(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Unit]
  inline def max(dateTimes: DateTime*): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dateTimes.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  inline def min(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Unit]
  inline def min(dateTimes: DateTime*): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dateTimes.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  inline def utc(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[DateTime]
}
