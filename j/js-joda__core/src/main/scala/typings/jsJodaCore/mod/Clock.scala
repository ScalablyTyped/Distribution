package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "Clock")
@js.native
open class Clock () extends StObject {
  
  def instant(): Instant = js.native
  
  def millis(): Double = js.native
  
  def withZone(zone: ZoneId): Clock = js.native
  
  def zone(): ZoneId = js.native
}
/* static members */
object Clock {
  
  @JSImport("@js-joda/core", "Clock")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixed(fixedInstant: Instant, zoneId: ZoneId): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(fixedInstant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[Clock]
  
  inline def offset(baseClock: Clock, offsetDuration: Duration): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(baseClock.asInstanceOf[js.Any], offsetDuration.asInstanceOf[js.Any])).asInstanceOf[Clock]
  
  inline def system(zone: ZoneId): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("system")(zone.asInstanceOf[js.Any]).asInstanceOf[Clock]
  
  inline def systemDefaultZone(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefaultZone")().asInstanceOf[Clock]
  
  inline def systemUTC(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemUTC")().asInstanceOf[Clock]
}
