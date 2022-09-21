package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "DayOfWeek")
@js.native
/* private */ open class DayOfWeek () extends TemporalAccessor {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def compareTo(other: DayOfWeek): Double = js.native
  
  def minus(days: Double): DayOfWeek = js.native
  
  def name(): String = js.native
  
  def ordinal(): Double = js.native
  
  def plus(days: Double): DayOfWeek = js.native
  
  def toJSON(): String = js.native
  
  def value(): Double = js.native
}
/* static members */
object DayOfWeek {
  
  @JSImport("@js-joda/core", "DayOfWeek")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "DayOfWeek.FRIDAY")
  @js.native
  def FRIDAY: DayOfWeek = js.native
  inline def FRIDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRIDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.FROM")
  @js.native
  def FROM: TemporalQuery[DayOfWeek] = js.native
  inline def FROM_=(x: TemporalQuery[DayOfWeek]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.MONDAY")
  @js.native
  def MONDAY: DayOfWeek = js.native
  inline def MONDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.SATURDAY")
  @js.native
  def SATURDAY: DayOfWeek = js.native
  inline def SATURDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SATURDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.SUNDAY")
  @js.native
  def SUNDAY: DayOfWeek = js.native
  inline def SUNDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUNDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.THURSDAY")
  @js.native
  def THURSDAY: DayOfWeek = js.native
  inline def THURSDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THURSDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.TUESDAY")
  @js.native
  def TUESDAY: DayOfWeek = js.native
  inline def TUESDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TUESDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DayOfWeek.WEDNESDAY")
  @js.native
  def WEDNESDAY: DayOfWeek = js.native
  inline def WEDNESDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEDNESDAY")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  inline def of(dayOfWeek: Double): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  inline def valueOf(name: String): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(name.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  inline def values(): js.Array[DayOfWeek] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Array[DayOfWeek]]
}
