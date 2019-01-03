package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Month extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal
  def firstDayOfYear(leapYear: scala.Boolean): scala.Double
  def firstMonthOfQuarter(): Month
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String
  def getLong(field: TemporalField): scala.Double
  def isSupported(field: TemporalField): scala.Boolean
  def length(leapYear: scala.Boolean): scala.Double
  def maxLength(): scala.Double
  def minLength(): scala.Double
  def minus(months: scala.Double): Month
  def plus(months: scala.Double): Month
  def value(): scala.Double
}

