package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListConversationsResponse extends StObject {
  
  /**
    * The list of conversations. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var conversations: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Conversation]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListConversationsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListConversationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListConversationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListConversationsResponse](x: Self) {
    
    inline def setConversations(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Conversation]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    inline def setConversationsUndefined: Self = StObject.set(x, "conversations", js.undefined)
    
    inline def setConversationsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Conversation*): Self = StObject.set(x, "conversations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
