package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationmodelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model to delete. Format: `projects//conversationModels/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationmodelsDelete {
  
  inline def apply(): ParamsResourceProjectsConversationmodelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationmodelsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsConversationmodelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
