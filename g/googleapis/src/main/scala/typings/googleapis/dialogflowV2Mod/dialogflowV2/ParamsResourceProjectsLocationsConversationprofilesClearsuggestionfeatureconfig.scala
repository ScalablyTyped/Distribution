package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Conversation Profile to add or update the suggestion feature config. Format: `projects//locations//conversationProfiles/`.
    */
  var conversationProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig](x: Self) {
    
    inline def setConversationProfile(value: String): Self = StObject.set(x, "conversationProfile", value.asInstanceOf[js.Any])
    
    inline def setConversationProfileUndefined: Self = StObject.set(x, "conversationProfile", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
