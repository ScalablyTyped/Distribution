package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "MonthDay")
@js.native
/* private */ open class MonthDay () extends TemporalAccessor {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atYear(year: Double): LocalDate = js.native
  
  def compareTo(other: MonthDay): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def isAfter(other: MonthDay): Boolean = js.native
  
  def isBefore(other: MonthDay): Boolean = js.native
  
  def isValidYear(year: Double): Boolean = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def toJSON(): String = js.native
  
  def `with`(month: Month): MonthDay = js.native
  
  def withDayOfMonth(dayOfMonth: Double): MonthDay = js.native
  
  def withMonth(month: Double): MonthDay = js.native
}
/* static members */
object MonthDay {
  
  @JSImport("@js-joda/core", "MonthDay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "MonthDay.FROM")
  @js.native
  def FROM: TemporalQuery[MonthDay] = js.native
  inline def FROM_=(x: TemporalQuery[MonthDay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  
  inline def now(): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[MonthDay]
  inline def now(zoneIdOrClock: Clock): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  inline def now(zoneIdOrClock: ZoneId): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  
  inline def of(month: Double, dayOfMonth: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  inline def of(month: Month, dayOfMonth: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  
  inline def parse(text: String): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  inline def parse(text: String, formatter: DateTimeFormatter): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
}
