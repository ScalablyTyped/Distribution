package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "YearMonth")
@js.native
/* private */ open class YearMonth () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atDay(dayOfMonth: Double): LocalDate = js.native
  
  def atEndOfMonth(): LocalDate = js.native
  
  def compareTo(other: YearMonth): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def isAfter(other: YearMonth): Boolean = js.native
  
  def isBefore(other: YearMonth): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  def isValidDay(): Boolean = js.native
  
  def lengthOfMonth(): Double = js.native
  
  def lengthOfYear(): Double = js.native
  
  def minusMonths(monthsToSubtract: Double): YearMonth = js.native
  
  def minusYears(yearsToSubtract: Double): YearMonth = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def plusMonths(monthsToAdd: Double): YearMonth = js.native
  
  def plusYears(yearsToAdd: Double): YearMonth = js.native
  
  def toJSON(): String = js.native
  
  def withMonth(month: Double): YearMonth = js.native
  
  def withYear(year: Double): YearMonth = js.native
  
  def year(): Double = js.native
}
/* static members */
object YearMonth {
  
  @JSImport("@js-joda/core", "YearMonth")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "YearMonth.FROM")
  @js.native
  def FROM: TemporalQuery[YearMonth] = js.native
  inline def FROM_=(x: TemporalQuery[YearMonth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[YearMonth]
  
  inline def now(): YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[YearMonth]
  inline def now(zoneIdOrClock: Clock): YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[YearMonth]
  inline def now(zoneIdOrClock: ZoneId): YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[YearMonth]
  
  inline def of(year: Double, monthOrNumber: Double): YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[YearMonth]
  inline def of(year: Double, monthOrNumber: Month): YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[YearMonth]
  
  inline def parse(text: String): YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[YearMonth]
  inline def parse(text: String, formatter: DateTimeFormatter): YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[YearMonth]
}
