package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentIntentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the intent to delete. If this intent has direct or indirect followup intents, we also delete them. Format: `projects//agent/intents/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentIntentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentIntentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentIntentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentIntentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
