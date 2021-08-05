package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "DayOfWeek")
@js.native
/* private */ class DayOfWeek () extends Temporal {
  
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  
  def compareTo(other: DayOfWeek): Double = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def getDisplayName(style: TextStyle, locale: Locale): String = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def isSupported(field: TemporalField): Boolean = js.native
  
  def minus(days: Double): DayOfWeek = js.native
  
  def name(): String = js.native
  
  def ordinal(): Double = js.native
  
  def plus(days: Double): DayOfWeek = js.native
  
  def value(): Double = js.native
}
object DayOfWeek {
  
  @JSImport("js-joda", "DayOfWeek")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.FRIDAY")
  @js.native
  def FRIDAY: DayOfWeek = js.native
  inline def FRIDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRIDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.MONDAY")
  @js.native
  def MONDAY: DayOfWeek = js.native
  inline def MONDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.SATURDAY")
  @js.native
  def SATURDAY: DayOfWeek = js.native
  inline def SATURDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SATURDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.SUNDAY")
  @js.native
  def SUNDAY: DayOfWeek = js.native
  inline def SUNDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUNDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.THURSDAY")
  @js.native
  def THURSDAY: DayOfWeek = js.native
  inline def THURSDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THURSDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.TUESDAY")
  @js.native
  def TUESDAY: DayOfWeek = js.native
  inline def TUESDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TUESDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DayOfWeek.WEDNESDAY")
  @js.native
  def WEDNESDAY: DayOfWeek = js.native
  inline def WEDNESDAY_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEDNESDAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def from(temporal: TemporalAccessor): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  /* static member */
  inline def of(dayOfWeek: Double): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(dayOfWeek.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  /* static member */
  inline def valueOf_(name: String): DayOfWeek = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(name.asInstanceOf[js.Any]).asInstanceOf[DayOfWeek]
  
  /* static member */
  inline def values(): js.Array[DayOfWeek] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Array[DayOfWeek]]
}
