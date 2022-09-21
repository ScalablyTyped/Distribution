package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse extends StObject {
  
  /**
    * The conversations that match the request.
    */
  var conversations: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1Conversation]] = js.undefined
  
  /**
    * A token which can be sent as `page_token` to retrieve the next page. If this field is set, it means there is another page available. If it is not set, it means no other pages are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse](x: Self) {
    
    inline def setConversations(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1Conversation]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    inline def setConversationsUndefined: Self = StObject.set(x, "conversations", js.undefined)
    
    inline def setConversationsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1Conversation*): Self = StObject.set(x, "conversations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
