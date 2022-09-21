package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationmodelsEvaluationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model evaluation resource name. Format: `projects//conversationModels//evaluations/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationmodelsEvaluationsGet {
  
  inline def apply(): ParamsResourceProjectsConversationmodelsEvaluationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationmodelsEvaluationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsConversationmodelsEvaluationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
