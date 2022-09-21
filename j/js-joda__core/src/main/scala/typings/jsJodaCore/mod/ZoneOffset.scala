package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "ZoneOffset")
@js.native
/* private */ open class ZoneOffset () extends ZoneId {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def compareTo(other: ZoneOffset): Double = js.native
  
  def get(field: TemporalField): Double = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def totalSeconds(): Double = js.native
}
/* static members */
object ZoneOffset {
  
  @JSImport("@js-joda/core", "ZoneOffset")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "ZoneOffset.MAX")
  @js.native
  def MAX: ZoneOffset = js.native
  inline def MAX_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "ZoneOffset.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: ZoneOffset = js.native
  inline def MAX_SECONDS_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "ZoneOffset.MIN")
  @js.native
  def MIN: ZoneOffset = js.native
  inline def MIN_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "ZoneOffset.UTC")
  @js.native
  def UTC: ZoneOffset = js.native
  inline def UTC_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  inline def of(offsetId: String): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(offsetId.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  inline def ofHours(hours: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  inline def ofHoursMinutes(hours: Double, minutes: Double): ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutes")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[ZoneOffset]
  
  inline def ofHoursMinutesSeconds(hours: Double, minutes: Double, seconds: Double): ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutesSeconds")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[ZoneOffset]
  
  inline def ofTotalMinutes(totalMinutes: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalMinutes")(totalMinutes.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  inline def ofTotalSeconds(totalSeconds: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalSeconds")(totalSeconds.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
}
