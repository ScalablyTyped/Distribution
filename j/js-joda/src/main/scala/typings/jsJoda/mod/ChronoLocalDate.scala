package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("js-joda", "ChronoLocalDate")
@js.native
open class ChronoLocalDate () extends Temporal {
  
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
}
