package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse extends StObject {
  
  /**
    * Messages created.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Message]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse](x: Self) {
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowV2beta1Message*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
