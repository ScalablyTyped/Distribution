package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Period extends TemporalAmount {
  def chronology(): IsoChronology
  def days(): scala.Double
  def equals(obj: js.Any): scala.Boolean
  def isNegative(): scala.Boolean
  def isZero(): scala.Boolean
  def minus(amountToSubtract: TemporalAmount): Period
  def minusDays(daysToSubtract: scala.Double): Period
  def minusMonths(monthsToSubtract: scala.Double): Period
  def minusYears(yearsToSubtract: scala.Double): Period
  def months(): scala.Double
  def multipliedBy(scalar: scala.Double): Period
  def negated(): Period
  def normalized(): Period
  def plus(amountToAdd: TemporalAmount): Period
  def plusDays(daysToAdd: scala.Double): Period
  def plusMonths(monthsToAdd: scala.Double): Period
  def plusYears(yearsToAdd: scala.Double): Period
  def toJSON(): java.lang.String
  def toTotalMonths(): scala.Double
  def withDays(days: scala.Double): Period
  def withMonths(months: scala.Double): Period
  def withYears(years: scala.Double): Period
  def years(): scala.Double
}

