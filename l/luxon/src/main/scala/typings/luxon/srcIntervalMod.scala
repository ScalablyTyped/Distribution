package typings.luxon

import typings.luxon.anon.Separator
import typings.luxon.srcDatetimeMod.DateTime
import typings.luxon.srcDatetimeMod.DateTimeOptions
import typings.luxon.srcDatetimeMod.DiffOptions
import typings.luxon.srcDatetimeMod.ToISOTimeOptions
import typings.luxon.srcDurationMod.Duration
import typings.luxon.srcDurationMod.DurationLike
import typings.luxon.srcDurationMod.DurationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIntervalMod {
  
  @JSImport("luxon/src/interval", "Interval")
  @js.native
  open class Interval protected () extends StObject {
    /* private */ def this(config: Any) = this()
    
    /**
      * Return whether this Interval's start is adjacent to the specified Interval's end.
      *
      * @param other
      */
    def abutsEnd(other: Interval): Boolean = js.native
    
    /**
      * Return whether this Interval's end is adjacent to the specified Interval's start.
      *
      * @param other
      */
    def abutsStart(other: Interval): Boolean = js.native
    
    /**
      * Return whether this Interval contains the specified DateTime.
      *
      * @param dateTime
      */
    def contains(dateTime: DateTime): Boolean = js.native
    
    /**
      * Returns the count of minutes, hours, days, months, or years included in the Interval, even in part.
      * Unlike {@link Interval#length} this counts sections of the calendar, not periods of time, e.g. specifying 'day'
      * asks 'what dates are included in this interval?', not 'how many days long is this interval?'
      *
      * @param unit - the unit of time to count. Defaults to 'milliseconds'.
      */
    def count(): Double = js.native
    def count(unit: DurationUnit): Double = js.native
    
    /**
      * Return an Interval representing the span of time in this Interval that doesn't overlap with any of the specified Intervals.
      *
      * @param intervals
      */
    def difference(intervals: Interval*): js.Array[Interval] = js.native
    
    /**
      * Split this Interval into the specified number of smaller intervals.
      *
      * @param numberOfParts - The number of Intervals to divide the Interval into.
      */
    def divideEqually(numberOfParts: Double): js.Array[Interval] = js.native
    
    /**
      * Returns the end of the Interval
      */
    def end: DateTime = js.native
    
    /**
      * Return whether this Interval engulfs the start and end of the specified Interval.
      *
      * @param other
      */
    def engulfs(other: Interval): Boolean = js.native
    
    /**
      * Return whether this Interval has the same start and end as the specified Interval.
      *
      * @param other
      */
    def equals(other: Interval): Boolean = js.native
    
    /**
      * Returns whether this Interval's start and end are both in the same unit of time
      *
      * @param unit - the unit of time to check sameness on
      */
    def hasSame(unit: DurationUnit): Boolean = js.native
    
    /**
      * Return an Interval representing the intersection of this Interval and the specified Interval.
      * Specifically, the resulting Interval has the maximum start time and the minimum end time of the two Intervals.
      * Returns null if the intersection is empty, meaning, the intervals don't intersect.
      *
      * @param other
      */
    def intersection(other: Interval): Interval | Null = js.native
    
    /**
      * Returns an explanation of why this Interval became invalid, or null if the Interval is valid
      */
    def invalidExplanation: String = js.native
    
    /**
      * Returns an error code if this Interval is invalid, or null if the Interval is valid
      */
    def invalidReason: String = js.native
    
    /**
      * Return whether this Interval's start is after the specified DateTime.
      *
      * @param dateTime
      */
    def isAfter(dateTime: DateTime): Boolean = js.native
    
    /**
      * Return whether this Interval's end is before the specified DateTime.
      *
      * @param dateTime
      */
    def isBefore(dateTime: DateTime): Boolean = js.native
    
    /**
      * Return whether this Interval has the same start and end DateTimes.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Returns whether this Interval's end is at least its start, meaning that the Interval isn't 'backwards'.
      */
    def isValid: Boolean = js.native
    
    /**
      * Returns the length of the Interval in the specified unit.
      *
      * @param unit - the unit (such as 'hours' or 'days') to return the length in.
      */
    def length(): Double = js.native
    def length(unit: DurationUnit): Double = js.native
    
    /**
      * Run mapFn on the interval start and end, returning a new Interval from the resulting DateTimes
      *
      * @param mapFn
      *
      * @example
      * Interval.fromDateTimes(dt1, dt2).mapEndpoints(endpoint => endpoint.toUTC())
      * @example
      * Interval.fromDateTimes(dt1, dt2).mapEndpoints(endpoint => endpoint.plus({ hours: 2 }))
      */
    def mapEndpoints(mapFn: js.Function1[/* d */ DateTime, DateTime]): Interval = js.native
    
    /**
      * Return whether this Interval overlaps with the specified Interval
      *
      * @param other
      */
    def overlaps(other: Interval): Boolean = js.native
    
    /**
      * "Sets" the start and/or end dates. Returns a newly-constructed Interval.
      *
      * @param values - the values to set
      * @param values.start - the starting DateTime
      * @param values.end - the ending DateTime
      */
    def set(): Interval = js.native
    def set(values: IntervalObject): Interval = js.native
    
    /**
      * Split this Interval at each of the specified DateTimes
      *
      * @param dateTimes - the unit of time to count.
      */
    def splitAt(dateTimes: DateTime*): js.Array[Interval] = js.native
    
    /**
      * Split this Interval into smaller Intervals, each of the specified length.
      * Left over time is grouped into a smaller interval
      *
      * @param duration - The length of each resulting interval.
      */
    def splitBy(duration: DurationLike): js.Array[Interval] = js.native
    
    /**
      * Returns the start of the Interval
      */
    def start: DateTime = js.native
    
    /**
      * Return a Duration representing the time spanned by this interval.
      *
      * @param unit - the unit or units (such as 'hours' or 'days') to include in the duration. Defaults to ['milliseconds'].
      * @param opts - options that affect the creation of the Duration
      * @param opts.conversionAccuracy - the conversion system to use. Defaults to 'casual'.
      *
      * @example
      * Interval.fromDateTimes(dt1, dt2).toDuration().toObject() //=> { milliseconds: 88489257 }
      * @example
      * Interval.fromDateTimes(dt1, dt2).toDuration('days').toObject() //=> { days: 1.0241812152777778 }
      * @example
      * Interval.fromDateTimes(dt1, dt2).toDuration(['hours', 'minutes']).toObject() //=> { hours: 24, minutes: 34.82095 }
      * @example
      * Interval.fromDateTimes(dt1, dt2).toDuration(['hours', 'minutes', 'seconds']).toObject() //=> { hours: 24, minutes: 34, seconds: 49.257 }
      * @example
      * Interval.fromDateTimes(dt1, dt2).toDuration('seconds').toObject() //=> { seconds: 88489.257 }
      */
    def toDuration(): Duration = js.native
    def toDuration(unit: js.Array[DurationUnit]): Duration = js.native
    def toDuration(unit: js.Array[DurationUnit], opts: DiffOptions): Duration = js.native
    def toDuration(unit: Unit, opts: DiffOptions): Duration = js.native
    def toDuration(unit: DurationUnit): Duration = js.native
    def toDuration(unit: DurationUnit, opts: DiffOptions): Duration = js.native
    
    /**
      * Returns a string representation of this Interval formatted according to the specified format string.
      *
      * @param dateFormat - the format string. This string formats the start and end time. See {@link DateTime.toFormat} for details.
      * @param opts - options
      * @param opts.separator - a separator to place between the start and end representations. Defaults to ' - '.
      */
    def toFormat(dateFormat: String): String = js.native
    def toFormat(dateFormat: String, opts: Separator): String = js.native
    
    /**
      * Returns an ISO 8601-compliant string representation of this Interval.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Time_intervals
      *
      * @param opts - The same options as {@link DateTime#toISO}
      */
    def toISO(): String = js.native
    def toISO(opts: ToISOTimeOptions): String = js.native
    
    /**
      * Returns an ISO 8601-compliant string representation of date of this Interval.
      * The time components are ignored.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Time_intervals
      */
    def toISODate(): String = js.native
    
    /**
      * Returns an ISO 8601-compliant string representation of time of this Interval.
      * The date components are ignored.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Time_intervals
      *
      * @param opts - The same options as {@link DateTime.toISO}
      */
    def toISOTime(): String = js.native
    def toISOTime(opts: ToISOTimeOptions): String = js.native
    
    /**
      * Return an Interval representing the union of this Interval and the specified Interval.
      * Specifically, the resulting Interval has the minimum start time and the maximum end time of the two Intervals.
      *
      * @param other
      */
    def union(other: Interval): Interval = js.native
  }
  /* static members */
  object Interval {
    
    @JSImport("luxon/src/interval", "Interval")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Interval from a start DateTime and a Duration to extend to.
      *
      * @param start
      * @param duration - the length of the Interval.
      */
    inline def after(start: DateInput, duration: DurationLike): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
    /**
      * Create an Interval from an end DateTime and a Duration to extend backwards to.
      *
      * @param end
      * @param duration - the length of the Interval.
      */
    inline def before(end: DateInput, duration: DurationLike): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
    /**
      * Create an Interval from a start DateTime and an end DateTime. Inclusive of the start but not the end.
      *
      * @param start
      * @param end
      */
    inline def fromDateTimes(start: DateInput, end: DateInput): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
    /**
      * Create an Interval from an ISO 8601 string.
      * Accepts `<start>/<end>`, `<start>/<duration>`, and `<duration>/<end>` formats.
      * @see https://en.wikipedia.org/wiki/ISO_8601#Time_intervals
      *
      * @param text - the ISO string to parse
      * @param opts - options to pass {@link DateTime.fromISO} and optionally {@link Duration.fromISO}
      */
    inline def fromISO(text: String): Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[Interval]
    inline def fromISO(text: String, opts: DateTimeOptions): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
    /**
      * Create an invalid Interval.
      *
      * @param reason - simple string of why this Interval is invalid. Should not contain parameters or anything else data-dependent
      * @param explanation - longer explanation, may include parameters and other useful debugging information. Defaults to null.
      */
    inline def invalid(reason: String): Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[Interval]
    inline def invalid(reason: String, explanation: String): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
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
    inline def merge(intervals: js.Array[Interval]): js.Array[Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[Interval]]
    
    /**
      * Return an array of Intervals representing the spans of time that only appear in one of the specified Intervals.
      *
      *  @param intervals
      */
    inline def xor(intervals: js.Array[Interval]): js.Array[Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("xor")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[Interval]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.srcDatetimeMod.DateTime
    - typings.luxon.srcDatetimeMod.DateObjectUnits
    - js.Date
  */
  type DateInput = _DateInput | js.Date
  
  trait IntervalObject extends StObject {
    
    var end: js.UndefOr[DateTime] = js.undefined
    
    var start: js.UndefOr[DateTime] = js.undefined
  }
  object IntervalObject {
    
    inline def apply(): IntervalObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalObject]
    }
    
    extension [Self <: IntervalObject](x: Self) {
      
      inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait _DateInput extends StObject
}
