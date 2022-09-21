package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "Year")
@js.native
/* private */ open class Year () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atDay(dayOfYear: Double): LocalDate = js.native
  
  def atMonth(month: Double): YearMonth = js.native
  def atMonth(month: Month): YearMonth = js.native
  
  def atMonthDay(monthDay: MonthDay): LocalDate = js.native
  
  def compareTo(other: Year): Double = js.native
  
  def isAfter(other: Year): Boolean = js.native
  
  def isBefore(other: Year): Boolean = js.native
  
  def isLeap(): Boolean = js.native
  
  def isValidMonthDay(monthDay: MonthDay): Boolean = js.native
  
  def length(): Double = js.native
  
  def minusYears(yearsToSubtract: Double): Year = js.native
  
  def plusYears(yearsToAdd: Double): Year = js.native
  
  def toJSON(): String = js.native
  
  def value(): Double = js.native
}
/* static members */
object Year {
  
  @JSImport("@js-joda/core", "Year")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "Year.FROM")
  @js.native
  def FROM: TemporalQuery[Year] = js.native
  inline def FROM_=(x: TemporalQuery[Year]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Year.MAX_VALUE")
  @js.native
  def MAX_VALUE: Double = js.native
  inline def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Year.MIN_VALUE")
  @js.native
  def MIN_VALUE: Double = js.native
  inline def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def isLeap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def now(): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Year]
  inline def now(zoneIdOrClock: Clock): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[Year]
  inline def now(zoneIdOrClock: ZoneId): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def of(isoYear: Double): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(isoYear.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def parse(text: String): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Year]
  inline def parse(text: String, formatter: DateTimeFormatter): Year = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Year]
}
