package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Duration")
@js.native
class Duration () extends js.Object {
  var days: scala.Double = js.native
  var hours: scala.Double = js.native
  var invalidExplanation: java.lang.String | scala.Null = js.native
  var invalidReason: java.lang.String | scala.Null = js.native
  var isValid: scala.Boolean = js.native
  var locale: java.lang.String = js.native
  var milliseconds: scala.Double = js.native
  var minutes: scala.Double = js.native
  var months: scala.Double = js.native
  var numberingSystem: java.lang.String = js.native
  var quarters: scala.Double = js.native
  var seconds: scala.Double = js.native
  var weeks: scala.Double = js.native
  var years: scala.Double = js.native
  def as(unit: DurationUnit): scala.Double = js.native
  def equals(other: Duration): scala.Boolean = js.native
  def get(unit: DurationUnit): scala.Double = js.native
  def minus(duration: Duration): Duration = js.native
  def minus(duration: DurationObject): Duration = js.native
  def minus(duration: scala.Double): Duration = js.native
  def negate(): Duration = js.native
  def normalize(): Duration = js.native
  def plus(duration: Duration): Duration = js.native
  def plus(duration: DurationObject): Duration = js.native
  def plus(duration: scala.Double): Duration = js.native
  def reconfigure(objectPattern: DurationOptions): Duration = js.native
  def set(values: DurationObjectUnits): Duration = js.native
  def shiftTo(units: DurationUnit*): Duration = js.native
  def toFormat(format: java.lang.String): java.lang.String = js.native
  def toFormat(format: java.lang.String, options: DurationToFormatOptions): java.lang.String = js.native
  def toISO(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toObject(): DurationObject = js.native
  def toObject(options: luxonLib.Anon_IncludeConfig): DurationObject = js.native
}

@JSImport("luxon", "Duration")
@js.native
object Duration extends js.Object {
  def fromISO(text: java.lang.String): luxonLib.luxonMod.Duration = js.native
  def fromISO(text: java.lang.String, options: luxonLib.luxonMod.DurationOptions): luxonLib.luxonMod.Duration = js.native
  def fromMillis(count: scala.Double): luxonLib.luxonMod.Duration = js.native
  def fromMillis(count: scala.Double, options: luxonLib.luxonMod.DurationOptions): luxonLib.luxonMod.Duration = js.native
  def fromObject(Object: luxonLib.luxonMod.DurationObject): luxonLib.luxonMod.Duration = js.native
  def invalid(): luxonLib.luxonMod.Duration = js.native
  def invalid(reason: java.lang.String): luxonLib.luxonMod.Duration = js.native
  def isDuration(o: js.Any): /* is luxon.luxon.Duration */ scala.Boolean = js.native
}

