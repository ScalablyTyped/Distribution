package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystraceSetup extends StObject {
  
  /**
    * Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace.
    */
  var durationSeconds: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSystraceSetup {
  
  inline def apply(): SchemaSystraceSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystraceSetup]
  }
  
  extension [Self <: SchemaSystraceSetup](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsNull: Self = StObject.set(x, "durationSeconds", null)
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
  }
}
