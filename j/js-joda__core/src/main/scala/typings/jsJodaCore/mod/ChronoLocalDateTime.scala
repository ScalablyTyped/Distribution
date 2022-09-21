package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "ChronoLocalDateTime")
@js.native
abstract class ChronoLocalDateTime () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def chronology(): Chronology = js.native
  
  def toEpochSecond(offset: ZoneOffset): Double = js.native
  
  def toInstant(offset: ZoneOffset): Instant = js.native
}
