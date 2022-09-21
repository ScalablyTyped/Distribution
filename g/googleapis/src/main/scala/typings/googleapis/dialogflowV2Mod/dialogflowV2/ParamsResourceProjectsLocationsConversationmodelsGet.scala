package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationmodelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model to retrieve. Format: `projects//conversationModels/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationmodelsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationmodelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationmodelsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationmodelsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
