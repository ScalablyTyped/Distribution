package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2DeleteConversationModelOperationMetadata extends StObject {
  
  /**
    * The resource name of the conversation model. Format: `projects//conversationModels/`
    */
  var conversationModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when delete conversation model request was created. The time is measured on server side.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2DeleteConversationModelOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2DeleteConversationModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2DeleteConversationModelOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2DeleteConversationModelOperationMetadata](x: Self) {
    
    inline def setConversationModel(value: String): Self = StObject.set(x, "conversationModel", value.asInstanceOf[js.Any])
    
    inline def setConversationModelNull: Self = StObject.set(x, "conversationModel", null)
    
    inline def setConversationModelUndefined: Self = StObject.set(x, "conversationModel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
