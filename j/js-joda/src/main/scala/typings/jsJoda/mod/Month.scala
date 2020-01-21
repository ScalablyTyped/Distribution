package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Month")
@js.native
class Month protected () extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def compareTo(other: Month): Double = js.native
  def equals(other: Month): Boolean = js.native
  def firstDayOfYear(leapYear: Boolean): Double = js.native
  def firstMonthOfQuarter(): Month = js.native
  def getDisplayName(style: TextStyle, locale: Locale): String = js.native
  def getLong(field: TemporalField): Double = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def length(leapYear: Boolean): Double = js.native
  def maxLength(): Double = js.native
  def minLength(): Double = js.native
  def minus(months: Double): Month = js.native
  def name(): String = js.native
  def ordinal(): Double = js.native
  def plus(months: Double): Month = js.native
  def value(): Double = js.native
}

/* static members */
@JSImport("js-joda", "Month")
@js.native
object Month extends js.Object {
  var APRIL: Month = js.native
  var AUGUST: Month = js.native
  var DECEMBER: Month = js.native
  var FEBRUARY: Month = js.native
  var JANUARY: Month = js.native
  var JULY: Month = js.native
  var JUNE: Month = js.native
  var MARCH: Month = js.native
  var MAY: Month = js.native
  var NOVEMBER: Month = js.native
  var OCTOBER: Month = js.native
  var SEPTEMBER: Month = js.native
  def from(temporal: TemporalAccessor): Month = js.native
  def of(month: Double): Month = js.native
  def valueOf(name: String): Month = js.native
  def values(): js.Array[Month] = js.native
}

