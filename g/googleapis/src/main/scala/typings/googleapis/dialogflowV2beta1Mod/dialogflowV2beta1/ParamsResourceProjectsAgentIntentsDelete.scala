package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentIntentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the intent to delete. If this intent has direct or indirect followup intents, we also delete them. Supported formats: - `projects//agent/intents/` - `projects//locations//agent/intents/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentIntentsDelete {
  
  inline def apply(): ParamsResourceProjectsAgentIntentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentIntentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAgentIntentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
