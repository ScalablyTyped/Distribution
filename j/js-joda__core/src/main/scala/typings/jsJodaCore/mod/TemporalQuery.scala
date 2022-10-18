package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "TemporalQuery")
@js.native
open class TemporalQuery[R] () extends StObject {
  
  def queryFrom(temporal: TemporalAccessor): R = js.native
}
