package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Month")
@js.native
class Month ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month {
  /* CompleteClass */
  override def adjustInto(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal = js.native
  /* CompleteClass */
  override def firstDayOfYear(leapYear: scala.Boolean): scala.Double = js.native
  /* CompleteClass */
  override def firstMonthOfQuarter(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
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
  override def length(leapYear: scala.Boolean): scala.Double = js.native
  /* CompleteClass */
  override def maxLength(): scala.Double = js.native
  /* CompleteClass */
  override def minLength(): scala.Double = js.native
  /* CompleteClass */
  override def minus(months: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  /* CompleteClass */
  override def plus(months: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def value(): scala.Double = js.native
}

@JSImport("js-joda", "Month")
@js.native
object Month extends js.Object {
  var APRIL: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var AUGUST: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var DECEMBER: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var FEBRUARY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var JANUARY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var JULY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var JUNE: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var MARCH: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var MAY: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var NOVEMBER: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var OCTOBER: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  var SEPTEMBER: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  def of(month: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month = js.native
  def values(): js.Array[jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month] = js.native
}

