package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesRequest extends StObject {
  
  /**
    * Required. A maximum of 1000 Messages can be created in a batch. CreateMessageRequest.message.send_time is required. All created messages will have identical Message.create_time.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleCloudDialogflowV2beta1CreateMessageRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
