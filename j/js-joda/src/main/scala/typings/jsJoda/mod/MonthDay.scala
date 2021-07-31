package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "MonthDay")
@js.native
class MonthDay protected () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atYear(year: Double): LocalDate = js.native
  
  def compareTo(other: MonthDay): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def equals(obj: js.Any): Boolean = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def isAfter(other: MonthDay): Boolean = js.native
  
  def isBefore(other: MonthDay): Boolean = js.native
  
  def isSupported(field: TemporalField): Boolean = js.native
  
  def isValidYear(year: Double): Boolean = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def `with`(month: Month): MonthDay = js.native
  
  def withDayOfMonth(dayOfMonth: Double): MonthDay = js.native
  
  def withMonth(month: Double): MonthDay = js.native
}
object MonthDay {
  
  @JSImport("js-joda", "MonthDay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def from(temporal: TemporalAccessor): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def now(): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[MonthDay]
  @scala.inline
  def now(arg1: Clock): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(arg1.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  @scala.inline
  def now(arg1: ZoneId): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(arg1.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  
  @scala.inline
  def of(monthOrNumber: Double): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(monthOrNumber.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  @scala.inline
  def of(monthOrNumber: Double, number: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(monthOrNumber.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  /* static member */
  @scala.inline
  def of(monthOrNumber: Month): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(monthOrNumber.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  @scala.inline
  def of(monthOrNumber: Month, number: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(monthOrNumber.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def ofMonthNumber(month: Month, dayOfMonth: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("ofMonthNumber")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def ofNumberNumber(month: Double, dayOfMonth: Double): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("ofNumberNumber")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def parse(text: String): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  @scala.inline
  def parse(text: String, formatter: DateTimeFormatter): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def parseString(text: String): MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(text.asInstanceOf[js.Any]).asInstanceOf[MonthDay]
  
  /* static member */
  @scala.inline
  def parseStringFormatter(text: String, formatter: DateTimeFormatter): MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringFormatter")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[MonthDay]
}
