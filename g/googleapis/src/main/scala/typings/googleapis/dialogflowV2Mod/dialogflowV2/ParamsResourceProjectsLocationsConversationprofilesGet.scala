package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationprofilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the conversation profile. Format: `projects//locations//conversationProfiles/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationprofilesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationprofilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationprofilesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationprofilesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
