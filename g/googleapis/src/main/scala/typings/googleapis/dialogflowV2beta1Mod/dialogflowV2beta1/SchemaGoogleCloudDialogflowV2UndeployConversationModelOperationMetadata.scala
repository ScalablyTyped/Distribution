package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2UndeployConversationModelOperationMetadata extends StObject {
  
  /**
    * The resource name of the conversation model. Format: `projects//conversationModels/`
    */
  var conversationModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when the request to undeploy conversation model was submitted. The time is measured on server side.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2UndeployConversationModelOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2UndeployConversationModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2UndeployConversationModelOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2UndeployConversationModelOperationMetadata](x: Self) {
    
    inline def setConversationModel(value: String): Self = StObject.set(x, "conversationModel", value.asInstanceOf[js.Any])
    
    inline def setConversationModelNull: Self = StObject.set(x, "conversationModel", null)
    
    inline def setConversationModelUndefined: Self = StObject.set(x, "conversationModel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
