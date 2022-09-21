package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStragglerSummary extends StObject {
  
  /**
    * Aggregated counts of straggler causes, keyed by the string representation of the StragglerCause enum.
    */
  var stragglerCauseCount: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The total count of stragglers.
    */
  var totalStragglerCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaStragglerSummary {
  
  inline def apply(): SchemaStragglerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStragglerSummary]
  }
  
  extension [Self <: SchemaStragglerSummary](x: Self) {
    
    inline def setStragglerCauseCount(value: StringDictionary[String]): Self = StObject.set(x, "stragglerCauseCount", value.asInstanceOf[js.Any])
    
    inline def setStragglerCauseCountNull: Self = StObject.set(x, "stragglerCauseCount", null)
    
    inline def setStragglerCauseCountUndefined: Self = StObject.set(x, "stragglerCauseCount", js.undefined)
    
    inline def setTotalStragglerCount(value: String): Self = StObject.set(x, "totalStragglerCount", value.asInstanceOf[js.Any])
    
    inline def setTotalStragglerCountNull: Self = StObject.set(x, "totalStragglerCount", null)
    
    inline def setTotalStragglerCountUndefined: Self = StObject.set(x, "totalStragglerCount", js.undefined)
  }
}
