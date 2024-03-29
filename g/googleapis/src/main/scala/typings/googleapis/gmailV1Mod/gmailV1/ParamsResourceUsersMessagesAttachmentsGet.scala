package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersMessagesAttachmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the attachment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the message containing the attachment.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value `me` can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersMessagesAttachmentsGet {
  
  inline def apply(): ParamsResourceUsersMessagesAttachmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesAttachmentsGet]
  }
  
  extension [Self <: ParamsResourceUsersMessagesAttachmentsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
