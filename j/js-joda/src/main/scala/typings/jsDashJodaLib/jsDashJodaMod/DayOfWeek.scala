package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DayOfWeek")
@js.native
class DayOfWeek protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek {
  /* CompleteClass */
  override def adjustInto(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAdjuster): this.type = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def getDisplayName(
    style: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TextStyle,
    locale: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Locale
  ): java.lang.String = js.native
  /* CompleteClass */
  override def getLong(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def isSupported(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Boolean = js.native
  /* CompleteClass */
  override def minus(days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  /* CompleteClass */
  override def name(): java.lang.String = js.native
  /* CompleteClass */
  override def ordinal(): scala.Double = js.native
  /* CompleteClass */
  override def plus(days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def value(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  var FRIDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var MONDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var SATURDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var SUNDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var THURSDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var TUESDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  var WEDNESDAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  def of(dayOfWeek: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  def valueOf(name: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek = js.native
  def values(): js.Array[jsDashJodaLib.jsDashJodaMod.JSJodaNs.DayOfWeek] = js.native
}

