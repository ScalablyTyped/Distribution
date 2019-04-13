package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoField")
@js.native
class ChronoField protected () extends js.Object {
  def baseUnit(): scala.Double = js.native
  def checkValidIntValue(value: scala.Double): scala.Double = js.native
  def checkValidValue(value: scala.Double): js.Any = js.native
  def displayName(): java.lang.String = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def getFrom(temporal: TemporalAccessor): scala.Double = js.native
  def isDateBased(): scala.Boolean = js.native
  def isTimeBased(): scala.Boolean = js.native
  def name(): java.lang.String = js.native
  def range(): ValueRange = js.native
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = js.native
  def rangeUnit(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "ChronoField")
@js.native
object ChronoField extends js.Object {
  var ALIGNED_DAY_OF_WEEK_IN_MONTH: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var ALIGNED_DAY_OF_WEEK_IN_YEAR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var ALIGNED_WEEK_OF_MONTH: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var ALIGNED_WEEK_OF_YEAR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var AMPM_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var CLOCK_HOUR_OF_AMPM: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var CLOCK_HOUR_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var DAY_OF_MONTH: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var DAY_OF_WEEK: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var DAY_OF_YEAR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var EPOCH_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var ERA: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var HOUR_OF_AMPM: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var HOUR_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var INSTANT_SECONDS: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MICRO_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MICRO_OF_SECOND: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MILLI_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MILLI_OF_SECOND: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MINUTE_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MINUTE_OF_HOUR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var MONTH_OF_YEAR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var NANO_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var NANO_OF_SECOND: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var OFFSET_SECONDS: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var PROLEPTIC_MONTH: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var SECOND_OF_DAY: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var SECOND_OF_MINUTE: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var YEAR: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
  var YEAR_OF_ERA: jsDashJodaLib.jsDashJodaMod.ChronoField = js.native
}

