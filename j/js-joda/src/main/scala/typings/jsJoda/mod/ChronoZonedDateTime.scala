package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("js-joda", "ChronoZonedDateTime")
@js.native
open class ChronoZonedDateTime () extends Temporal {
  
  def compareTo(other: ChronoZonedDateTime): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def isAfter(other: ChronoZonedDateTime): Boolean = js.native
  
  def isBefore(other: ChronoZonedDateTime): Boolean = js.native
  
  def isEqual(other: ChronoZonedDateTime): Boolean = js.native
  
  def query(query: Any): Any = js.native
  
  def toEpochSecond(): Double = js.native
  
  def toInstant(): Instant = js.native
}
