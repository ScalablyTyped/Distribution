package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ChronoField")
@js.native
class ChronoField protected () extends StObject {
  
  def baseUnit(): Double = js.native
  
  def checkValidIntValue(value: Double): Double = js.native
  
  def checkValidValue(value: Double): js.Any = js.native
  
  def displayName(): String = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def getFrom(temporal: TemporalAccessor): Double = js.native
  
  def isDateBased(): Boolean = js.native
  
  def isTimeBased(): Boolean = js.native
  
  def name(): String = js.native
  
  def range(): ValueRange = js.native
  
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = js.native
  
  def rangeUnit(): Double = js.native
}
object ChronoField {
  
  @JSImport("js-joda", "ChronoField")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_MONTH: ChronoField = js.native
  @scala.inline
  def ALIGNED_DAY_OF_WEEK_IN_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_MONTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR")
  @js.native
  def ALIGNED_DAY_OF_WEEK_IN_YEAR: ChronoField = js.native
  @scala.inline
  def ALIGNED_DAY_OF_WEEK_IN_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_DAY_OF_WEEK_IN_YEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.ALIGNED_WEEK_OF_MONTH")
  @js.native
  def ALIGNED_WEEK_OF_MONTH: ChronoField = js.native
  @scala.inline
  def ALIGNED_WEEK_OF_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.ALIGNED_WEEK_OF_YEAR")
  @js.native
  def ALIGNED_WEEK_OF_YEAR: ChronoField = js.native
  @scala.inline
  def ALIGNED_WEEK_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNED_WEEK_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.AMPM_OF_DAY")
  @js.native
  def AMPM_OF_DAY: ChronoField = js.native
  @scala.inline
  def AMPM_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AMPM_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.CLOCK_HOUR_OF_AMPM")
  @js.native
  def CLOCK_HOUR_OF_AMPM: ChronoField = js.native
  @scala.inline
  def CLOCK_HOUR_OF_AMPM_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.CLOCK_HOUR_OF_DAY")
  @js.native
  def CLOCK_HOUR_OF_DAY: ChronoField = js.native
  @scala.inline
  def CLOCK_HOUR_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCK_HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.DAY_OF_MONTH")
  @js.native
  def DAY_OF_MONTH: ChronoField = js.native
  @scala.inline
  def DAY_OF_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_MONTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.DAY_OF_WEEK")
  @js.native
  def DAY_OF_WEEK: ChronoField = js.native
  @scala.inline
  def DAY_OF_WEEK_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_WEEK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.DAY_OF_YEAR")
  @js.native
  def DAY_OF_YEAR: ChronoField = js.native
  @scala.inline
  def DAY_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.EPOCH_DAY")
  @js.native
  def EPOCH_DAY: ChronoField = js.native
  @scala.inline
  def EPOCH_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.ERA")
  @js.native
  def ERA: ChronoField = js.native
  @scala.inline
  def ERA_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.HOUR_OF_AMPM")
  @js.native
  def HOUR_OF_AMPM: ChronoField = js.native
  @scala.inline
  def HOUR_OF_AMPM_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_AMPM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.HOUR_OF_DAY")
  @js.native
  def HOUR_OF_DAY: ChronoField = js.native
  @scala.inline
  def HOUR_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.INSTANT_SECONDS")
  @js.native
  def INSTANT_SECONDS: ChronoField = js.native
  @scala.inline
  def INSTANT_SECONDS_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANT_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MICRO_OF_DAY")
  @js.native
  def MICRO_OF_DAY: ChronoField = js.native
  @scala.inline
  def MICRO_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MICRO_OF_SECOND")
  @js.native
  def MICRO_OF_SECOND: ChronoField = js.native
  @scala.inline
  def MICRO_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICRO_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MILLI_OF_DAY")
  @js.native
  def MILLI_OF_DAY: ChronoField = js.native
  @scala.inline
  def MILLI_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MILLI_OF_SECOND")
  @js.native
  def MILLI_OF_SECOND: ChronoField = js.native
  @scala.inline
  def MILLI_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MINUTE_OF_DAY")
  @js.native
  def MINUTE_OF_DAY: ChronoField = js.native
  @scala.inline
  def MINUTE_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MINUTE_OF_HOUR")
  @js.native
  def MINUTE_OF_HOUR: ChronoField = js.native
  @scala.inline
  def MINUTE_OF_HOUR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE_OF_HOUR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.MONTH_OF_YEAR")
  @js.native
  def MONTH_OF_YEAR: ChronoField = js.native
  @scala.inline
  def MONTH_OF_YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH_OF_YEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.NANO_OF_DAY")
  @js.native
  def NANO_OF_DAY: ChronoField = js.native
  @scala.inline
  def NANO_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.NANO_OF_SECOND")
  @js.native
  def NANO_OF_SECOND: ChronoField = js.native
  @scala.inline
  def NANO_OF_SECOND_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANO_OF_SECOND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.OFFSET_SECONDS")
  @js.native
  def OFFSET_SECONDS: ChronoField = js.native
  @scala.inline
  def OFFSET_SECONDS_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.PROLEPTIC_MONTH")
  @js.native
  def PROLEPTIC_MONTH: ChronoField = js.native
  @scala.inline
  def PROLEPTIC_MONTH_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROLEPTIC_MONTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.SECOND_OF_DAY")
  @js.native
  def SECOND_OF_DAY: ChronoField = js.native
  @scala.inline
  def SECOND_OF_DAY_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_DAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.SECOND_OF_MINUTE")
  @js.native
  def SECOND_OF_MINUTE: ChronoField = js.native
  @scala.inline
  def SECOND_OF_MINUTE_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND_OF_MINUTE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.YEAR")
  @js.native
  def YEAR: ChronoField = js.native
  @scala.inline
  def YEAR_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ChronoField.YEAR_OF_ERA")
  @js.native
  def YEAR_OF_ERA: ChronoField = js.native
  @scala.inline
  def YEAR_OF_ERA_=(x: ChronoField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR_OF_ERA")(x.asInstanceOf[js.Any])
}
