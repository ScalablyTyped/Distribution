package typings.luxon

import typings.luxon.srcDatetimeMod.DateObjectUnits
import typings.luxon.srcDatetimeMod.DateTimeJSOptions
import typings.luxon.srcDatetimeMod.DateTimeOptions
import typings.luxon.srcDatetimeMod.ExplainedFormat
import typings.luxon.srcDatetimeMod.LocaleOptions
import typings.luxon.srcDurationMod.DurationLike
import typings.luxon.srcDurationMod.DurationLikeObject
import typings.luxon.srcDurationMod.DurationOptions
import typings.luxon.srcInfoMod.Features
import typings.luxon.srcInfoMod.InfoCalendarOptions
import typings.luxon.srcInfoMod.InfoOptions
import typings.luxon.srcInfoMod.InfoUnitOptions
import typings.luxon.srcIntervalMod.DateInput
import typings.luxon.srcMiscMod.DateTimeFormatOptions
import typings.luxon.srcMiscMod.StringUnitLength
import typings.luxon.srcMiscMod.UnitLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLuxonMod {
  
  @JSImport("luxon/src/luxon", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typings.luxon.srcDatetimeMod.DateTime {
    /* private */ def this(config: Any) = this()
  }
  /* static members */
  object DateTime {
    
    @JSImport("luxon/src/luxon", "DateTime")
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
    inline def fromFormat(text: String, fmt: String): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromFormat(text: String, fmt: String, opts: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFormat")(text.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromHTTP(text: String): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromHTTP(text: String, opts: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTP")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromISO(text: String): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromISO(text: String, opts: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * Create a DateTime from a JavaScript Date object. Uses the default zone.
      *
      * @param date - a JavaScript Date object
      * @param options - configuration options for the DateTime
      * @param options.zone - the zone to place the DateTime into
      */
    inline def fromJSDate(date: js.Date): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromJSDate(date: js.Date, options: typings.luxon.anon.Zone): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromMillis(milliseconds: Double): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromMillis(milliseconds: Double, options: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromObject(obj: DateObjectUnits): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromObject(obj: DateObjectUnits, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromRFC2822(text: String): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromRFC2822(text: String, opts: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRFC2822")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromSQL(text: String): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromSQL(text: String, opts: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSQL")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def fromSeconds(seconds: Double): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromSeconds(seconds: Double, options: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * @deprecated use fromFormat instead
      */
    inline def fromString(text: String, format: String): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def fromString(text: String, format: String, options: DateTimeOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    inline def invalid(reason: String): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def invalid(reason: String, explanation: String): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * Check if an object is a DateTime. Works across context boundaries
      *
      * @param o
      */
    inline def isDateTime(o: Any): /* is luxon.luxon/src/datetime.DateTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTime")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon/src/datetime.DateTime */ Boolean]
    
    inline def local(): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, hour: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
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
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Double,
      opts: DateTimeJSOptions
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      opts: DateTimeJSOptions
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, hour: Double, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, day: Double, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, month: Double, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def local(year: Double, opts: DateTimeJSOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(year.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * Return the max of several date times
      *
      * @param dateTimes - the DateTimes from which to choose the maximum
      */
    inline def max(dateTimes: typings.luxon.srcDatetimeMod.DateTime*): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dateTimes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * Return the min of several date times
      *
      * @param dateTimes - the DateTimes from which to choose the minimum
      */
    inline def min(dateTimes: typings.luxon.srcDatetimeMod.DateTime*): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dateTimes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
    /**
      * Create a DateTime for the current instant, in the system's time zone.
      *
      * Use Settings to override these default values if needed.
      * @example
      * DateTime.now().toISO() //~> now in the ISO format
      */
    inline def now(): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    
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
    
    inline def utc(): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(options.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double): typings.luxon.srcDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, hour: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double, options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
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
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Double,
      options: LocaleOptions
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      options: LocaleOptions
    ): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, hour: Double, options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, day: Double, options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, month: Double, options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
    inline def utc(year: Double, options: LocaleOptions): typings.luxon.srcDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(year.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDatetimeMod.DateTime]
  }
  
  @JSImport("luxon/src/luxon", "Duration")
  @js.native
  open class Duration protected ()
    extends typings.luxon.srcDurationMod.Duration {
    /* private */ def this(config: Any) = this()
  }
  /* static members */
  object Duration {
    
    @JSImport("luxon/src/luxon", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Duration from DurationLike.
      *
      * @param durationLike
      * Either a Luxon Duration, a number of milliseconds, or the object argument to Duration.fromObject()
      */
    inline def fromDurationLike(durationLike: DurationLike): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDurationLike")(durationLike.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Create a Duration from an ISO 8601 duration string.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Durations
      *
      * @param text - text to parse
      * @param opts - options for parsing
      * @param opts.locale - the locale to use. Defaults to 'en-US'.
      * @param opts.numberingSystem - the numbering system to use
      * @param opts.conversionAccuracy - the conversion system to use. Defaults to 'casual'.
      *
      * @example
      * Duration.fromISO('P3Y6M1W4DT12H30M5S').toObject() //=> { years: 3, months: 6, weeks: 1, days: 4, hours: 12, minutes: 30, seconds: 5 }
      * @example
      * Duration.fromISO('PT23H').toObject() //=> { hours: 23 }
      * @example
      * Duration.fromISO('P5Y3M').toObject() //=> { years: 5, months: 3 }
      */
    inline def fromISO(text: String): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    inline def fromISO(text: String, opts: DurationOptions): typings.luxon.srcDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Create a Duration from an ISO 8601 time string.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Times
      *
      * @param text - text to parse
      * @param opts - options for parsing
      * @param opts.locale - the locale to use. Defaults to 'en-US'.
      * @param opts.numberingSystem - the numbering system to use
      * @param opts.conversionAccuracy - the conversion system to use. Defaults to 'casual'.
      *
      * @example
      * Duration.fromISOTime('11:22:33.444').toObject() //=> { hours: 11, minutes: 22, seconds: 33, milliseconds: 444 }
      * @example
      * Duration.fromISOTime('11:00').toObject() //=> { hours: 11, minutes: 0, seconds: 0 }
      * @example
      * Duration.fromISOTime('T11:00').toObject() //=> { hours: 11, minutes: 0, seconds: 0 }
      * @example
      * Duration.fromISOTime('1100').toObject() //=> { hours: 11, minutes: 0, seconds: 0 }
      * @example
      * Duration.fromISOTime('T1100').toObject() //=> { hours: 11, minutes: 0, seconds: 0 }
      */
    inline def fromISOTime(text: String): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISOTime")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    inline def fromISOTime(text: String, opts: DurationOptions): typings.luxon.srcDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISOTime")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Create Duration from a number of milliseconds.
      *
      * @param count - of milliseconds
      * @param opts - options for parsing
      * @param opts.locale - the locale to use
      * @param opts.numberingSystem - the numbering system to use
      * @param opts.conversionAccuracy - the conversion system to use
      */
    inline def fromMillis(count: Double): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    inline def fromMillis(count: Double, opts: DurationOptions): typings.luxon.srcDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Create a Duration from a JavaScript object with keys like 'years' and 'hours'.
      * If this object is empty then a zero milliseconds duration is returned.
      *
      * @param obj - the object to create the DateTime from
      * @param obj.years
      * @param obj.quarters
      * @param obj.months
      * @param obj.weeks
      * @param obj.days
      * @param obj.hours
      * @param obj.minutes
      * @param obj.seconds
      * @param obj.milliseconds
      * @param opts - options for creating this Duration. Defaults to {}.
      * @param opts.locale - the locale to use. Defaults to 'en-US'.
      * @param opts.numberingSystem - the numbering system to use
      * @param opts.conversionAccuracy - the conversion system to use. Defaults to 'casual'.
      */
    inline def fromObject(obj: DurationLikeObject): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    inline def fromObject(obj: DurationLikeObject, opts: DurationOptions): typings.luxon.srcDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Create an invalid Duration.
      *
      * @param reason - simple string of why this datetime is invalid. Should not contain parameters or anything else data-dependent
      * @param explanation - longer explanation, may include parameters and other useful debugging information. Defaults to null.
      */
    inline def invalid(reason: String): typings.luxon.srcDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    inline def invalid(reason: String, explanation: String): typings.luxon.srcDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcDurationMod.Duration]
    
    /**
      * Check if an object is a Duration. Works across context boundaries
      *
      * @param o
      */
    inline def isDuration(o: Any): /* is luxon.luxon/src/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon/src/duration.Duration */ Boolean]
  }
  
  @JSImport("luxon/src/luxon", "FixedOffsetZone")
  @js.native
  open class FixedOffsetZone ()
    extends typings.luxon.srcZoneMod.FixedOffsetZone
  /* static members */
  object FixedOffsetZone {
    
    @JSImport("luxon/src/luxon", "FixedOffsetZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an instance with a specified offset
      *
      * @param offset - The offset in minutes
      */
    inline def instance(offset: Double): typings.luxon.srcZoneMod.FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(offset.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.FixedOffsetZone]
    
    /**
      * Get an instance of FixedOffsetZone from a UTC offset string, like "UTC+6"
      *
      * @param s - The offset string to parse
      *
      * @example
      * FixedOffsetZone.parseSpecifier("UTC+6")
      * @example
      * FixedOffsetZone.parseSpecifier("UTC+06")
      * @example
      * FixedOffsetZone.parseSpecifier("UTC-6:00")
      */
    inline def parseSpecifier(s: String): typings.luxon.srcZoneMod.FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.FixedOffsetZone]
  }
  
  @JSImport("luxon/src/luxon", "IANAZone")
  @js.native
  open class IANAZone protected ()
    extends typings.luxon.srcZoneMod.IANAZone {
    def this(name: String) = this()
  }
  /* static members */
  object IANAZone {
    
    @JSImport("luxon/src/luxon", "IANAZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Same as constructor but has caching.
      */
    inline def create(name: String): typings.luxon.srcZoneMod.IANAZone = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.IANAZone]
    
    /**
      * Returns whether the provided string is a valid specifier.
      * This only checks the string's format, not that the specifier
      * identifies a known zone; see {@link isValidZone} for that.
      *
      * @param s - The string to check validity on
      *
      * @example
      * IANAZone.isValidSpecifier("America/New_York") //=> true
      * @example
      * IANAZone.isValidSpecifier("Fantasia/Castle") //=> true
      * @example
      * IANAZone.isValidSpecifier("Sport~~blorp") //=> false
      */
    inline def isValidSpecifier(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns whether the provided string identifies a real zone
      *
      * @param zone - The string to check
      *
      * @example
      * IANAZone.isValidZone("America/New_York") //=> true
      * @example
      * IANAZone.isValidZone("Fantasia/Castle") //=> false
      * @example
      * IANAZone.isValidZone("Sport~~blorp") //=> false
      */
    inline def isValidZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Reset local caches. Should only be necessary in testing scenarios.
      */
    inline def resetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCache")().asInstanceOf[Unit]
  }
  
  object Info {
    
    @JSImport("luxon/src/luxon", "Info")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return an array of eras, such as ['BC', 'AD']. The locale can be specified, but the calendar system is always Gregorian.
      *
      * @param length - the length of the era representation, such as "short" or "long". Defaults to 'short'.
      * @param opts - options
      * @param opts.locale - the locale code
      *
      * @example
      * Info.eras() //=> [ 'BC', 'AD' ]
      * @example
      * Info.eras('long') //=> [ 'Before Christ', 'Anno Domini' ]
      * @example
      * Info.eras('long', { locale: 'fr' }) //=> [ 'avant Jésus-Christ', 'après Jésus-Christ' ]
      */
    inline def eras(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")().asInstanceOf[js.Array[String]]
    inline def eras(length: Unit, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def eras(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def eras(length: StringUnitLength, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return the set of available features in this environment.
      * Some features of Luxon are not available in all environments. For example, on older browsers, timezone support is not available. Use this function to figure out if that's the case.
      * Keys:
      * * `relative`: whether this environment supports relative time formatting
      *
      * @example
      * Info.features() //=> { intl: true, intlTokens: false, zones: true, relative: false }
      */
    inline def features(): Features = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Features]
    
    /**
      * Return whether the specified zone contains a DST.
      *
      * @param zone - Zone to check. Defaults to the environment's local zone. Defaults to 'local'.
      */
    inline def hasDST(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")().asInstanceOf[Boolean]
    inline def hasDST(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def hasDST(zone: typings.luxon.srcZoneMod.Zone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return whether the specified zone is a valid IANA specifier.
      *
      * @param zone - Zone to check
      */
    inline def isValidIANAZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIANAZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return an array of meridiems.
      *
      * @param opts - options
      * @param opts.locale - the locale code
      *
      * @example
      * Info.meridiems() //=> [ 'AM', 'PM' ]
      * @example
      * Info.meridiems({ locale: 'my' }) //=> [ 'နံနက်', 'ညနေ' ]
      */
    inline def meridiems(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")().asInstanceOf[js.Array[String]]
    inline def meridiems(options: InfoOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of standalone month names.
      * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat
      *
      * @param length - the length of the month representation, such as "numeric", "2-digit", "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      * @param opts.outputCalendar - the calendar. Defaults to 'gregory'.
      *
      * @example
      * Info.months()[0] //=> 'January'
      * @example
      * Info.months('short')[0] //=> 'Jan'
      * @example
      * Info.months('numeric')[0] //=> '1'
      * @example
      * Info.months('short', { locale: 'fr-CA' } )[0] //=> 'janv.'
      * @example
      * Info.months('numeric', { locale: 'ar' })[0] //=> '١'
      * @example
      * Info.months('long', { outputCalendar: 'islamic' })[0] //=> 'Rabiʻ I'
      */
    inline def months(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[String]]
    inline def months(length: Unit, opts: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def months(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def months(length: UnitLength, opts: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of format month names.
      * Format months differ from standalone months in that they're meant to appear next to the day of the month. In some languages, that
      * changes the string.
      * See {@link Info#months}
      *
      * @param length - the length of the month representation, such as "numeric", "2-digit", "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      * @param opts.outputCalendar - the calendar. Defaults to 'gregory'.
      */
    inline def monthsFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")().asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: Unit, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Converts the input into a {@link Zone} instance.
      *
      * * If `input` is already a Zone instance, it is returned unchanged.
      * * If `input` is a string containing a valid time zone name, a Zone instance
      *   with that name is returned.
      * * If `input` is a string that doesn't refer to a known time zone, a Zone
      *   instance with {@link Zone.isValid} == false is returned.
      * * If `input is a number, a Zone instance with the specified fixed offset
      *   in minutes is returned.
      * * If `input` is `null` or `undefined`, the default zone is returned.
      *
      * @param input - the value to be converted
      */
    inline def normalizeZone(): typings.luxon.srcZoneMod.Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")().asInstanceOf[typings.luxon.srcZoneMod.Zone]
    inline def normalizeZone(input: String): typings.luxon.srcZoneMod.Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.Zone]
    inline def normalizeZone(input: Double): typings.luxon.srcZoneMod.Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.Zone]
    inline def normalizeZone(input: typings.luxon.srcZoneMod.Zone): typings.luxon.srcZoneMod.Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcZoneMod.Zone]
    
    /**
      * Return an array of standalone week names.
      * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat
      *
      * @param length - the length of the weekday representation, such as "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      *
      * @example
      * Info.weekdays()[0] //=> 'Monday'
      * @example
      * Info.weekdays('short')[0] //=> 'Mon'
      * @example
      * Info.weekdays('short', { locale: 'fr-CA' })[0] //=> 'lun.'
      * @example
      * Info.weekdays('short', { locale: 'ar' })[0] //=> 'الاثنين'
      */
    inline def weekdays(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[String]]
    inline def weekdays(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def weekdays(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def weekdays(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of format week names.
      * Format weekdays differ from standalone weekdays in that they're meant to appear next to more date information. In some languages, that
      * changes the string.
      * See {@link Info#weekdays}
      *
      * @param length - the length of the month representation, such as "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code. Defaults to null.
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      */
    inline def weekdaysFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")().asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("luxon/src/luxon", "Interval")
  @js.native
  open class Interval protected ()
    extends typings.luxon.srcIntervalMod.Interval {
    /* private */ def this(config: Any) = this()
  }
  /* static members */
  object Interval {
    
    @JSImport("luxon/src/luxon", "Interval")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Interval from a start DateTime and a Duration to extend to.
      *
      * @param start
      * @param duration - the length of the Interval.
      */
    inline def after(start: DateInput, duration: DurationLike): typings.luxon.srcIntervalMod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    
    /**
      * Create an Interval from an end DateTime and a Duration to extend backwards to.
      *
      * @param end
      * @param duration - the length of the Interval.
      */
    inline def before(end: DateInput, duration: DurationLike): typings.luxon.srcIntervalMod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    
    /**
      * Create an Interval from a start DateTime and an end DateTime. Inclusive of the start but not the end.
      *
      * @param start
      * @param end
      */
    inline def fromDateTimes(start: DateInput, end: DateInput): typings.luxon.srcIntervalMod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    
    /**
      * Create an Interval from an ISO 8601 string.
      * Accepts `<start>/<end>`, `<start>/<duration>`, and `<duration>/<end>` formats.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Time_intervals
      *
      * @param text - the ISO string to parse
      * @param opts - options to pass {@link DateTime.fromISO} and optionally {@link Duration.fromISO}
      */
    inline def fromISO(text: String): typings.luxon.srcIntervalMod.Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    inline def fromISO(text: String, opts: DateTimeOptions): typings.luxon.srcIntervalMod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    
    /**
      * Create an invalid Interval.
      *
      * @param reason - simple string of why this Interval is invalid. Should not contain parameters or anything else data-dependent
      * @param explanation - longer explanation, may include parameters and other useful debugging information. Defaults to null.
      */
    inline def invalid(reason: String): typings.luxon.srcIntervalMod.Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    inline def invalid(reason: String, explanation: String): typings.luxon.srcIntervalMod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[typings.luxon.srcIntervalMod.Interval]
    
    /**
      * Check if an object is an Interval. Works across context boundaries
      *
      * @param o
      */
    inline def isInterval(o: Any): /* is luxon.luxon/src/interval.Interval */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterval")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon/src/interval.Interval */ Boolean]
    
    /**
      * Merge an array of Intervals into a equivalent minimal set of Intervals.
      * Combines overlapping and adjacent Intervals.
      *
      * @param intervals
      */
    inline def merge(intervals: js.Array[typings.luxon.srcIntervalMod.Interval]): js.Array[typings.luxon.srcIntervalMod.Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.luxon.srcIntervalMod.Interval]]
    
    /**
      * Return an array of Intervals representing the spans of time that only appear in one of the specified Intervals.
      *
      *  @param intervals
      */
    inline def xor(intervals: js.Array[typings.luxon.srcIntervalMod.Interval]): js.Array[typings.luxon.srcIntervalMod.Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("xor")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.luxon.srcIntervalMod.Interval]]
  }
  
  @JSImport("luxon/src/luxon", "InvalidZone")
  @js.native
  open class InvalidZone ()
    extends typings.luxon.srcZoneMod.InvalidZone
  
  @JSImport("luxon/src/luxon", "Settings")
  @js.native
  open class Settings ()
    extends typings.luxon.srcSettingsMod.Settings
  /* static members */
  object Settings {
    
    @JSImport("luxon/src/luxon", "Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default time zone object currently used to create DateTimes. Does not affect existing instances.
      * The default value is the system's time zone (the one set on the machine that runs this code).
      * Getting this property always returns a Zone object.
      */
    @JSImport("luxon/src/luxon", "Settings.defaultZone")
    @js.native
    def defaultZone: typings.luxon.srcZoneMod.Zone | String = js.native
    inline def defaultZone_=(x: typings.luxon.srcZoneMod.Zone | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultZone")(x.asInstanceOf[js.Any])
    
    /**
      * Reset Luxon's global caches. Should only be necessary in testing scenarios.
      */
    inline def resetCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCaches")().asInstanceOf[Unit]
  }
  
  @JSImport("luxon/src/luxon", "SystemZone")
  @js.native
  open class SystemZone ()
    extends typings.luxon.srcZoneMod.SystemZone
  
  @JSImport("luxon/src/luxon", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /* note: abstract class */ @JSImport("luxon/src/luxon", "Zone")
  @js.native
  open class Zone ()
    extends typings.luxon.srcZoneMod.Zone
}
