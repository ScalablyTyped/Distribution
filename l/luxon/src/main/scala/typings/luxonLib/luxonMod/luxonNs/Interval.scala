package typings
package luxonLib.luxonMod.luxonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interval extends js.Object {
  var end: DateTime = js.native
  var invalidReason: java.lang.String = js.native
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
  def toFormat(dateFormat: java.lang.String, options: luxonLib.Anon_Seperator): java.lang.String = js.native
  def toISO(): java.lang.String = js.native
  def toISO(options: ISOTimeOptions): java.lang.String = js.native
  def union(other: Interval): Interval = js.native
}

