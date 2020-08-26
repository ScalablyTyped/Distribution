package typings.luxon.mod

import typings.luxon.anon.Separator
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Interval")
@js.native
class Interval () extends js.Object {
  var end: DateTime = js.native
  var invalidExplanation: String | Null = js.native
  var invalidReason: String | Null = js.native
  var isValid: Boolean = js.native
  var start: DateTime = js.native
  def abutsEnd(other: Interval): Boolean = js.native
  def abutsStart(other: Interval): Boolean = js.native
  def contains(dateTime: DateTime): Boolean = js.native
  def count(): Double = js.native
  def count(unit: DurationUnit): Double = js.native
  def difference(intervals: Interval*): js.Array[Interval] = js.native
  def divideEqually(): js.Array[Interval] = js.native
  def divideEqually(numberOfParts: Double): js.Array[Interval] = js.native
  def engulfs(other: Interval): Boolean = js.native
  def equals(other: Interval): Boolean = js.native
  def hasSame(unit: DurationUnit): Boolean = js.native
  def intersection(other: Interval): Interval | Null = js.native
  def isAfter(dateTime: DateTime): Boolean = js.native
  def isBefore(dateTime: DateTime): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def length(unit: DurationUnit): Double = js.native
  def mapEndpoints(cb: js.Function1[/* d */ DateTime, DateTime]): Interval = js.native
  def overlaps(other: Interval): Boolean = js.native
  def set(values: IntervalObject): Interval = js.native
  def splitAt(dateTimes: DateTime*): js.Array[Interval] = js.native
  def splitBy(duration: Double): js.Array[Interval] = js.native
  def splitBy(duration: Duration): js.Array[Interval] = js.native
  def splitBy(duration: DurationObject): js.Array[Interval] = js.native
  def toDuration(): Duration = js.native
  def toDuration(unit: js.UndefOr[scala.Nothing], options: DiffOptions): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit]): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
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
@JSImport("luxon", "Interval")
@js.native
object Interval extends js.Object {
  def after(start: DateObject, duration: Double): Interval = js.native
  def after(start: DateObject, duration: Duration): Interval = js.native
  def after(start: DateObject, duration: DurationObject): Interval = js.native
  def after(start: DateTime, duration: Double): Interval = js.native
  def after(start: DateTime, duration: Duration): Interval = js.native
  def after(start: DateTime, duration: DurationObject): Interval = js.native
  def after(start: Date, duration: Double): Interval = js.native
  def after(start: Date, duration: Duration): Interval = js.native
  def after(start: Date, duration: DurationObject): Interval = js.native
  def before(end: DateObject, duration: Double): Interval = js.native
  def before(end: DateObject, duration: Duration): Interval = js.native
  def before(end: DateObject, duration: DurationObject): Interval = js.native
  def before(end: DateTime, duration: Double): Interval = js.native
  def before(end: DateTime, duration: Duration): Interval = js.native
  def before(end: DateTime, duration: DurationObject): Interval = js.native
  def before(end: Date, duration: Double): Interval = js.native
  def before(end: Date, duration: Duration): Interval = js.native
  def before(end: Date, duration: DurationObject): Interval = js.native
  def fromDateTimes(start: DateObject, end: DateObject): Interval = js.native
  def fromDateTimes(start: DateObject, end: DateTime): Interval = js.native
  def fromDateTimes(start: DateObject, end: Date): Interval = js.native
  def fromDateTimes(start: DateTime, end: DateObject): Interval = js.native
  def fromDateTimes(start: DateTime, end: DateTime): Interval = js.native
  def fromDateTimes(start: DateTime, end: Date): Interval = js.native
  def fromDateTimes(start: Date, end: DateObject): Interval = js.native
  def fromDateTimes(start: Date, end: DateTime): Interval = js.native
  def fromDateTimes(start: Date, end: Date): Interval = js.native
  def fromISO(string: String): Interval = js.native
  def fromISO(string: String, options: DateTimeOptions): Interval = js.native
  def invalid(): Interval = js.native
  def invalid(reason: String): Interval = js.native
  def isInterval(o: js.Any): /* is luxon.luxon.Interval */ Boolean = js.native
  def merge(intervals: js.Array[Interval]): js.Array[Interval] = js.native
  def xor(intervals: js.Array[Interval]): js.Array[Interval] = js.native
}

