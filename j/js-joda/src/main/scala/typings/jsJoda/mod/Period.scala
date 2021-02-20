package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Period")
@js.native
class Period protected () extends TemporalAmount {
  
  def chronology(): IsoChronology = js.native
  
  def days(): Double = js.native
  
  def equals(obj: js.Any): Boolean = js.native
  
  def isNegative(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def minus(amountToSubtract: TemporalAmount): Period = js.native
  
  def minusDays(daysToSubtract: Double): Period = js.native
  
  def minusMonths(monthsToSubtract: Double): Period = js.native
  
  def minusYears(yearsToSubtract: Double): Period = js.native
  
  def months(): Double = js.native
  
  def multipliedBy(scalar: Double): Period = js.native
  
  def negated(): Period = js.native
  
  def normalized(): Period = js.native
  
  def plus(amountToAdd: TemporalAmount): Period = js.native
  
  def plusDays(daysToAdd: Double): Period = js.native
  
  def plusMonths(monthsToAdd: Double): Period = js.native
  
  def plusYears(yearsToAdd: Double): Period = js.native
  
  def toJSON(): String = js.native
  
  def toTotalMonths(): Double = js.native
  
  def withDays(days: Double): Period = js.native
  
  def withMonths(months: Double): Period = js.native
  
  def withYears(years: Double): Period = js.native
  
  def years(): Double = js.native
}
object Period {
  
  @JSImport("js-joda", "Period")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.ZERO")
  @js.native
  def ZERO: Period = js.native
  @scala.inline
  def ZERO_=(x: Period): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Period.between")
  @js.native
  def between(startDate: LocalDate, endDate: LocalDate): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.create")
  @js.native
  def create(years: Double, months: Double, days: Double): Duration = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.from")
  @js.native
  def from(amount: TemporalAmount): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.of")
  @js.native
  def of(years: Double, months: Double, days: Double): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.ofDays")
  @js.native
  def ofDays(days: Double): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.ofMonths")
  @js.native
  def ofMonths(months: Double): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.ofWeeks")
  @js.native
  def ofWeeks(weeks: Double): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.ofYears")
  @js.native
  def ofYears(years: Double): Period = js.native
  
  /* static member */
  @JSImport("js-joda", "Period.parse")
  @js.native
  def parse(text: String): Period = js.native
}
