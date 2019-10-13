package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DayOfWeek")
@js.native
class DayOfWeek protected () extends TemporalAccessor {
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  def compareTo(other: DayOfWeek): Double = js.native
  def equals(other: js.Any): Boolean = js.native
  def getDisplayName(style: TextStyle, locale: Locale): String = js.native
  def getLong(field: TemporalField): Double = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def minus(days: Double): DayOfWeek = js.native
  def name(): String = js.native
  def ordinal(): Double = js.native
  def plus(days: Double): DayOfWeek = js.native
  def value(): Double = js.native
}

/* static members */
@JSImport("js-joda", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  var FRIDAY: DayOfWeek = js.native
  var MONDAY: DayOfWeek = js.native
  var SATURDAY: DayOfWeek = js.native
  var SUNDAY: DayOfWeek = js.native
  var THURSDAY: DayOfWeek = js.native
  var TUESDAY: DayOfWeek = js.native
  var WEDNESDAY: DayOfWeek = js.native
  def from(temporal: TemporalAccessor): DayOfWeek = js.native
  def of(dayOfWeek: Double): DayOfWeek = js.native
  def valueOf(name: String): DayOfWeek = js.native
  def values(): js.Array[DayOfWeek] = js.native
}

