package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationprofilesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the conversation profile to delete. Format: `projects//locations//conversationProfiles/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationprofilesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationprofilesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationprofilesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationprofilesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
