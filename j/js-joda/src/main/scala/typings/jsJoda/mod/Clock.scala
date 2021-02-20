package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Clock")
@js.native
abstract class Clock () extends StObject {
  
  def instant(): Instant = js.native
  
  def millis(): Double = js.native
  
  def zone(): js.Any = js.native
}
object Clock {
  
  /* static member */
  @JSImport("js-joda", "Clock.fixed")
  @js.native
  def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = js.native
  
  /* static member */
  @JSImport("js-joda", "Clock.system")
  @js.native
  def system(zone: ZoneId): Clock = js.native
  
  /* static member */
  @JSImport("js-joda", "Clock.systemDefaultZone")
  @js.native
  def systemDefaultZone(): Clock = js.native
  
  /* static member */
  @JSImport("js-joda", "Clock.systemUTC")
  @js.native
  def systemUTC(): Clock = js.native
}
