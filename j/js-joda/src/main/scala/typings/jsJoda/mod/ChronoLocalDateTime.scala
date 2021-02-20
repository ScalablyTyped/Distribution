package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ChronoLocalDateTime")
@js.native
abstract class ChronoLocalDateTime () extends Temporal {
  
  def adjustInto(temporal: js.Any): js.Any = js.native
  
  def chronology(): Chronology = js.native
  
  def toEpochSecond(offset: ZoneOffset): Double = js.native
  
  def toInstant(offset: ZoneOffset): Instant = js.native
}
