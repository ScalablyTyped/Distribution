package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneOffset")
@js.native
class ZoneOffset protected () extends ZoneId {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def compareTo(other: ZoneOffset): Double = js.native
  
  def get(field: TemporalField): Double = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def query(query: TemporalQuery): js.Any = js.native
  
  def totalSeconds(): Double = js.native
}
object ZoneOffset {
  
  @JSImport("js-joda", "ZoneOffset")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MAX")
  @js.native
  def MAX: ZoneOffset = js.native
  @scala.inline
  def MAX_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: ZoneOffset = js.native
  @scala.inline
  def MAX_SECONDS_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MIN")
  @js.native
  def MIN: ZoneOffset = js.native
  @scala.inline
  def MIN_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.UTC")
  @js.native
  def UTC: ZoneOffset = js.native
  @scala.inline
  def UTC_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def of(offsetId: String): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(offsetId.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  /* static member */
  @scala.inline
  def ofHours(hours: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  /* static member */
  @scala.inline
  def ofHoursMinutes(hours: Double, minutes: Double): ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutes")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[ZoneOffset]
  
  /* static member */
  @scala.inline
  def ofHoursMinutesSeconds(hours: Double, minutes: Double, seconds: Double): ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutesSeconds")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[ZoneOffset]
  
  /* static member */
  @scala.inline
  def ofTotalMinutes(totalMinutes: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalMinutes")(totalMinutes.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
  
  /* static member */
  @scala.inline
  def ofTotalSeconds(totalSeconds: Double): ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalSeconds")(totalSeconds.asInstanceOf[js.Any]).asInstanceOf[ZoneOffset]
}
