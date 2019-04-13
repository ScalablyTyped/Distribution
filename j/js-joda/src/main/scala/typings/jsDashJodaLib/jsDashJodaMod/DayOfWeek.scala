package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DayOfWeek")
@js.native
class DayOfWeek protected () extends Temporal {
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def isSupported(field: TemporalField): scala.Boolean = js.native
  def minus(days: scala.Double): DayOfWeek = js.native
  def name(): java.lang.String = js.native
  def ordinal(): scala.Double = js.native
  def plus(days: scala.Double): DayOfWeek = js.native
  def value(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  var FRIDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var MONDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var SATURDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var SUNDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var THURSDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var TUESDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  var WEDNESDAY: jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  def of(dayOfWeek: scala.Double): jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  def valueOf(name: java.lang.String): jsDashJodaLib.jsDashJodaMod.DayOfWeek = js.native
  def values(): js.Array[jsDashJodaLib.jsDashJodaMod.DayOfWeek] = js.native
}

