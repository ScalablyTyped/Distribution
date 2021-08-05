package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Clock")
@js.native
abstract class Clock () extends StObject {
  
  def instant(): Instant = js.native
  
  def millis(): Double = js.native
  
  def zone(): js.Any = js.native
}
object Clock {
  
  @JSImport("js-joda", "Clock")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(fixedInstant.asInstanceOf[js.Any], zoneOffset.asInstanceOf[js.Any])).asInstanceOf[Clock]
  
  /* static member */
  inline def system(zone: ZoneId): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("system")(zone.asInstanceOf[js.Any]).asInstanceOf[Clock]
  
  /* static member */
  inline def systemDefaultZone(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefaultZone")().asInstanceOf[Clock]
  
  /* static member */
  inline def systemUTC(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemUTC")().asInstanceOf[Clock]
}
