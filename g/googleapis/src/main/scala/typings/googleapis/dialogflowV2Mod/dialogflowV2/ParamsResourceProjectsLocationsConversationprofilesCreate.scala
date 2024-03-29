package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationprofilesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project to create a conversation profile for. Format: `projects//locations/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.undefined
}
object ParamsResourceProjectsLocationsConversationprofilesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationprofilesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationprofilesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationprofilesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2ConversationProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
