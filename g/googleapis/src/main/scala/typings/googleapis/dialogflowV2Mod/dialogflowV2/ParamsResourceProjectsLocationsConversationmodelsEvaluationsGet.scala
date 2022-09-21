package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationmodelsEvaluationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model evaluation resource name. Format: `projects//conversationModels//evaluations/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationmodelsEvaluationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationmodelsEvaluationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationmodelsEvaluationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationmodelsEvaluationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
