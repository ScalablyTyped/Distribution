package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ChronoField")
@js.native
class ChronoField protected () extends js.Object {
  
  def baseUnit(): Double = js.native
  
  def checkValidIntValue(value: Double): Double = js.native
  
  def checkValidValue(value: Double): js.Any = js.native
  
  def displayName(): String = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def getFrom(temporal: TemporalAccessor): Double = js.native
  
  def isDateBased(): Boolean = js.native
  
  def isTimeBased(): Boolean = js.native
  
  def name(): String = js.native
  
  def range(): ValueRange = js.native
  
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = js.native
  
  def rangeUnit(): Double = js.native
}
/* static members */
@JSImport("js-joda", "ChronoField")
@js.native
object ChronoField extends js.Object {
  
  var ALIGNED_DAY_OF_WEEK_IN_MONTH: ChronoField = js.native
  
  var ALIGNED_DAY_OF_WEEK_IN_YEAR: ChronoField = js.native
  
  var ALIGNED_WEEK_OF_MONTH: ChronoField = js.native
  
  var ALIGNED_WEEK_OF_YEAR: ChronoField = js.native
  
  var AMPM_OF_DAY: ChronoField = js.native
  
  var CLOCK_HOUR_OF_AMPM: ChronoField = js.native
  
  var CLOCK_HOUR_OF_DAY: ChronoField = js.native
  
  var DAY_OF_MONTH: ChronoField = js.native
  
  var DAY_OF_WEEK: ChronoField = js.native
  
  var DAY_OF_YEAR: ChronoField = js.native
  
  var EPOCH_DAY: ChronoField = js.native
  
  var ERA: ChronoField = js.native
  
  var HOUR_OF_AMPM: ChronoField = js.native
  
  var HOUR_OF_DAY: ChronoField = js.native
  
  var INSTANT_SECONDS: ChronoField = js.native
  
  var MICRO_OF_DAY: ChronoField = js.native
  
  var MICRO_OF_SECOND: ChronoField = js.native
  
  var MILLI_OF_DAY: ChronoField = js.native
  
  var MILLI_OF_SECOND: ChronoField = js.native
  
  var MINUTE_OF_DAY: ChronoField = js.native
  
  var MINUTE_OF_HOUR: ChronoField = js.native
  
  var MONTH_OF_YEAR: ChronoField = js.native
  
  var NANO_OF_DAY: ChronoField = js.native
  
  var NANO_OF_SECOND: ChronoField = js.native
  
  var OFFSET_SECONDS: ChronoField = js.native
  
  var PROLEPTIC_MONTH: ChronoField = js.native
  
  var SECOND_OF_DAY: ChronoField = js.native
  
  var SECOND_OF_MINUTE: ChronoField = js.native
  
  var YEAR: ChronoField = js.native
  
  var YEAR_OF_ERA: ChronoField = js.native
}
