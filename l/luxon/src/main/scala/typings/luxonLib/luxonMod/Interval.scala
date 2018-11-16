package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Interval")
@js.native
class Interval ()
  extends luxonLib.luxonMod.luxonNs.Interval

@JSImport("luxon", "Interval")
@js.native
object Interval extends js.Object {
  def after(start: luxonLib.luxonMod.luxonNs.DateObject, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: luxonLib.luxonMod.luxonNs.DateObject, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: luxonLib.luxonMod.luxonNs.DateObject, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: luxonLib.luxonMod.luxonNs.DateTime, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: luxonLib.luxonMod.luxonNs.DateTime, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: luxonLib.luxonMod.luxonNs.DateTime, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: stdLib.Date, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: stdLib.Date, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def after(start: stdLib.Date, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateObject, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateObject, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateObject, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateTime, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateTime, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: luxonLib.luxonMod.luxonNs.DateTime, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: stdLib.Date, duration: luxonLib.luxonMod.luxonNs.Duration): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: stdLib.Date, duration: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def before(end: stdLib.Date, duration: scala.Double): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateObject, end: luxonLib.luxonMod.luxonNs.DateObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateObject, end: luxonLib.luxonMod.luxonNs.DateTime): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateObject, end: stdLib.Date): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateTime, end: luxonLib.luxonMod.luxonNs.DateObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateTime, end: luxonLib.luxonMod.luxonNs.DateTime): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: luxonLib.luxonMod.luxonNs.DateTime, end: stdLib.Date): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: luxonLib.luxonMod.luxonNs.DateObject): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: luxonLib.luxonMod.luxonNs.DateTime): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromDateTimes(start: stdLib.Date, end: stdLib.Date): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromISO(string: java.lang.String): luxonLib.luxonMod.luxonNs.Interval = js.native
  def fromISO(string: java.lang.String, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.Interval = js.native
  def invalid(): luxonLib.luxonMod.luxonNs.Interval = js.native
  def invalid(reason: java.lang.String): luxonLib.luxonMod.luxonNs.Interval = js.native
  def merge(intervals: js.Array[luxonLib.luxonMod.luxonNs.Interval]): js.Array[luxonLib.luxonMod.luxonNs.Interval] = js.native
  def xor(intervals: js.Array[luxonLib.luxonMod.luxonNs.Interval]): js.Array[luxonLib.luxonMod.luxonNs.Interval] = js.native
}

