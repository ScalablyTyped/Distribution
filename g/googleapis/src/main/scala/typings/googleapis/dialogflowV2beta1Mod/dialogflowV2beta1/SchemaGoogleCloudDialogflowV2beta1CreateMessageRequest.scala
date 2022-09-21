package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest extends StObject {
  
  /**
    * Required. The message to create. Message.participant is required.
    */
  var message: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Message] = js.undefined
  
  /**
    * Required. Resource identifier of the conversation to create message. Format: `projects//locations//conversations/`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest](x: Self) {
    
    inline def setMessage(value: SchemaGoogleCloudDialogflowV2beta1Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
