package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationsParticipantsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the participant. Format: `projects//locations//conversations//participants/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationsParticipantsGet {
  
  inline def apply(): ParamsResourceProjectsConversationsParticipantsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationsParticipantsGet]
  }
  
  extension [Self <: ParamsResourceProjectsConversationsParticipantsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
