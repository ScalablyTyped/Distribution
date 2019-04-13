package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Month")
@js.native
class Month protected () extends Temporal {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def firstDayOfYear(leapYear: scala.Boolean): scala.Double = js.native
  def firstMonthOfQuarter(): Month = js.native
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def isSupported(field: TemporalField): scala.Boolean = js.native
  def length(leapYear: scala.Boolean): scala.Double = js.native
  def maxLength(): scala.Double = js.native
  def minLength(): scala.Double = js.native
  def minus(months: scala.Double): Month = js.native
  def plus(months: scala.Double): Month = js.native
  def value(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "Month")
@js.native
object Month extends js.Object {
  var APRIL: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var AUGUST: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var DECEMBER: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var FEBRUARY: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var JANUARY: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var JULY: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var JUNE: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var MARCH: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var MAY: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var NOVEMBER: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var OCTOBER: jsDashJodaLib.jsDashJodaMod.Month = js.native
  var SEPTEMBER: jsDashJodaLib.jsDashJodaMod.Month = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.Month = js.native
  def of(month: scala.Double): jsDashJodaLib.jsDashJodaMod.Month = js.native
  def values(): js.Array[jsDashJodaLib.jsDashJodaMod.Month] = js.native
}

