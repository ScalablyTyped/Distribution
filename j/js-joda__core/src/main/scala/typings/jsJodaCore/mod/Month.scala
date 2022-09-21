package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "Month")
@js.native
/* private */ open class Month () extends TemporalAccessor {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def compareTo(other: Month): Double = js.native
  
  def firstDayOfYear(leapYear: Boolean): Double = js.native
  
  def firstMonthOfQuarter(): Month = js.native
  
  def length(leapYear: Boolean): Double = js.native
  
  def maxLength(): Double = js.native
  
  def minLength(): Double = js.native
  
  def minus(months: Double): Month = js.native
  
  def name(): String = js.native
  
  def ordinal(): Double = js.native
  
  def plus(months: Double): Month = js.native
  
  def toJSON(): String = js.native
  
  def value(): Double = js.native
}
/* static members */
object Month {
  
  @JSImport("@js-joda/core", "Month")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "Month.APRIL")
  @js.native
  def APRIL: Month = js.native
  inline def APRIL_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APRIL")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.AUGUST")
  @js.native
  def AUGUST: Month = js.native
  inline def AUGUST_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUGUST")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.DECEMBER")
  @js.native
  def DECEMBER: Month = js.native
  inline def DECEMBER_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECEMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.FEBRUARY")
  @js.native
  def FEBRUARY: Month = js.native
  inline def FEBRUARY_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FEBRUARY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.JANUARY")
  @js.native
  def JANUARY: Month = js.native
  inline def JANUARY_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JANUARY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.JULY")
  @js.native
  def JULY: Month = js.native
  inline def JULY_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JULY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.JUNE")
  @js.native
  def JUNE: Month = js.native
  inline def JUNE_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JUNE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.MARCH")
  @js.native
  def MARCH: Month = js.native
  inline def MARCH_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARCH")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.MAY")
  @js.native
  def MAY: Month = js.native
  inline def MAY_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.NOVEMBER")
  @js.native
  def NOVEMBER: Month = js.native
  inline def NOVEMBER_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOVEMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.OCTOBER")
  @js.native
  def OCTOBER: Month = js.native
  inline def OCTOBER_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCTOBER")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Month.SEPTEMBER")
  @js.native
  def SEPTEMBER: Month = js.native
  inline def SEPTEMBER_=(x: Month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPTEMBER")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): Month = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[Month]
  
  inline def of(month: Double): Month = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any]).asInstanceOf[Month]
  
  inline def valueOf(name: String): Month = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(name.asInstanceOf[js.Any]).asInstanceOf[Month]
  
  inline def values(): js.Array[Month] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Array[Month]]
}
