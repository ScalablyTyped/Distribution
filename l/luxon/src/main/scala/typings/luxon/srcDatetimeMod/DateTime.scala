package typings.luxon.srcDatetimeMod

import typings.luxon.anon.`0`
import typings.luxon.luxonBooleans.`false`
import typings.luxon.luxonStrings.`Invalid DateTime`
import typings.luxon.srcDurationMod.Duration
import typings.luxon.srcDurationMod.DurationLike
import typings.luxon.srcDurationMod.DurationUnits
import typings.luxon.srcIntervalMod.Interval
import typings.luxon.srcIntervalMod._DateInput
import typings.luxon.srcMiscMod.DateTimeFormatOptions
import typings.luxon.srcMiscMod.ZoneOptions
import typings.luxon.srcUtilMod.IfInvalid
import typings.luxon.srcZoneMod.Zone
import typings.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon/src/datetime", "DateTime")
@js.native
open class DateTime protected ()
  extends StObject
     with _DateInput {
  /* private */ def this(config: Any) = this()
  
  /**
    * Get the day of the month (1-30ish).
    *
    * @example DateTime.local(2017, 5, 25).day //=> 25
    */
  def day: DayNumbers | IfInvalid[Double] = js.native
  
  /**
    * Returns the number of days in this DateTime's month
    *
    * @example
    * DateTime.local(2016, 2).daysInMonth //=> 29
    * @example
    * DateTime.local(2016, 3).daysInMonth //=> 31
    */
  def daysInMonth: PossibleDaysInMonth | IfInvalid[Unit] = js.native
  
  /**
    * Returns the number of days in this DateTime's year
    *
    * @example
    * DateTime.local(2016).daysInYear //=> 366
    * @example
    * DateTime.local(2013).daysInYear //=> 365
    */
  def daysInYear: PossibleDaysInYear | IfInvalid[Double] = js.native
  
  // COMPARE
  /**
    * Return the difference between two DateTimes as a Duration.
    *
    * @param otherDateTime - the DateTime to compare this one to
    * @param unit - the unit or array of units to include in the duration.
    * Defaults to ['milliseconds'].
    * @param opts - options that affect the creation of the Duration
    * @param opts.conversionAccuracy - the conversion system to use.
    * Defaults to 'casual'.
    *
    * @example
    * let i1 = DateTime.fromISO('1982-05-25T09:45'),
    *     i2 = DateTime.fromISO('1983-10-14T10:30');
    * i2.diff(i1).toObject() //=> { milliseconds: 43807500000 }
    * i2.diff(i1, 'hours').toObject() //=> { hours: 12168.75 }
    * i2.diff(i1, ['months', 'days']).toObject() //=> { months: 16, days: 19.03125 }
    * i2.diff(i1, ['months', 'days', 'hours']).toObject() //=> { months: 16, days: 19, hours: 0.75 }
    */
  def diff(otherDateTime: DateTime): Duration = js.native
  def diff(otherDateTime: DateTime, unit: Unit, opts: DiffOptions): Duration = js.native
  def diff(otherDateTime: DateTime, unit: DurationUnits): Duration = js.native
  def diff(otherDateTime: DateTime, unit: DurationUnits, opts: DiffOptions): Duration = js.native
  
  /**
    * Return the difference between this DateTime and right now.
    * See {@link DateTime.diff}
    *
    * @param unit - the unit(s) to include in the duration. Defaults to ['milliseconds'].
    * @param opts - options that affect the creation of the Duration
    * @param opts.conversionAccuracy - the conversion system to use. Defaults to 'casual'.
    */
  def diffNow(): Duration = js.native
  def diffNow(unit: Unit, opts: DiffOptions): Duration = js.native
  def diffNow(unit: DurationUnits): Duration = js.native
  def diffNow(unit: DurationUnits, opts: DiffOptions): Duration = js.native
  
  /**
    * "Set" this DateTime to the end (meaning the last millisecond) of a unit of time
    *
    * @param unit - The unit to go to the end of. Can be 'year', 'quarter', 'month', 'week', 'day', 'hour', 'minute', 'second', or 'millisecond'.
    *
    * @example
    * DateTime.local(2014, 3, 3).endOf('month').toISO(); //=> '2014-03-31T23:59:59.999-05:00'
    * @example
    * DateTime.local(2014, 3, 3).endOf('year').toISO(); //=> '2014-12-31T23:59:59.999-05:00'
    * @example
    * DateTime.local(2014, 3, 3).endOf('week').toISO(); // => '2014-03-09T23:59:59.999-05:00', weeks start on Mondays
    * @example
    * DateTime.local(2014, 3, 3, 5, 30).endOf('day').toISO(); //=> '2014-03-03T23:59:59.999-05:00'
    * @example
    * DateTime.local(2014, 3, 3, 5, 30).endOf('hour').toISO(); //=> '2014-03-03T05:59:59.999-05:00'
    */
  def endOf(unit: DateTimeUnit): DateTime = js.native
  
  /**
    * An equality check.
    * Two DateTimes are equal if and only if they represent the same millisecond, have the same zone and location, and are both valid.
    * To compare just the millisecond values, use `+dt1 === +dt2`.
    *
    * @param other - the other DateTime
    */
  def equals(other: DateTime): Boolean | IfInvalid[`false`] = js.native
  
  // INFO
  /**
    * Get the value of unit.
    *
    * @param unit - a unit such as 'minute' or 'day'
    *
    * @example
    * DateTime.local(2017, 7, 4).get('month'); //=> 7
    * @example
    * DateTime.local(2017, 7, 4).get('day'); //=> 4
    */
  def get(
    unit: /* keyof luxon.luxon/src/datetime.DateTime */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.luxon.luxonStrings.now, typings.luxon.luxonStrings.local, typings.luxon.luxonStrings.utc */ Any
  ): Double = js.native
  
  /**
    * Return whether this DateTime is in the same unit of time as another DateTime.
    * Note that time zones are **ignored** in this comparison, which compares the **local** calendar time. Use {@link DateTime.setZone} to convert one of the dates if needed.
    *
    * @param otherDateTime - the other DateTime
    * @param unit - the unit of time to check sameness on
    *
    * @example
    * DateTime.now().hasSame(otherDT, 'day'); //~> true if otherDT is in the same current calendar day
    */
  def hasSame(otherDateTime: DateTime, unit: DateTimeUnit): Boolean | IfInvalid[`false`] = js.native
  
  /**
    * Get the hour of the day (0-23).
    *
    * @example DateTime.local(2017, 5, 25, 9).hour //=> 9
    */
  def hour: HourNumbers | IfInvalid[Double] = js.native
  
  /**
    * Returns an explanation of why this DateTime became invalid, or null if the DateTime is valid
    */
  def invalidExplanation: String | Null = js.native
  
  /**
    * Returns an error code if this DateTime is invalid, or null if the DateTime is valid
    */
  def invalidReason: String | Null = js.native
  
  /**
    * Get whether the DateTime is in a DST.
    */
  def isInDST: Boolean | IfInvalid[`false`] = js.native
  
  /**
    * Returns true if this DateTime is in a leap year, false otherwise
    *
    * @example
    * DateTime.local(2016).isInLeapYear //=> true
    * @example
    * DateTime.local(2013).isInLeapYear //=> false
    */
  def isInLeapYear: Boolean = js.native
  
  /**
    * Get whether this zone's offset ever changes, as in a DST.
    */
  def isOffsetFixed: Boolean | IfInvalid[Null] = js.native
  
  /**
    * Returns whether the DateTime is valid. Invalid DateTimes occur when:
    * * The DateTime was created from invalid calendar information, such as the 13th month or February 30
    * * The DateTime was created by an operation on another invalid date
    */
  def isValid: Boolean = js.native
  
  /**
    * Get the locale of a DateTime, such as 'en-GB'. The locale is used when formatting the DateTime
    */
  def locale: String | IfInvalid[Null] = js.native
  
  /**
    * Get the millisecond of the second (0-999).
    *
    * @example
    * DateTime.local(2017, 5, 25, 9, 30, 52, 654).millisecond //=> 654
    */
  def millisecond: Double | IfInvalid[Double] = js.native
  
  /**
    * See {@link DateTime.plus}
    *
    * @param duration - The amount to subtract. Either a Luxon Duration, a number of milliseconds, the object argument to Duration.fromObject()
    */
  def minus(duration: DurationLike): DateTime = js.native
  
  /**
    * Get the minute of the hour (0-59).
    *
    * @example
    * DateTime.local(2017, 5, 25, 9, 30).minute //=> 30
    */
  def minute: MinuteNumbers | IfInvalid[Double] = js.native
  
  /**
    * Get the month (1-12).
    *
    * @example DateTime.local(2017, 5, 25).month //=> 5
    */
  def month: MonthNumbers | IfInvalid[Double] = js.native
  
  /**
    * Get the human readable long month name, such as 'October'.
    * Defaults to the system's locale if no locale has been specified
    *
    * @example
    * DateTime.local(2017, 10, 30).monthLong //=> October
    */
  def monthLong: String | IfInvalid[Null] = js.native
  
  /**
    * Get the human readable short month name, such as 'Oct'.
    * Defaults to the system's locale if no locale has been specified
    *
    * @example
    * DateTime.local(2017, 10, 30).monthShort //=> Oct
    */
  def monthShort: String | IfInvalid[Null] = js.native
  
  /**
    * Get the numbering system of a DateTime, such as 'beng'. The numbering system is used when formatting the DateTime
    */
  def numberingSystem: String | IfInvalid[Null] = js.native
  
  /**
    * Get the UTC offset of this DateTime in minutes
    *
    * @example
    * DateTime.now().offset //=> -240
    * @example
    * DateTime.utc().offset //=> 0
    */
  def offset: Double | IfInvalid[Double] = js.native
  
  /**
    * Get the long human name for the zone's current offset, for example "Eastern Standard Time" or "Eastern Daylight Time".
    * Defaults to the system's locale if no locale has been specified
    */
  def offsetNameLong: String | IfInvalid[Null] = js.native
  
  /**
    * Get the short human name for the zone's current offset, for example "EST" or "EDT".
    * Defaults to the system's locale if no locale has been specified
    */
  def offsetNameShort: String | IfInvalid[Null] = js.native
  
  /**
    * Get the ordinal (meaning the day of the year)
    *
    * @example
    * DateTime.local(2017, 5, 25).ordinal //=> 145
    */
  def ordinal: Double | IfInvalid[Double] = js.native
  
  /**
    * Get the output calendar of a DateTime, such as 'islamic'. The output calendar is used when formatting the DateTime
    */
  def outputCalendar: String | IfInvalid[Null] = js.native
  
  /**
    * Adding hours, minutes, seconds, or milliseconds increases the timestamp by the right number of milliseconds. Adding days, months, or years shifts the calendar,
    * accounting for DSTs and leap years along the way. Thus, `dt.plus({ hours: 24 })` may result in a different time than `dt.plus({ days: 1 })` if there's a DST shift in between.
    *
    * @param duration - The amount to add. Either a Luxon Duration, a number of milliseconds, the object argument to Duration.fromObject()
    *
    * @example
    * DateTime.now().plus(123) //~> in 123 milliseconds
    * @example
    * DateTime.now().plus({ minutes: 15 }) //~> in 15 minutes
    * @example
    * DateTime.now().plus({ days: 1 }) //~> this time tomorrow
    * @example
    * DateTime.now().plus({ days: -1 }) //~> this time yesterday
    * @example
    * DateTime.now().plus({ hours: 3, minutes: 13 }) //~> in 3 hr, 13 min
    * @example
    * DateTime.now().plus(Duration.fromObject({ hours: 3, minutes: 13 })) //~> in 3 hr, 13 min
    */
  def plus(duration: DurationLike): DateTime = js.native
  
  /**
    * Get the quarter
    *
    * @example DateTime.local(2017, 5, 25).quarter //=> 2
    */
  def quarter: QuarterNumbers | IfInvalid[Double] = js.native
  
  /**
    * "Set" the locale, numberingSystem, or outputCalendar. Returns a newly-constructed DateTime.
    *
    * @param properties - the properties to set
    *
    * @example
    * DateTime.local(2017, 5, 25).reconfigure({ locale: 'en-GB' })
    */
  def reconfigure(properties: LocaleOptions): DateTime = js.native
  
  /**
    * Returns the resolved Intl options for this DateTime.
    * This is useful in understanding the behavior of formatting methods
    *
    * @param opts - the same options as toLocaleString
    */
  def resolvedLocaleOptions(): ResolvedLocaleOptions = js.native
  def resolvedLocaleOptions(opts: LocaleOptions): ResolvedLocaleOptions = js.native
  def resolvedLocaleOptions(opts: DateTimeFormatOptions): ResolvedLocaleOptions = js.native
  
  /**
    * Get the second of the minute (0-59).
    *
    * @example
    * DateTime.local(2017, 5, 25, 9, 30, 52).second //=> 52
    */
  def second: SecondNumbers | IfInvalid[Double] = js.native
  
  /**
    * "Set" the values of specified units. Returns a newly-constructed DateTime.
    * You can only set units with this method; for "setting" metadata, see {@link DateTime.reconfigure} and {@link DateTime.setZone}.
    *
    * @param values - a mapping of units to numbers
    *
    * @example
    * dt.set({ year: 2017 })
    * @example
    * dt.set({ hour: 8, minute: 30 })
    * @example
    * dt.set({ weekday: 5 })
    * @example
    * dt.set({ year: 2005, ordinal: 234 })
    */
  def set(values: DateObjectUnits): DateTime = js.native
  
  /**
    * "Set" the locale. Returns a newly-constructed DateTime.
    * Just a convenient alias for reconfigure({ locale })
    *
    * @example
    * DateTime.local(2017, 5, 25).setLocale('en-GB')
    */
  def setLocale(locale: String): DateTime = js.native
  
  /**
    * "Set" the DateTime's zone to specified zone. Returns a newly-constructed DateTime.
    *
    * By default, the setter keeps the underlying time the same (as in, the same timestamp), but the new instance will report different local times and consider DSTs when making computations,
    * as with {@link DateTime.plus}. You may wish to use {@link DateTime.toLocal} and {@link DateTime.toUTC} which provide simple convenience wrappers for commonly used zones.
    *
    * @param zone - a zone identifier. As a string, that can be any IANA zone supported by the host environment, or a fixed-offset name of the form 'UTC+3', or the strings 'local' or 'utc'.
    * You may also supply an instance of a {@link Zone} class. Defaults to 'local'.
    * @param opts - options
    * @param opts.keepLocalTime - If true, adjust the underlying time so that the local time stays the same, but in the target zone. You should rarely need this. Defaults to false.
    */
  def setZone(): DateTime = js.native
  def setZone(zone: String): DateTime = js.native
  def setZone(zone: String, opts: ZoneOptions): DateTime = js.native
  def setZone(zone: Unit, opts: ZoneOptions): DateTime = js.native
  def setZone(zone: Zone): DateTime = js.native
  def setZone(zone: Zone, opts: ZoneOptions): DateTime = js.native
  
  /**
    * "Set" this DateTime to the beginning of the given unit.
    *
    * @param unit - The unit to go to the beginning of. Can be 'year', 'quarter', 'month', 'week', 'day', 'hour', 'minute', 'second', or 'millisecond'.
    *
    * @example
    * DateTime.local(2014, 3, 3).startOf('month').toISODate(); //=> '2014-03-01'
    * @example
    * DateTime.local(2014, 3, 3).startOf('year').toISODate(); //=> '2014-01-01'
    * @example
    * DateTime.local(2014, 3, 3).startOf('week').toISODate(); //=> '2014-03-03', weeks always start on Mondays
    * @example
    * DateTime.local(2014, 3, 3, 5, 30).startOf('day').toISOTime(); //=> '00:00.000-05:00'
    * @example
    * DateTime.local(2014, 3, 3, 5, 30).startOf('hour').toISOTime(); //=> '05:00:00.000-05:00'
    */
  def startOf(unit: DateTimeUnit): DateTime = js.native
  
  /**
    * Returns a BSON-serializable equivalent to this DateTime.
    */
  def toBSON(): js.Date = js.native
  
  // OUTPUT
  /**
    * Returns a string representation of this DateTime formatted according to the specified format string.
    * **You may not want this.** See {@link DateTime.toLocaleString} for a more flexible formatting tool. For a table of tokens and their interpretations,
    * see [here](https://moment.github.io/luxon/#/formatting?id=table-of-tokens).
    * Defaults to en-US if no locale has been specified, regardless of the system's locale.
    *
    * @param fmt - the format string
    * @param opts - opts to override the configuration options on this DateTime
    *
    * @example
    * DateTime.now().toFormat('yyyy LLL dd') //=> '2017 Apr 22'
    * @example
    * DateTime.now().setLocale('fr').toFormat('yyyy LLL dd') //=> '2017 avr. 22'
    * @example
    * DateTime.now().toFormat('yyyy LLL dd', { locale: "fr" }) //=> '2017 avr. 22'
    * @example
    * DateTime.now().toFormat("HH 'hours and' mm 'minutes'") //=> '20 hours and 55 minutes'
    */
  def toFormat(fmt: String): String | (IfInvalid[`Invalid DateTime`]) = js.native
  def toFormat(fmt: String, opts: LocaleOptions): String | (IfInvalid[`Invalid DateTime`]) = js.native
  
  /**
    * Returns a string representation of this DateTime appropriate for use in HTTP headers.
    * Specifically, the string conforms to RFC 1123.
    * @see https://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.3.1
    *
    * @example
    * DateTime.utc(2014, 7, 13).toHTTP() //=> 'Sun, 13 Jul 2014 00:00:00 GMT'
    * @example
    * DateTime.utc(2014, 7, 13, 19).toHTTP() //=> 'Sun, 13 Jul 2014 19:00:00 GMT'
    */
  def toHTTP(): String | IfInvalid[Null] = js.native
  
  /**
    * Returns an ISO 8601-compliant string representation of this DateTime
    *
    * @example
    * DateTime.utc(1982, 5, 25).toISO() //=> '1982-05-25T00:00:00.000Z'
    * @example
    * DateTime.now().toISO() //=> '2017-04-22T20:47:05.335-04:00'
    * @example
    * DateTime.now().toISO({ includeOffset: false }) //=> '2017-04-22T20:47:05.335'
    * @example
    * DateTime.now().toISO({ format: 'basic' }) //=> '20170422T204705.335-0400'
    */
  def toISO(): String | IfInvalid[Null] = js.native
  def toISO(opts: ToISOTimeOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns an ISO 8601-compliant string representation of this DateTime's date component
    *
    * @param opts - options
    * @param opts.format - choose between the basic and extended format. Defaults to 'extended'.
    *
    * @example
    * DateTime.utc(1982, 5, 25).toISODate() //=> '1982-05-25'
    * @example
    * DateTime.utc(1982, 5, 25).toISODate({ format: 'basic' }) //=> '19820525'
    */
  def toISODate(): String | IfInvalid[Null] = js.native
  def toISODate(opts: ToISODateOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns an ISO 8601-compliant string representation of this DateTime's time component
    *
    * @param opts - options
    * @param opts.suppressMilliseconds - exclude milliseconds from the format if they're 0. Defaults to false.
    * @param opts.suppressSeconds - exclude seconds from the format if they're 0. Defaults to false.
    * @param opts.includeOffset - include the offset, such as 'Z' or '-04:00'. Defaults to true.
    * @param opts.includePrefix - include the `T` prefix. Defaults to false.
    * @param opts.format - choose between the basic and extended format. Defaults to 'extended'.
    *
    * @example
    * DateTime.utc().set({ hour: 7, minute: 34 }).toISOTime() //=> '07:34:19.361Z'
    * @example
    * DateTime.utc().set({ hour: 7, minute: 34, seconds: 0, milliseconds: 0 }).toISOTime({ suppressSeconds: true }) //=> '07:34Z'
    * @example
    * DateTime.utc().set({ hour: 7, minute: 34 }).toISOTime({ format: 'basic' }) //=> '073419.361Z'
    * @example
    * DateTime.utc().set({ hour: 7, minute: 34 }).toISOTime({ includePrefix: true }) //=> 'T07:34:19.361Z'
    */
  def toISOTime(): String | IfInvalid[Null] = js.native
  def toISOTime(opts: ToISOTimeOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns an ISO 8601-compliant string representation of this DateTime's week date
    *
    * @example
    * DateTime.utc(1982, 5, 25).toISOWeekDate() //=> '1982-W21-2'
    */
  def toISOWeekDate(): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a JavaScript Date equivalent to this DateTime.
    */
  def toJSDate(): js.Date = js.native
  
  /**
    * Returns an ISO 8601 representation of this DateTime appropriate for use in JSON.
    */
  def toJSON(): String | IfInvalid[Null] = js.native
  
  /**
    * "Set" the DateTime's zone to the host's local zone. Returns a newly-constructed DateTime.
    *
    * Equivalent to `setZone('local')`
    */
  def toLocal(): DateTime = js.native
  
  /**
    * Returns an array of format "parts", meaning individual tokens along with metadata. This is allows callers to post-process individual sections of the formatted output.
    * Defaults to the system's locale if no locale has been specified
    * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat/formatToParts
    *
    * @example
    * DateTime.now().toLocaleParts(); //=> [
    *                                 //=>   { type: 'day', value: '25' },
    *                                 //=>   { type: 'literal', value: '/' },
    *                                 //=>   { type: 'month', value: '05' },
    *                                 //=>   { type: 'literal', value: '/' },
    *                                 //=>   { type: 'year', value: '1982' }
    *                                 //=> ]
    */
  def toLocaleParts(): js.Array[DateTimeFormatPart] | IfInvalid[js.Array[Any]] = js.native
  def toLocaleParts(opts: DateTimeFormatOptions): js.Array[DateTimeFormatPart] | IfInvalid[js.Array[Any]] = js.native
  
  def toLocaleString(formatOpts: Unit, opts: LocaleOptions): String | (IfInvalid[`Invalid DateTime`]) = js.native
  def toLocaleString(formatOpts: DateTimeFormatOptions): String | (IfInvalid[`Invalid DateTime`]) = js.native
  def toLocaleString(formatOpts: DateTimeFormatOptions, opts: LocaleOptions): String | (IfInvalid[`Invalid DateTime`]) = js.native
  
  /**
    * Returns the epoch milliseconds of this DateTime.
    */
  def toMillis(): Double | IfInvalid[Double] = js.native
  
  /**
    * Returns a JavaScript object with this DateTime's year, month, day, and so on.
    *
    * @param opts - options for generating the object
    * @param opts.includeConfig - include configuration attributes in the output. Defaults to false.
    *
    * @example
    * DateTime.now().toObject() //=> { year: 2017, month: 4, day: 22, hour: 20, minute: 49, second: 42, millisecond: 268 }
    */
  def toObject[IncludeConfig /* <: js.UndefOr[Boolean] */](): ToObjectOutput[IncludeConfig] = js.native
  def toObject[IncludeConfig /* <: js.UndefOr[Boolean] */](opts: `0`[IncludeConfig]): ToObjectOutput[IncludeConfig] = js.native
  
  /**
    * Returns an RFC 2822-compatible string representation of this DateTime, always in UTC
    *
    * @example
    * DateTime.utc(2014, 7, 13).toRFC2822() //=> 'Sun, 13 Jul 2014 00:00:00 +0000'
    * @example
    * DateTime.local(2014, 7, 13).toRFC2822() //=> 'Sun, 13 Jul 2014 00:00:00 -0400'
    */
  def toRFC2822(): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a string representation of this time relative to now, such as "in two days".
    * Can only internationalize if your platform supports Intl.RelativeTimeFormat.
    * Rounds down by default.
    *
    * @example
    * DateTime.now().plus({ days: 1 }).toRelative() //=> "in 1 day"
    * @example
    * DateTime.now().setLocale("es").toRelative({ days: 1 }) //=> "dentro de 1 día"
    * @example
    * DateTime.now().plus({ days: 1 }).toRelative({ locale: "fr" }) //=> "dans 23 heures"
    * @example
    * DateTime.now().minus({ days: 2 }).toRelative() //=> "2 days ago"
    * @example
    * DateTime.now().minus({ days: 2 }).toRelative({ unit: "hours" }) //=> "48 hours ago"
    * @example
    * DateTime.now().minus({ hours: 36 }).toRelative({ round: false }) //=> "1.5 days ago"
    */
  def toRelative(): String | IfInvalid[Null] = js.native
  def toRelative(options: ToRelativeOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a string representation of this date relative to today, such as "yesterday" or "next month".
    * Only internationalizes on platforms that support Intl.RelativeTimeFormat.
    *
    * @example
    * DateTime.now().plus({ days: 1 }).toRelativeCalendar() //=> "tomorrow"
    * @example
    * DateTime.now().setLocale("es").plus({ days: 1 }).toRelative() //=> ""mañana"
    * @example
    * DateTime.now().plus({ days: 1 }).toRelativeCalendar({ locale: "fr" }) //=> "demain"
    * @example
    * DateTime.now().minus({ days: 2 }).toRelativeCalendar() //=> "2 days ago"
    */
  def toRelativeCalendar(): String | IfInvalid[Null] = js.native
  def toRelativeCalendar(options: ToRelativeCalendarOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a string representation of this DateTime for use in SQL DateTime
    *
    * @example
    * DateTime.utc(2014, 7, 13).toSQL() //=> '2014-07-13 00:00:00.000 Z'
    * @example
    * DateTime.local(2014, 7, 13).toSQL() //=> '2014-07-13 00:00:00.000 -04:00'
    * @example
    * DateTime.local(2014, 7, 13).toSQL({ includeOffset: false }) //=> '2014-07-13 00:00:00.000'
    * @example
    * DateTime.local(2014, 7, 13).toSQL({ includeZone: true }) //=> '2014-07-13 00:00:00.000 America/New_York'
    */
  def toSQL(): String | IfInvalid[Null] = js.native
  def toSQL(opts: ToSQLOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a string representation of this DateTime appropriate for use in SQL Date
    *
    * @example
    * DateTime.utc(2014, 7, 13).toSQLDate() //=> '2014-07-13'
    */
  def toSQLDate(): String | IfInvalid[Null] = js.native
  
  /**
    * Returns a string representation of this DateTime appropriate for use in SQL Time
    *
    * @example
    * DateTime.utc().toSQL() //=> '05:15:16.345'
    * @example
    * DateTime.now().toSQL() //=> '05:15:16.345 -04:00'
    * @example
    * DateTime.now().toSQL({ includeOffset: false }) //=> '05:15:16.345'
    * @example
    * DateTime.now().toSQL({ includeZone: false }) //=> '05:15:16.345 America/New_York'
    */
  def toSQLTime(): String | IfInvalid[Null] = js.native
  def toSQLTime(opts: ToSQLOptions): String | IfInvalid[Null] = js.native
  
  /**
    * Returns the epoch seconds of this DateTime.
    */
  def toSeconds(): Double | IfInvalid[Double] = js.native
  
  // TRANSFORM
  /**
    * "Set" the DateTime's zone to UTC. Returns a newly-constructed DateTime.
    *
    * Equivalent to {@link DateTime.setZone}('utc')
    *
    * @param offset - optionally, an offset from UTC in minutes. Defaults to 0.
    * @param opts - options to pass to `setZone()`. Defaults to {}.
    */
  def toUTC(): DateTime = js.native
  def toUTC(offset: Double): DateTime = js.native
  def toUTC(offset: Double, opts: ZoneOptions): DateTime = js.native
  def toUTC(offset: Unit, opts: ZoneOptions): DateTime = js.native
  
  /**
    * Returns the epoch seconds (as a whole number) of this DateTime.
    */
  def toUnixInteger(): Double | IfInvalid[Double] = js.native
  
  /**
    * Return an Interval spanning between this DateTime and another DateTime
    *
    * @param otherDateTime - the other end point of the Interval
    */
  def until(otherDateTime: DateTime): Interval = js.native
  
  /**
    * Get the week number of the week year (1-52ish).
    * @see https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @example
    * DateTime.local(2017, 5, 25).weekNumber //=> 21
    */
  def weekNumber: WeekNumbers | IfInvalid[Double] = js.native
  
  /**
    * Get the week year
    * @see https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @example
    * DateTime.local(2014, 12, 31).weekYear //=> 2015
    */
  def weekYear: Double | IfInvalid[Double] = js.native
  
  /**
    * Get the day of the week.
    * 1 is Monday and 7 is Sunday
    * @see https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @example
    * DateTime.local(2014, 11, 31).weekday //=> 4
    */
  def weekday: WeekdayNumbers | IfInvalid[Double] = js.native
  
  /**
    * Get the human readable long weekday, such as 'Monday'.
    * Defaults to the system's locale if no locale has been specified
    *
    * @example
    * DateTime.local(2017, 10, 30).weekdayLong //=> Monday
    */
  def weekdayLong: String | IfInvalid[Null] = js.native
  
  /**
    * Get the human readable short weekday, such as 'Mon'.
    * Defaults to the system's locale if no locale has been specified
    *
    * @example
    * DateTime.local(2017, 10, 30).weekdayShort //=> Mon
    */
  def weekdayShort: String | IfInvalid[Null] = js.native
  
  /**
    * Returns the number of weeks in this DateTime's year
    * @see https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @example
    * DateTime.local(2004).weeksInWeekYear //=> 53
    * @example
    * DateTime.local(2013).weeksInWeekYear //=> 52
    */
  def weeksInWeekYear: PossibleWeeksInYear | IfInvalid[Double] = js.native
  
  /**
    * Get the year
    *
    * @example DateTime.local(2017, 5, 25).year //=> 2017
    */
  def year: Double | IfInvalid[Double] = js.native
  
  /**
    * Get the time zone associated with this DateTime.
    */
  def zone: Zone = js.native
  
  /**
    * Get the name of the time zone.
    */
  def zoneName: String | IfInvalid[Null] = js.native
}
/* static members */
object DateTime {
  
  @JSImport("luxon/src/datetime", "DateTime")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Produce the fully expanded format token for the locale
    * Does NOT quote characters, so quoted tokens will not round trip correctly
    * @param fmt - the format string
    * @param localeOpts - Opts to override the configuration options on this DateTime
    */
  inline def expandFormat(fmt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expandFormat")(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def expandFormat(fmt: String, localeOpts: LocaleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandFormat")(fmt.asInstanceOf[js.Any], localeOpts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Create a DateTime from an input string and format string.
    * Defaults to en-US if no locale has been specified, regardless of the system's locale. For a table of tokens and their interpretations,
    * see [here](https://moment.github.io/luxon/#/parsing?id=table-of-tokens).
    *
    * @param text - the string to parse
    * @param fmt - the format the string is expected to be in (see the link below for the formats)
    * @param opts - options to affect the creation
    * @param opts.zone - use this zone if no offset is specified in the input string itself. Will also convert the DateTime to this zone. Defaults to 'local'.
    * @param opts.setZone - override the zone with a zone specified in the string itself, if it specifies one. Defaults to false.
    * @param opts.locale - a locale string to use when parsing. Will also set the DateTime to this locale. Defaults to 'en-US'.
    * @param opts.numberingSystem - the numbering system to use when parsing. Will also set the resulting DateTime to this numbering system
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    */
  inline def fromFormat(text: String, fmt: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def fromFormat(text: String, fmt: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  // MISC
  /**
    * Explain how a string would be parsed by fromFormat()
    *
    * @param text - the string to parse
    * @param fmt - the format the string is expected to be in (see description)
    * @param options - options taken by fromFormat()
    */
  inline def fromFormatExplain(text: String, fmt: String): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormatExplain")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  inline def fromFormatExplain(text: String, fmt: String, options: DateTimeOptions): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormatExplain")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  
  /**
    * Create a DateTime from an HTTP header date
    *
    * @see https://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.3.1
    *
    * @param text - the HTTP header date
    * @param opts - options to affect the creation
    * @param opts.zone - convert the time to this zone. Since HTTP dates are always in UTC,
    * this has no effect on the interpretation of string,merely the zone the resulting DateTime is expressed in. Defaults to 'local'.
    * @param opts.setZone - override the zone with the fixed-offset zone specified in the string. For HTTP dates, this is always UTC,
    * so this option is equivalent to setting the `zone` option to 'utc', but this option is included for consistency with similar methods. Defaults to false.
    * @param opts.locale - a locale to set on the resulting DateTime instance. Defaults to 'system's locale'.
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param opts.numberingSystem - the numbering system to set on the resulting DateTime instance
    *
    * @example
    * DateTime.fromHTTP('Sun, 06 Nov 1994 08:49:37 GMT')
    * @example
    * DateTime.fromHTTP('Sunday, 06-Nov-94 08:49:37 GMT')
    * @example
    * DateTime.fromHTTP('Sun Nov  6 08:49:37 1994')
    */
  inline def fromHTTP(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromHTTP(text: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from an ISO 8601 string
    *
    * @param text - the ISO string
    * @param opts - options to affect the creation
    * @param opts.zone - use this zone if no offset is specified in the input string itself. Will also convert the time to this zone. Defaults to 'local'.
    * @param opts.setZone - override the zone with a fixed-offset zone specified in the string itself, if it specifies one. Defaults to false.
    * @param opts.locale - a locale to set on the resulting DateTime instance. Defaults to 'system's locale'.
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param opts.numberingSystem - the numbering system to set on the resulting DateTime instance
    *
    * @example
    * DateTime.fromISO('2016-05-25T09:08:34.123')
    * @example
    * DateTime.fromISO('2016-05-25T09:08:34.123+06:00')
    * @example
    * DateTime.fromISO('2016-05-25T09:08:34.123+06:00', {setZone: true})
    * @example
    * DateTime.fromISO('2016-05-25T09:08:34.123', {zone: 'utc'})
    * @example
    * DateTime.fromISO('2016-W05-4')
    */
  inline def fromISO(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromISO(text: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from a JavaScript Date object. Uses the default zone.
    *
    * @param date - a JavaScript Date object
    * @param options - configuration options for the DateTime
    * @param options.zone - the zone to place the DateTime into
    */
  inline def fromJSDate(date: js.Date): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromJSDate(date: js.Date, options: typings.luxon.anon.Zone): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from a number of milliseconds since the epoch (meaning since 1 January 1970 00:00:00 UTC). Uses the default zone.
    *
    * @param milliseconds - a number of milliseconds since 1970 UTC
    * @param options - configuration options for the DateTime
    * @param options.zone - the zone to place the DateTime into. Defaults to 'local'.
    * @param options.locale - a locale to set on the resulting DateTime instance
    * @param options.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param options.numberingSystem - the numbering system to set on the resulting DateTime instance
    */
  inline def fromMillis(milliseconds: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromMillis(milliseconds: Double, options: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from a JavaScript object with keys like 'year' and 'hour' with reasonable defaults.
    *
    * @param obj - the object to create the DateTime from
    * @param obj.year - a year, such as 1987
    * @param obj.month - a month, 1-12
    * @param obj.day - a day of the month, 1-31, depending on the month
    * @param obj.ordinal - day of the year, 1-365 or 366
    * @param obj.weekYear - an ISO week year
    * @param obj.weekNumber - an ISO week number, between 1 and 52 or 53, depending on the year
    * @param obj.weekday - an ISO weekday, 1-7, where 1 is Monday and 7 is Sunday
    * @param obj.hour - hour of the day, 0-23
    * @param obj.minute - minute of the hour, 0-59
    * @param obj.second - second of the minute, 0-59
    * @param obj.millisecond - millisecond of the second, 0-999
    * @param opts - options for creating this DateTime
    * @param opts.zone - interpret the numbers in the context of a particular zone. Can take any value taken as the first argument to setZone(). Defaults to 'local'.
    * @param opts.locale - a locale to set on the resulting DateTime instance. Defaults to 'system's locale'.
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param opts.numberingSystem - the numbering system to set on the resulting DateTime instance
    *
    * @example
    * DateTime.fromObject({ year: 1982, month: 5, day: 25}).toISODate() //=> '1982-05-25'
    * @example
    * DateTime.fromObject({ year: 1982 }).toISODate() //=> '1982-01-01'
    * @example
    * DateTime.fromObject({ hour: 10, minute: 26, second: 6 }) //~> today at 10:26:06
    * @example
    * DateTime.fromObject({ hour: 10, minute: 26, second: 6 }, { zone: 'utc' }),
    * @example
    * DateTime.fromObject({ hour: 10, minute: 26, second: 6 }, { zone: 'local' })
    * @example
    * DateTime.fromObject({ hour: 10, minute: 26, second: 6 }, { }zone: 'America/New_York' })
    * @example
    * DateTime.fromObject({ weekYear: 2016, weekNumber: 2, weekday: 3 }).toISODate() //=> '2016-01-13'
    */
  inline def fromObject(obj: DateObjectUnits): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromObject(obj: DateObjectUnits, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from an RFC 2822 string
    *
    * @param text - the RFC 2822 string
    * @param opts - options to affect the creation
    * @param opts.zone - convert the time to this zone. Since the offset is always specified in the string itself,
    * this has no effect on the interpretation of string, merely the zone the resulting DateTime is expressed in. Defaults to 'local'
    * @param opts.setZone - override the zone with a fixed-offset zone specified in the string itself, if it specifies one. Defaults to false.
    * @param opts.locale - a locale to set on the resulting DateTime instance. Defaults to 'system's locale'.
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param opts.numberingSystem - the numbering system to set on the resulting DateTime instance
    *
    * @example
    * DateTime.fromRFC2822('25 Nov 2016 13:23:12 GMT')
    * @example
    * DateTime.fromRFC2822('Fri, 25 Nov 2016 13:23:12 +0600')
    * @example
    * DateTime.fromRFC2822('25 Nov 2016 13:23 Z')
    */
  inline def fromRFC2822(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromRFC2822(text: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from a SQL date, time, or datetime
    * Defaults to en-US if no locale has been specified, regardless of the system's locale
    *
    * @param text - the string to parse
    * @param opts - options to affect the creation
    * @param opts.zone - use this zone if no offset is specified in the input string itself. Will also convert the DateTime to this zone. Defaults to 'local'.
    * @param opts.setZone - override the zone with a zone specified in the string itself, if it specifies one. Defaults to false.
    * @param opts.locale - a locale string to use when parsing. Will also set the DateTime to this locale. Defaults to 'en-US'.
    * @param opts.numberingSystem - the numbering system to use when parsing. Will also set the resulting DateTime to this numbering system
    * @param opts.outputCalendar - the output calendar to set on the resulting DateTime instance
    *
    * @example
    * DateTime.fromSQL('2017-05-15')
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34')
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34.342')
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34.342+06:00')
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34.342 America/Los_Angeles')
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34.342 America/Los_Angeles', { setZone: true })
    * @example
    * DateTime.fromSQL('2017-05-15 09:12:34.342', { zone: 'America/Los_Angeles' })
    * @example
    * DateTime.fromSQL('09:12:34.342')
    */
  inline def fromSQL(text: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromSQL(text: String, opts: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime from a number of seconds since the epoch (meaning since 1 January 1970 00:00:00 UTC). Uses the default zone.
    *
    * @param seconds - a number of seconds since 1970 UTC
    * @param options - configuration options for the DateTime
    * @param options.zone - the zone to place the DateTime into. Defaults to 'local'.
    * @param options.locale - a locale to set on the resulting DateTime instance
    * @param options.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param options.numberingSystem - the numbering system to set on the resulting DateTime instance
    */
  inline def fromSeconds(seconds: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def fromSeconds(seconds: Double, options: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * @deprecated use fromFormat instead
    */
  inline def fromString(text: String, format: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def fromString(text: String, format: String, options: DateTimeOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * @deprecated use fromFormatExplain instead
    */
  inline def fromStringExplain(text: String, fmt: String): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringExplain")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  inline def fromStringExplain(text: String, fmt: String, options: DateTimeOptions): ExplainedFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringExplain")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExplainedFormat]
  
  /**
    * Create an invalid DateTime.
    *
    * @param reason - simple string of why this DateTime is invalid. Should not contain parameters or anything else data-dependent
    * @param explanation - longer explanation, may include parameters and other useful debugging information. Defaults to null.
    */
  inline def invalid(reason: String): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def invalid(reason: String, explanation: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Check if an object is a DateTime. Works across context boundaries
    *
    * @param o
    */
  inline def isDateTime(o: Any): /* is luxon.luxon/src/datetime.DateTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTime")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon/src/datetime.DateTime */ Boolean]
  
  inline def local(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[DateTime]
  inline def local(opts: DateTimeJSOptions): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(opts.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def local(year: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, hour: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  /**
    * Create a local DateTime
    *
    * @param year - The calendar year. If omitted (as in, call `local()` with no arguments), the current time will be used
    * @param month - The month, 1-indexed
    * @param day - The day of the month, 1-indexed
    * @param hour - The hour of the day, in 24-hour time
    * @param minute - The minute of the hour, meaning a number between 0 and 59
    * @param second - The second of the minute, meaning a number between 0 and 59
    * @param millisecond - The millisecond of the second, meaning a number between 0 and 999
    * @param opts
    *
    * @example
    * DateTime.local()                                  //~> now
    * @example
    * DateTime.local({ zone: "America/New_York" })      //~> now, in US east coast time
    * @example
    * DateTime.local(2017)                              //~> 2017-01-01T00:00:00
    * @example
    * DateTime.local(2017, 3)                           //~> 2017-03-01T00:00:00
    * @example
    * DateTime.local(2017, 3, 12, { locale: "fr")       //~> 2017-03-12T00:00:00, with a French locale
    * @example
    * DateTime.local(2017, 3, 12, 5)                    //~> 2017-03-12T05:00:00
    * @example
    * DateTime.local(2017, 3, 12, 5, { zone: "utc" })   //~> 2017-03-12T05:00:00, in UTC
    * @example
    * DateTime.local(2017, 3, 12, 5, 45)                //~> 2017-03-12T05:45:00
    * @example
    * DateTime.local(2017, 3, 12, 5, 45, 10)            //~> 2017-03-12T05:45:10
    * @example
    * DateTime.local(2017, 3, 12, 5, 45, 10, 765)       //~> 2017-03-12T05:45:10.765
    */
  inline def local(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double,
    opts: DateTimeJSOptions
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    opts: DateTimeJSOptions
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, hour: Double, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, day: Double, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, month: Double, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def local(year: Double, opts: DateTimeJSOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  
  /**
    * Return the max of several date times
    *
    * @param dateTimes - the DateTimes from which to choose the maximum
    */
  inline def max(dateTimes: DateTime*): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dateTimes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DateTime]
  
  /**
    * Return the min of several date times
    *
    * @param dateTimes - the DateTimes from which to choose the minimum
    */
  inline def min(dateTimes: DateTime*): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dateTimes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DateTime]
  
  /**
    * Create a DateTime for the current instant, in the system's time zone.
    *
    * Use Settings to override these default values if needed.
    * @example
    * DateTime.now().toISO() //~> now in the ISO format
    */
  inline def now(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[DateTime]
  
  /**
    * Produce the format string for a set of options
    *
    * @param formatOpts - Intl.DateTimeFormat constructor options and configuration options
    * @param localeOpts - Opts to override the configuration options on this DateTime
    *
    * @example
    * DateTime.parseFormatForOpts(DateTime.DATETIME_FULL); //=> "MMMM d, yyyyy, h:m a ZZZ"
    */
  inline def parseFormatForOpts(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatForOpts")().asInstanceOf[String | Null]
  inline def parseFormatForOpts(formatOpts: Unit, localeOpts: LocaleOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatForOpts")(formatOpts.asInstanceOf[js.Any], localeOpts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def parseFormatForOpts(formatOpts: DateTimeFormatOptions): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatForOpts")(formatOpts.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def parseFormatForOpts(formatOpts: DateTimeFormatOptions, localeOpts: LocaleOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatForOpts")(formatOpts.asInstanceOf[js.Any], localeOpts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def utc(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[DateTime]
  inline def utc(options: LocaleOptions): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(options.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def utc(year: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, hour: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double, options: LocaleOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  /**
    * Create a DateTime in UTC
    *
    * @param year - The calendar year. If omitted (as in, call `utc()` with no arguments), the current time will be used
    * @param month - The month, 1-indexed
    * @param day - The day of the month
    * @param hour - The hour of the day, in 24-hour time
    * @param minute - The minute of the hour, meaning a number between 0 and 59
    * @param second - The second of the minute, meaning a number between 0 and 59
    * @param millisecond - The millisecond of the second, meaning a number between 0 and 999
    * @param options - configuration options for the DateTime
    * @param options.locale - a locale to set on the resulting DateTime instance
    * @param options.outputCalendar - the output calendar to set on the resulting DateTime instance
    * @param options.numberingSystem - the numbering system to set on the resulting DateTime instance
    *
    * @example
    * DateTime.utc()                                            //~> now
    * @example
    * DateTime.utc(2017)                                        //~> 2017-01-01T00:00:00Z
    * @example
    * DateTime.utc(2017, 3)                                     //~> 2017-03-01T00:00:00Z
    * @example
    * DateTime.utc(2017, 3, 12)                                 //~> 2017-03-12T00:00:00Z
    * @example
    * DateTime.utc(2017, 3, 12, 5)                              //~> 2017-03-12T05:00:00Z
    * @example
    * DateTime.utc(2017, 3, 12, 5, 45)                          //~> 2017-03-12T05:45:00Z
    * @example
    * DateTime.utc(2017, 3, 12, 5, 45, { locale: "fr" } )       //~> 2017-03-12T05:45:00Z with a French locale
    * @example
    * DateTime.utc(2017, 3, 12, 5, 45, 10)                      //~> 2017-03-12T05:45:10Z
    * @example
    * DateTime.utc(2017, 3, 12, 5, 45, 10, 765, { locale: "fr") //~> 2017-03-12T05:45:10.765Z with a French locale
    */
  inline def utc(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double,
    options: LocaleOptions
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    options: LocaleOptions
  ): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, hour: Double, options: LocaleOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, day: Double, options: LocaleOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, month: Double, options: LocaleOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  inline def utc(year: Double, options: LocaleOptions): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTime]
}
