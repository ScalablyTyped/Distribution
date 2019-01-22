package typings
package luxonLib.luxonMod.luxonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTime extends js.Object {
  var day: scala.Double = js.native
  var daysInMonth: scala.Double = js.native
  var daysInYear: scala.Double = js.native
  var hour: scala.Double = js.native
  var invalidReason: java.lang.String = js.native
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
  def get(
    unit: luxonLib.luxonLibStrings.day | luxonLib.luxonLibStrings.daysInMonth | luxonLib.luxonLibStrings.daysInYear | luxonLib.luxonLibStrings.hour | luxonLib.luxonLibStrings.invalidReason | luxonLib.luxonLibStrings.isInDST | luxonLib.luxonLibStrings.isInLeapYear | luxonLib.luxonLibStrings.isOffsetFixed | luxonLib.luxonLibStrings.isValid | luxonLib.luxonLibStrings.locale | luxonLib.luxonLibStrings.millisecond | luxonLib.luxonLibStrings.minute | luxonLib.luxonLibStrings.month | luxonLib.luxonLibStrings.monthLong | luxonLib.luxonLibStrings.monthShort | luxonLib.luxonLibStrings.numberingSystem | luxonLib.luxonLibStrings.offset | luxonLib.luxonLibStrings.offsetNameLong | luxonLib.luxonLibStrings.offsetNameShort | luxonLib.luxonLibStrings.ordinal | luxonLib.luxonLibStrings.outputCalendar | luxonLib.luxonLibStrings.quarter | luxonLib.luxonLibStrings.second | luxonLib.luxonLibStrings.weekNumber | luxonLib.luxonLibStrings.weekYear | luxonLib.luxonLibStrings.weekday | luxonLib.luxonLibStrings.weekdayLong | luxonLib.luxonLibStrings.weekdayShort | luxonLib.luxonLibStrings.weeksInWeekYear | luxonLib.luxonLibStrings.year | luxonLib.luxonLibStrings.zoneName | luxonLib.luxonLibStrings.zone
  ): scala.Double = js.native
  def hasSame(other: DateTime, unit: DurationUnit): scala.Boolean = js.native
  def minus(duration: Duration): DateTime = js.native
  def minus(duration: DurationObject): DateTime = js.native
  def minus(duration: scala.Double): DateTime = js.native
  def plus(duration: Duration): DateTime = js.native
  def plus(duration: DurationObject): DateTime = js.native
  def plus(duration: scala.Double): DateTime = js.native
  def reconfigure(properties: LocaleOptions): DateTime = js.native
  def resolvedLocaleOpts(): LocaleOptions = js.native
  def resolvedLocaleOpts(options: ToFormatOptions): LocaleOptions = js.native
  def set(values: DateObjectUnits): DateTime = js.native
  def setLocale(locale: js.Any): DateTime = js.native
  def setZone(zone: java.lang.String): DateTime = js.native
  def setZone(zone: java.lang.String, options: ZoneOptions): DateTime = js.native
  def setZone(zone: Zone): DateTime = js.native
  def setZone(zone: Zone, options: ZoneOptions): DateTime = js.native
  def startOf(unit: DurationUnit): DateTime = js.native
  def toBSON(): stdLib.Date = js.native
  def toFormat(format: java.lang.String): java.lang.String = js.native
  def toFormat(format: java.lang.String, options: ToFormatOptions): java.lang.String = js.native
  def toHTTP(): java.lang.String = js.native
  def toISO(): java.lang.String = js.native
  def toISO(options: ISOTimeOptions): java.lang.String = js.native
  def toISODate(): java.lang.String = js.native
  def toISOTime(): java.lang.String = js.native
  def toISOTime(options: ISOTimeOptions): java.lang.String = js.native
  def toISOWeekDate(): java.lang.String = js.native
  def toJSDate(): stdLib.Date = js.native
  def toJSON(): java.lang.String = js.native
  def toLocal(): DateTime = js.native
  def toLocaleParts(): js.Array[_] = js.native
  def toLocaleParts(options: DateTimeFormatOptions): js.Array[_] = js.native
  def toLocaleString(options: DateTimeFormatOptions): java.lang.String = js.native
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

