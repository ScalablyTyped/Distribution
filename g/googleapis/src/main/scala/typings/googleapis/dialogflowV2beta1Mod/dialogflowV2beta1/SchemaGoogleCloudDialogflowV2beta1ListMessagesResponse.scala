package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse extends StObject {
  
  /**
    * Required. The list of messages. There will be a maximum number of items returned based on the page_size field in the request. `messages` is sorted by `create_time` in descending order.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Message]] = js.undefined
  
  /**
    * Optional. Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse](x: Self) {
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowV2beta1Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
