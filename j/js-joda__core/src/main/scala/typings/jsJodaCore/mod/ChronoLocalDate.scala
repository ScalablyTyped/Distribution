package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "ChronoLocalDate")
@js.native
abstract class ChronoLocalDate () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
}
