package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * A unique ID for the new conversation. This ID will become the final component of the conversation's resource name. If no ID is specified, a server-generated ID will be used. This value should be 4-64 characters and must match the regular expression `^[a-z0-9-]{4,64\}$`. Valid characters are `a-z-`
    */
  var conversationId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the conversation.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsCreate](x: Self) {
    
    inline def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudContactcenterinsightsV1Conversation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
