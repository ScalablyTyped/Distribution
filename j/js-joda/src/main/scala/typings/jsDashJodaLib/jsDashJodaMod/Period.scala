package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Period")
@js.native
class Period ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period {
  /* CompleteClass */
  override def addTo[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T): T = js.native
  /* CompleteClass */
  override def chronology(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.IsoChronology = js.native
  /* CompleteClass */
  override def days(): scala.Double = js.native
  /* CompleteClass */
  override def equals(obj: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def get(unit: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit): scala.Double = js.native
  /* CompleteClass */
  override def isNegative(): scala.Boolean = js.native
  /* CompleteClass */
  override def isZero(): scala.Boolean = js.native
  /* CompleteClass */
  override def minus(amountToSubtract: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAmount): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def minusDays(daysToSubtract: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def minusMonths(monthsToSubtract: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def minusYears(yearsToSubtract: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def months(): scala.Double = js.native
  /* CompleteClass */
  override def multipliedBy(scalar: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def negated(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def normalized(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def plus(amountToAdd: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAmount): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def plusDays(daysToAdd: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def plusMonths(monthsToAdd: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def plusYears(yearsToAdd: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def subtractFrom[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T): T = js.native
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  /* CompleteClass */
  override def toTotalMonths(): scala.Double = js.native
  /* CompleteClass */
  override def units(): js.Array[jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit] = js.native
  /* CompleteClass */
  override def withDays(days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def withMonths(months: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def withYears(years: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  /* CompleteClass */
  override def years(): scala.Double = js.native
}

@JSImport("js-joda", "Period")
@js.native
object Period extends js.Object {
  var ZERO: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def between(
    startDate: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate,
    endDate: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def create(years: scala.Double, months: scala.Double, days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def from(amount: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAmount): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def of(years: scala.Double, months: scala.Double, days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def ofDays(days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def ofMonths(months: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def ofWeeks(weeks: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def ofYears(years: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Period = js.native
}

