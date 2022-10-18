package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("js-joda", "ChronoLocalDateTime")
@js.native
open class ChronoLocalDateTime () extends Temporal {
  
  def adjustInto(temporal: Any): Any = js.native
  
  def chronology(): Chronology = js.native
  
  def toEpochSecond(offset: ZoneOffset): Double = js.native
  
  def toInstant(offset: ZoneOffset): Instant = js.native
}
