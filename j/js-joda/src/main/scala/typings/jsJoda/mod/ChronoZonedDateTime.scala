package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ChronoZonedDateTime")
@js.native
abstract class ChronoZonedDateTime () extends Temporal {
  
  def compareTo(other: ChronoZonedDateTime): Double = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def isAfter(other: ChronoZonedDateTime): Boolean = js.native
  
  def isBefore(other: ChronoZonedDateTime): Boolean = js.native
  
  def isEqual(other: ChronoZonedDateTime): Boolean = js.native
  
  def query(query: js.Any): js.Any = js.native
  
  def toEpochSecond(): Double = js.native
  
  def toInstant(): Instant = js.native
}
