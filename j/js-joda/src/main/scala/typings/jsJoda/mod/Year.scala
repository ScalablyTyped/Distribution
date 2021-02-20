package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("js-joda", "Year.from")
  @js.native
  def from(temporal: TemporalAccessor): Year = js.native
  
  /* static member */
  @JSImport("js-joda", "Year.isLeap")
  @js.native
  def isLeap(year: Double): Boolean = js.native
  
  /* static member */
  @JSImport("js-joda", "Year.now")
  @js.native
  def now(): Year = js.native
  @JSImport("js-joda", "Year.now")
  @js.native
  def now(zoneIdOrClock: Clock): Year = js.native
  @JSImport("js-joda", "Year.now")
  @js.native
  def now(zoneIdOrClock: ZoneId): Year = js.native
  
  /* static member */
  @JSImport("js-joda", "Year.of")
  @js.native
  def of(isoYear: Double): Year = js.native
  
  /* static member */
  @JSImport("js-joda", "Year.parse")
  @js.native
  def parse(text: String): Year = js.native
  @JSImport("js-joda", "Year.parse")
  @js.native
  def parse(text: String, formatter: DateTimeFormatter): Year = js.native
}
