package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Year")
@js.native
class Year protected () extends Temporal {
  
  def atMonth(monthOrNumber: Double): YearMonth = js.native
  def atMonth(monthOrNumber: Month): YearMonth = js.native
  
  def minus(amountOrNumber: Double): Year = js.native
  def minus(amountOrNumber: Double, unit: TemporalUnit): Year = js.native
  def minus(amountOrNumber: TemporalAmount): Year = js.native
  def minus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  
  def plus(amountOrNumber: Double): Year = js.native
  def plus(amountOrNumber: Double, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: TemporalAmount): Year = js.native
  def plus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  
  def value(): Double = js.native
}
object Year {
  
  @JSImport("js-joda", "Year")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "Year.MAX_VALUE")
  @js.native
  def MAX_VALUE: Double = js.native
  @scala.inline
  def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Year.MIN_VALUE")
  @js.native
  def MIN_VALUE: Double = js.native
  @scala.inline
  def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def from(temporal: TemporalAccessor): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  /* static member */
  @scala.inline
  def isLeap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def now(): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Year]
  @scala.inline
  def now(zoneIdOrClock: Clock): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[Year]
  @scala.inline
  def now(zoneIdOrClock: ZoneId): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  /* static member */
  @scala.inline
  def of(isoYear: Double): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(isoYear.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  /* static member */
  @scala.inline
  def parse(text: String): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Year]
  @scala.inline
  def parse(text: String, formatter: DateTimeFormatter): Year = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Year]
}
