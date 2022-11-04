package typings.luxon

import typings.luxon.anon.Floor
import typings.luxon.luxonStrings.long
import typings.luxon.luxonStrings.narrow
import typings.luxon.luxonStrings.short
import typings.luxon.srcDatetimeMod.ConversionAccuracy
import typings.luxon.srcMiscMod.NumberingSystem
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDurationMod {
  
  @JSImport("luxon/src/duration", "Duration")
  @js.native
  open class Duration protected ()
    extends StObject
       with _DurationInput
       with _DurationLike {
    /* private */ def this(config: Any) = this()
    
    /**
      * Return the length of the duration in the specified unit.
      *
      * @param unit - a unit such as 'minutes' or 'days'
      *
      * @example
      * Duration.fromObject({years: 1}).as('days') //=> 365
      * @example
      * Duration.fromObject({years: 1}).as('months') //=> 12
      * @example
      * Duration.fromObject({hours: 60}).as('days') //=> 2.5
      */
    def as(unit: DurationUnit): Double = js.native
    
    /**
      * Get the days.
      */
    def days: Double = js.native
    
    /**
      * Equality check
      * Two Durations are equal iff they have the same units and the same values for each unit.
      *
      * @param other
      */
    def equals(other: Duration): Boolean = js.native
    
    /**
      * Get the value of unit.
      *
      * @param unit - a unit such as 'minute' or 'day'
      *
      * @example
      * Duration.fromObject({years: 2, days: 3}).get('years') //=> 2
      * @example
      * Duration.fromObject({years: 2, days: 3}).get('months') //=> 0
      * @example
      * Duration.fromObject({years: 2, days: 3}).get('days') //=> 3
      */
    def get(unit: DurationUnit): Double = js.native
    
    /**
      * Get the hours.
      */
    def hours: Double = js.native
    
    /**
      * Returns an explanation of why this Duration became invalid, or null if the Duration is valid
      */
    def invalidExplanation: String = js.native
    
    /**
      * Returns an error code if this Duration became invalid, or null if the Duration is valid
      */
    def invalidReason: String = js.native
    
    /**
      * Returns whether the Duration is invalid. Invalid durations are returned by diff operations
      * on invalid DateTimes or Intervals.
      */
    def isValid: Boolean = js.native
    
    /**
      * Get  the locale of a Duration, such 'en-GB'
      */
    def locale: String = js.native
    
    /**
      * Scale this Duration by the specified amount. Return a newly-constructed Duration.
      *
      * @example
      * Duration.fromObject({ hours: 1, minutes: 30 }).mapUnit(x => x * 2) //=> { hours: 2, minutes: 60 }
      * @example
      * Duration.fromObject({ hours: 1, minutes: 30 }).mapUnit((x, u) => u === "hour" ? x * 2 : x) //=> { hours: 2, minutes: 30 }
      */
    def mapUnits(fn: js.Function2[/* x */ Double, /* u */ js.UndefOr[DurationUnit], Double]): Duration = js.native
    
    /**
      * Get the milliseconds.
      */
    def milliseconds: Double = js.native
    
    /**
      * Make this Duration shorter by the specified amount. Return a newly-constructed Duration.
      *
      * @param duration - The amount to subtract. Either a Luxon Duration, a number of milliseconds, the object argument to Duration.fromObject()
      */
    def minus(duration: DurationLike): Duration = js.native
    
    /**
      * Get the minutes.
      */
    def minutes: Double = js.native
    
    /**
      * Get the months.
      */
    def months: Double = js.native
    
    /**
      * Return the negative of this Duration.
      *
      * @example
      * Duration.fromObject({ hours: 1, seconds: 30 }).negate().toObject() //=> { hours: -1, seconds: -30 }
      */
    def negate(): Duration = js.native
    
    /**
      * Reduce this Duration to its canonical representation in its current units.
      *
      * @example
      * Duration.fromObject({ years: 2, days: 5000 }).normalize().toObject() //=> { years: 15, days: 255 }
      * @example
      * Duration.fromObject({ hours: 12, minutes: -45 }).normalize().toObject() //=> { hours: 11, minutes: 15 }
      */
    def normalize(): Duration = js.native
    
    /**
      * Get the numbering system of a Duration, such 'beng'. The numbering system is used when formatting the Duration
      */
    def numberingSystem: String = js.native
    
    /**
      * Make this Duration longer by the specified amount. Return a newly-constructed Duration.
      *
      * @param duration - The amount to add. Either a Luxon Duration, a number of milliseconds, the object argument to Duration.fromObject()
      */
    def plus(duration: DurationLike): Duration = js.native
    
    /**
      * Get the quarters.
      */
    def quarters: Double = js.native
    
    /**
      * "Set" the locale and/or numberingSystem.  Returns a newly-constructed Duration.
      *
      * @example
      * dur.reconfigure({ locale: 'en-GB' })
      */
    def reconfigure(): Duration = js.native
    def reconfigure(opts: DurationOptions): Duration = js.native
    
    /**
      * Get the seconds.
      */
    def seconds: Double = js.native
    
    /**
      * "Set" the values of specified units. Return a newly-constructed Duration.
      *
      * @param values - a mapping of units to numbers
      *
      * @example
      * dur.set({ years: 2017 })
      * @example
      * dur.set({ hours: 8, minutes: 30 })
      */
    def set(values: DurationLikeObject): Duration = js.native
    
    /**
      * Convert this Duration into its representation in a different set of units.
      *
      * @example
      * Duration.fromObject({ hours: 1, seconds: 30 }).shiftTo('minutes', 'milliseconds').toObject() //=> { minutes: 60, milliseconds: 30000 }
      */
    def shiftTo(units: DurationUnit*): Duration = js.native
    
    /**
      * Returns a string representation of this Duration formatted according to the specified format string. You may use these tokens:
      * * `S` for milliseconds
      * * `s` for seconds
      * * `m` for minutes
      * * `h` for hours
      * * `d` for days
      * * `M` for months
      * * `y` for years
      * Notes:
      * * Add padding by repeating the token, e.g. "yy" pads the years to two digits, "hhhh" pads the hours out to four digits
      * * The duration will be converted to the set of units in the format string using {@link Duration.shiftTo} and the Durations's conversion accuracy setting.
      *
      * @param fmt - the format string
      * @param opts - options
      * @param opts.floor - floor numerical values. Defaults to true.
      *
      * @example
      * Duration.fromObject({ years: 1, days: 6, seconds: 2 }).toFormat("y d s") //=> "1 6 2"
      * @example
      * Duration.fromObject({ years: 1, days: 6, seconds: 2 }).toFormat("yy dd sss") //=> "01 06 002"
      * @example
      * Duration.fromObject({ years: 1, days: 6, seconds: 2 }).toFormat("M S") //=> "12 518402000"
      */
    def toFormat(fmt: String): String = js.native
    def toFormat(fmt: String, opts: Floor): String = js.native
    
    /**
      * Returns a string representation of a Duration with all units included
      * To modify its behavior use the `listStyle` and any Intl.NumberFormat option, though `unitDisplay` is especially relevant. See {@link Intl.NumberFormat}.
      * @param opts - On option object to override the formatting. Accepts the same keys as the options parameter of the native `Int.NumberFormat` constructor, as well as `listStyle`.
      * @example
      * ```js
      * var dur = Duration.fromObject({ days: 1, hours: 5, minutes: 6 })
      * dur.toHuman() //=> '1 day, 5 hours, 6 minutes'
      * dur.toHuman({ listStyle: "long" }) //=> '1 day, 5 hours, and 6 minutes'
      * dur.toHuman({ unitDisplay: "short" }) //=> '1 day, 5 hr, 6 min'
      * ```
      */
    def toHuman(): String = js.native
    def toHuman(opts: ToHumanDurationOptions): String = js.native
    
    /**
      * Returns an ISO 8601-compliant string representation of this Duration.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Durations
      *
      * @example
      * Duration.fromObject({ years: 3, seconds: 45 }).toISO() //=> 'P3YT45S'
      * @example
      * Duration.fromObject({ months: 4, seconds: 45 }).toISO() //=> 'P4MT45S'
      * @example
      * Duration.fromObject({ months: 5 }).toISO() //=> 'P5M'
      * @example
      * Duration.fromObject({ minutes: 5 }).toISO() //=> 'PT5M'
      * @example
      * Duration.fromObject({ milliseconds: 6 }).toISO() //=> 'PT0.006S'
      */
    def toISO(): String = js.native
    
    /**
      * Returns an ISO 8601-compliant string representation of this Duration, formatted as a time of day.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Times
      *
      * @param opts - options
      * @param opts.suppressMilliseconds - exclude milliseconds from the format if they're 0. Defaults to false.
      * @param opts.suppressSeconds - exclude seconds from the format if they're 0. Defaults to false.
      * @param opts.includePrefix - include the `T` prefix. Defaults to false.
      * @param opts.format - choose between the basic and extended format. Defaults to 'extended'.
      *
      * @example
      * Duration.fromObject({ hours: 11 }).toISOTime() //=> '11:00:00.000'
      * @example
      * Duration.fromObject({ hours: 11 }).toISOTime({ suppressMilliseconds: true }) //=> '11:00:00'
      * @example
      * Duration.fromObject({ hours: 11 }).toISOTime({ suppressSeconds: true }) //=> '11:00'
      * @example
      * Duration.fromObject({ hours: 11 }).toISOTime({ includePrefix: true }) //=> 'T11:00:00.000'
      * @example
      * Duration.fromObject({ hours: 11 }).toISOTime({ format: 'basic' }) //=> '110000.000'
      */
    def toISOTime(): String = js.native
    def toISOTime(opts: ToISOTimeDurationOptions): String = js.native
    
    /**
      * Returns an ISO 8601 representation of this Duration appropriate for use in JSON.
      */
    def toJSON(): String = js.native
    
    /**
      * Returns an milliseconds value of this Duration.
      */
    def toMillis(): Double = js.native
    
    /**
      * Returns a JavaScript object with this Duration's values.
      *
      * @example
      * Duration.fromObject({ years: 1, days: 6, seconds: 2 }).toObject() //=> { years: 1, days: 6, seconds: 2 }
      */
    def toObject(): DurationObjectUnits = js.native
    
    /**
      * Get the weeks
      */
    def weeks: Double = js.native
    
    /**
      * Get the years.
      */
    def years: Double = js.native
  }
  /* static members */
  object Duration {
    
    @JSImport("luxon/src/duration", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Duration from DurationLike.
      *
      * @param durationLike
      * Either a Luxon Duration, a number of milliseconds, or the object argument to Duration.fromObject()
      */
    inline def fromDurationLike(durationLike: DurationLike): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDurationLike")(durationLike.asInstanceOf[js.Any]).asInstanceOf[Duration]
    
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
    inline def fromISO(text: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromISO(text: String, opts: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
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
    inline def fromISOTime(text: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISOTime")(text.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromISOTime(text: String, opts: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISOTime")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    /**
      * Create Duration from a number of milliseconds.
      *
      * @param count - of milliseconds
      * @param opts - options for parsing
      * @param opts.locale - the locale to use
      * @param opts.numberingSystem - the numbering system to use
      * @param opts.conversionAccuracy - the conversion system to use
      */
    inline def fromMillis(count: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromMillis(count: Double, opts: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    /**
      * Create a Duration from a JavaScript object with keys like 'years' and 'hours'.
      * If this object is empty then a zero milliseconds duration is returned.
      *
      * @param obj - the object to create the Duration from
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
    inline def fromObject(obj: DurationLikeObject): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromObject(obj: DurationLikeObject, opts: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    /**
      * Create an invalid Duration.
      *
      * @param reason - simple string of why this datetime is invalid. Should not contain parameters or anything else data-dependent
      * @param explanation - longer explanation, may include parameters and other useful debugging information. Defaults to null.
      */
    inline def invalid(reason: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def invalid(reason: String, explanation: String): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    /**
      * Check if an object is a Duration. Works across context boundaries
      *
      * @param o
      */
    inline def isDuration(o: Any): /* is luxon.luxon/src/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon/src/duration.Duration */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.srcDurationMod.Duration
    - scala.Double
    - typings.luxon.srcDurationMod.DurationLikeObject
  */
  type DurationInput = _DurationInput | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.srcDurationMod.Duration
    - typings.luxon.srcDurationMod.DurationLikeObject
    - scala.Double
  */
  type DurationLike = _DurationLike | Double
  
  trait DurationLikeObject
    extends StObject
       with DurationObjectUnits
       with _DurationInput
       with _DurationLike {
    
    var day: js.UndefOr[Double] = js.undefined
    
    var hour: js.UndefOr[Double] = js.undefined
    
    var millisecond: js.UndefOr[Double] = js.undefined
    
    var minute: js.UndefOr[Double] = js.undefined
    
    var month: js.UndefOr[Double] = js.undefined
    
    var quarter: js.UndefOr[Double] = js.undefined
    
    var second: js.UndefOr[Double] = js.undefined
    
    var week: js.UndefOr[Double] = js.undefined
    
    var year: js.UndefOr[Double] = js.undefined
  }
  object DurationLikeObject {
    
    inline def apply(): DurationLikeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationLikeObject]
    }
    
    extension [Self <: DurationLikeObject](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setQuarter(value: Double): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait DurationObjectUnits extends StObject {
    
    var days: js.UndefOr[Double] = js.undefined
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var milliseconds: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    var quarters: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    var weeks: js.UndefOr[Double] = js.undefined
    
    var years: js.UndefOr[Double] = js.undefined
  }
  object DurationObjectUnits {
    
    inline def apply(): DurationObjectUnits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationObjectUnits]
    }
    
    extension [Self <: DurationObjectUnits](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setQuarters(value: Double): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
      
      inline def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  trait DurationOptions extends StObject {
    
    var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  }
  object DurationOptions {
    
    inline def apply(): DurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationOptions]
    }
    
    extension [Self <: DurationOptions](x: Self) {
      
      inline def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
      
      inline def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.year
    - typings.luxon.luxonStrings.quarter
    - typings.luxon.luxonStrings.month
    - typings.luxon.luxonStrings.week
    - typings.luxon.luxonStrings.day
    - typings.luxon.luxonStrings.hour
    - typings.luxon.luxonStrings.minute
    - typings.luxon.luxonStrings.second
    - typings.luxon.luxonStrings.millisecond
  */
  trait DurationUnit extends StObject
  
  type DurationUnits = DurationUnit | js.Array[DurationUnit]
  
  trait ToHumanDurationOptions
    extends StObject
       with NumberFormatOptions {
    
    var listStyle: js.UndefOr[long | short | narrow] = js.undefined
  }
  object ToHumanDurationOptions {
    
    inline def apply(): ToHumanDurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToHumanDurationOptions]
    }
    
    extension [Self <: ToHumanDurationOptions](x: Self) {
      
      inline def setListStyle(value: long | short | narrow): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.basic
    - typings.luxon.luxonStrings.extended
  */
  trait ToISOFormat extends StObject
  object ToISOFormat {
    
    inline def basic: typings.luxon.luxonStrings.basic = "basic".asInstanceOf[typings.luxon.luxonStrings.basic]
    
    inline def extended: typings.luxon.luxonStrings.extended = "extended".asInstanceOf[typings.luxon.luxonStrings.extended]
  }
  
  trait ToISOTimeDurationOptions extends StObject {
    
    /**
      * Choose between the basic and extended format
      * @default 'extended'
      */
    var format: js.UndefOr[ToISOFormat] = js.undefined
    
    /**
      * Include the `T` prefix
      * @default false
      */
    var includePrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude milliseconds from the format if they're 0
      * @default false
      */
    var suppressMilliseconds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude seconds from the format if they're 0
      * @default false
      */
    var suppressSeconds: js.UndefOr[Boolean] = js.undefined
  }
  object ToISOTimeDurationOptions {
    
    inline def apply(): ToISOTimeDurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToISOTimeDurationOptions]
    }
    
    extension [Self <: ToISOTimeDurationOptions](x: Self) {
      
      inline def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIncludePrefix(value: Boolean): Self = StObject.set(x, "includePrefix", value.asInstanceOf[js.Any])
      
      inline def setIncludePrefixUndefined: Self = StObject.set(x, "includePrefix", js.undefined)
      
      inline def setSuppressMilliseconds(value: Boolean): Self = StObject.set(x, "suppressMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setSuppressMillisecondsUndefined: Self = StObject.set(x, "suppressMilliseconds", js.undefined)
      
      inline def setSuppressSeconds(value: Boolean): Self = StObject.set(x, "suppressSeconds", value.asInstanceOf[js.Any])
      
      inline def setSuppressSecondsUndefined: Self = StObject.set(x, "suppressSeconds", js.undefined)
    }
  }
  
  trait _DurationInput extends StObject
  
  trait _DurationLike extends StObject
}
