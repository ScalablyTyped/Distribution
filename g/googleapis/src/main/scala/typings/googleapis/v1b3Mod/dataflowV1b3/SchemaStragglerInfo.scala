package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStragglerInfo extends StObject {
  
  /**
    * The straggler causes, keyed by the string representation of the StragglerCause enum and contains specialized debugging information for each straggler cause.
    */
  var causes: js.UndefOr[StringDictionary[SchemaStragglerDebuggingInfo] | Null] = js.undefined
  
  /**
    * The time when the work item attempt became a straggler.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaStragglerInfo {
  
  inline def apply(): SchemaStragglerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStragglerInfo]
  }
  
  extension [Self <: SchemaStragglerInfo](x: Self) {
    
    inline def setCauses(value: StringDictionary[SchemaStragglerDebuggingInfo]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesNull: Self = StObject.set(x, "causes", null)
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
