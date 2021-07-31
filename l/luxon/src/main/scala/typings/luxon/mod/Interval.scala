package typings.luxon.mod

import typings.luxon.anon.Separator
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Interval")
@js.native
class Interval () extends StObject {
  
  def abutsEnd(other: Interval): Boolean = js.native
  
  def abutsStart(other: Interval): Boolean = js.native
  
  def contains(dateTime: DateTime): Boolean = js.native
  
  def count(): Double = js.native
  def count(unit: DurationUnit): Double = js.native
  
  def difference(intervals: Interval*): js.Array[Interval] = js.native
  
  def divideEqually(): js.Array[Interval] = js.native
  def divideEqually(numberOfParts: Double): js.Array[Interval] = js.native
  
  var end: DateTime = js.native
  
  def engulfs(other: Interval): Boolean = js.native
  
  def equals(other: Interval): Boolean = js.native
  
  def hasSame(unit: DurationUnit): Boolean = js.native
  
  def intersection(other: Interval): Interval | Null = js.native
  
  var invalidExplanation: String | Null = js.native
  
  var invalidReason: String | Null = js.native
  
  def isAfter(dateTime: DateTime): Boolean = js.native
  
  def isBefore(dateTime: DateTime): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  var isValid: Boolean = js.native
  
  def length(): Double = js.native
  def length(unit: DurationUnit): Double = js.native
  
  def mapEndpoints(cb: js.Function1[/* d */ DateTime, DateTime]): Interval = js.native
  
  def overlaps(other: Interval): Boolean = js.native
  
  def set(values: IntervalObject): Interval = js.native
  
  def splitAt(dateTimes: DateTime*): js.Array[Interval] = js.native
  
  def splitBy(duration: Double): js.Array[Interval] = js.native
  def splitBy(duration: Duration): js.Array[Interval] = js.native
  def splitBy(duration: DurationObject): js.Array[Interval] = js.native
  
  var start: DateTime = js.native
  
  def toDuration(): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit]): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def toDuration(unit: Unit, options: DiffOptions): Duration = js.native
  def toDuration(unit: DurationUnit): Duration = js.native
  def toDuration(unit: DurationUnit, options: DiffOptions): Duration = js.native
  
  def toFormat(dateFormat: String): String = js.native
  def toFormat(dateFormat: String, options: Separator): String = js.native
  
  def toISO(): String = js.native
  def toISO(options: ToISOTimeOptions): String = js.native
  
  def toISODate(): String = js.native
  
  def toISOTime(): String = js.native
  def toISOTime(options: ToISOTimeOptions): String = js.native
  
  def union(other: Interval): Interval = js.native
}
/* static members */
object Interval {
  
  @JSImport("luxon", "Interval")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def after(start: DateObject, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: DateObject, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: DateObject, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: DateTime, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: DateTime, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: DateTime, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: Date, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: Date, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def after(start: Date, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(start.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  @scala.inline
  def before(end: DateObject, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: DateObject, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: DateObject, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: DateTime, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: DateTime, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: DateTime, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: Date, duration: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: Date, duration: Duration): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def before(end: Date, duration: DurationObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(end.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  @scala.inline
  def fromDateTimes(start: DateObject, end: DateObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: DateObject, end: DateTime): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: DateObject, end: Date): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: DateTime, end: DateObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: DateTime, end: DateTime): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: DateTime, end: Date): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: Date, end: DateObject): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: Date, end: DateTime): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def fromDateTimes(start: Date, end: Date): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDateTimes")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  @scala.inline
  def fromISO(string: String): Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(string.asInstanceOf[js.Any]).asInstanceOf[Interval]
  @scala.inline
  def fromISO(string: String, options: DateTimeOptions): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  @scala.inline
  def invalid(): Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Interval]
  @scala.inline
  def invalid(reason: String): Interval = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[Interval]
  
  @scala.inline
  def isInterval(o: js.Any): /* is luxon.luxon.Interval */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterval")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon.Interval */ Boolean]
  
  @scala.inline
  def merge(intervals: js.Array[Interval]): js.Array[Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[Interval]]
  
  @scala.inline
  def xor(intervals: js.Array[Interval]): js.Array[Interval] = ^.asInstanceOf[js.Dynamic].applyDynamic("xor")(intervals.asInstanceOf[js.Any]).asInstanceOf[js.Array[Interval]]
}
