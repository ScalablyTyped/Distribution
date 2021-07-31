package typings.luxon.mod

import typings.luxon.anon.IncludeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Duration")
@js.native
class Duration () extends StObject {
  
  def as(unit: DurationUnit): Double = js.native
  
  var days: Double = js.native
  
  def equals(other: Duration): Boolean = js.native
  
  def get(unit: DurationUnit): Double = js.native
  
  var hours: Double = js.native
  
  var invalidExplanation: String | Null = js.native
  
  var invalidReason: String | Null = js.native
  
  var isValid: Boolean = js.native
  
  var locale: String = js.native
  
  def mapUnits(fn: js.Function2[/* x */ Double, /* u */ DurationUnit, Double]): Duration = js.native
  
  var milliseconds: Double = js.native
  
  def minus(duration: Double): Duration = js.native
  def minus(duration: Duration): Duration = js.native
  def minus(duration: DurationObject): Duration = js.native
  
  var minutes: Double = js.native
  
  var months: Double = js.native
  
  def negate(): Duration = js.native
  
  def normalize(): Duration = js.native
  
  var numberingSystem: String = js.native
  
  def plus(duration: Double): Duration = js.native
  def plus(duration: Duration): Duration = js.native
  def plus(duration: DurationObject): Duration = js.native
  
  var quarters: Double = js.native
  
  def reconfigure(objectPattern: DurationOptions): Duration = js.native
  
  var seconds: Double = js.native
  
  def set(values: DurationObjectUnits): Duration = js.native
  
  def shiftTo(units: DurationUnit*): Duration = js.native
  
  def toFormat(format: String): String = js.native
  def toFormat(format: String, options: DurationToFormatOptions): String = js.native
  
  def toISO(): String = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): DurationObject = js.native
  def toObject(options: IncludeConfig): DurationObject = js.native
  
  var weeks: Double = js.native
  
  var years: Double = js.native
}
/* static members */
object Duration {
  
  @JSImport("luxon", "Duration")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromISO(text: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any]).asInstanceOf[Duration]
  @scala.inline
  def fromISO(text: String, options: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromISO")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  @scala.inline
  def fromMillis(count: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any]).asInstanceOf[Duration]
  @scala.inline
  def fromMillis(count: Double, options: DurationOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  @scala.inline
  def fromObject(Object: DurationObject): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(Object.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  @scala.inline
  def invalid(): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Duration]
  @scala.inline
  def invalid(reason: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(reason.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  @scala.inline
  def isDuration(o: js.Any): /* is luxon.luxon.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(o.asInstanceOf[js.Any]).asInstanceOf[/* is luxon.luxon.Duration */ Boolean]
}
