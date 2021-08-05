package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Period")
@js.native
/* private */ class Period () extends TemporalAmount {
  
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
  inline def ZERO_=(x: Period): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def between(startDate: LocalDate, endDate: LocalDate): Period = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[Period]
  
  /* static member */
  inline def create(years: Double, months: Double, days: Double): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(years.asInstanceOf[js.Any], months.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  /* static member */
  inline def from(amount: TemporalAmount): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[Period]
  
  /* static member */
  inline def of(years: Double, months: Double, days: Double): Period = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(years.asInstanceOf[js.Any], months.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Period]
  
  /* static member */
  inline def ofDays(days: Double): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[Period]
  
  /* static member */
  inline def ofMonths(months: Double): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMonths")(months.asInstanceOf[js.Any]).asInstanceOf[Period]
  
  /* static member */
  inline def ofWeeks(weeks: Double): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofWeeks")(weeks.asInstanceOf[js.Any]).asInstanceOf[Period]
  
  /* static member */
  inline def ofYears(years: Double): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofYears")(years.asInstanceOf[js.Any]).asInstanceOf[Period]
  
  /* static member */
  inline def parse(text: String): Period = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Period]
}
