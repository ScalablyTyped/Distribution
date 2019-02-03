package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Interval")
@js.native
class Interval () extends js.Object {
  var end: DateTime = js.native
  var invalidExplanation: java.lang.String | scala.Null = js.native
  var invalidReason: java.lang.String | scala.Null = js.native
  var isValid: scala.Boolean = js.native
  var start: DateTime = js.native
  def abutsEnd(other: Interval): scala.Boolean = js.native
  def abutsStart(other: Interval): scala.Boolean = js.native
  def contains(dateTime: DateTime): scala.Boolean = js.native
  def count(): scala.Double = js.native
  def count(unit: DurationUnit): scala.Double = js.native
  def difference(intervals: Interval*): js.Array[Interval] = js.native
  def divideEqually(): js.Array[Interval] = js.native
  def divideEqually(numberOfParts: scala.Double): js.Array[Interval] = js.native
  def engulfs(other: Interval): scala.Boolean = js.native
  def equals(other: Interval): scala.Boolean = js.native
  def hasSame(unit: DurationUnit): scala.Boolean = js.native
  def intersection(other: Interval): Interval = js.native
  def isAfter(dateTime: DateTime): scala.Boolean = js.native
  def isBefore(dateTime: DateTime): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def length(unit: DurationUnit): scala.Double = js.native
  def mapEndpoints(cb: js.Function1[/* d */ DateTime, DateTime]): Interval = js.native
  def overlaps(other: Interval): scala.Boolean = js.native
  def set(values: IntervalObject): Interval = js.native
  def splitAt(dateTimes: DateTime*): js.Array[Interval] = js.native
  def splitBy(duration: Duration): js.Array[Interval] = js.native
  def splitBy(duration: DurationObject): js.Array[Interval] = js.native
  def splitBy(duration: scala.Double): js.Array[Interval] = js.native
  def toDuration(unit: js.Array[DurationUnit]): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def toDuration(unit: DurationUnit): Duration = js.native
  def toDuration(unit: DurationUnit, options: DiffOptions): Duration = js.native
  def toFormat(dateFormat: java.lang.String): java.lang.String = js.native
  def toFormat(dateFormat: java.lang.String, options: luxonLib.Anon_Separator): java.lang.String = js.native
  def toISO(): java.lang.String = js.native
  def toISO(options: ToISOTimeOptions): java.lang.String = js.native
  def union(other: Interval): Interval = js.native
}

/* static members */
@JSImport("luxon", "Interval")
@js.native
object Interval extends js.Object {
  def after(start: luxonLib.luxonMod.DateObject, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def after(start: luxonLib.luxonMod.DateObject, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def after(start: luxonLib.luxonMod.DateObject, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def after(start: luxonLib.luxonMod.DateTime, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def after(start: luxonLib.luxonMod.DateTime, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def after(start: luxonLib.luxonMod.DateTime, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def after(start: stdLib.Date, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def after(start: stdLib.Date, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def after(start: stdLib.Date, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateObject, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateObject, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateObject, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateTime, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateTime, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def before(end: luxonLib.luxonMod.DateTime, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def before(end: stdLib.Date, duration: luxonLib.luxonMod.Duration): luxonLib.luxonMod.Interval = js.native
  def before(end: stdLib.Date, duration: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Interval = js.native
  def before(end: stdLib.Date, duration: scala.Double): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateObject, end: luxonLib.luxonMod.DateObject): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateObject, end: luxonLib.luxonMod.DateTime): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateObject, end: stdLib.Date): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateTime, end: luxonLib.luxonMod.DateObject): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateTime, end: luxonLib.luxonMod.DateTime): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.DateTime, end: stdLib.Date): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: luxonLib.luxonMod.DateObject): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: luxonLib.luxonMod.DateTime): luxonLib.luxonMod.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: stdLib.Date): luxonLib.luxonMod.Interval = js.native
  def fromISO(string: java.lang.String): luxonLib.luxonMod.Interval = js.native
  def fromISO(string: java.lang.String, options: luxonLib.luxonMod.DateTimeOptions): luxonLib.luxonMod.Interval = js.native
  def invalid(): luxonLib.luxonMod.Interval = js.native
  def invalid(reason: java.lang.String): luxonLib.luxonMod.Interval = js.native
  def isInterval(o: js.Any): /* is luxon.luxon.Interval */ scala.Boolean = js.native
  def merge(intervals: js.Array[luxonLib.luxonMod.Interval]): js.Array[luxonLib.luxonMod.Interval] = js.native
  def xor(intervals: js.Array[luxonLib.luxonMod.Interval]): js.Array[luxonLib.luxonMod.Interval] = js.native
}

