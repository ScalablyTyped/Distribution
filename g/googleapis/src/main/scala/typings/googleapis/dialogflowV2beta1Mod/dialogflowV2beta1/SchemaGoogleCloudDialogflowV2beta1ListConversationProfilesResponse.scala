package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse extends StObject {
  
  /**
    * The list of project conversation profiles. There is a maximum number of items returned based on the page_size field in the request.
    */
  var conversationProfiles: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse](x: Self) {
    
    inline def setConversationProfiles(value: js.Array[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]): Self = StObject.set(x, "conversationProfiles", value.asInstanceOf[js.Any])
    
    inline def setConversationProfilesUndefined: Self = StObject.set(x, "conversationProfiles", js.undefined)
    
    inline def setConversationProfilesVarargs(value: SchemaGoogleCloudDialogflowV2beta1ConversationProfile*): Self = StObject.set(x, "conversationProfiles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
