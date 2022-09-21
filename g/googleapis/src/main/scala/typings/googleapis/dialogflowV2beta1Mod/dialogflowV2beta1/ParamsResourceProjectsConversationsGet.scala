package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the conversation. Format: `projects//locations//conversations/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationsGet {
  
  inline def apply(): ParamsResourceProjectsConversationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsConversationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
