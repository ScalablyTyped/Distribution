package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ImportConversationDataRequest extends StObject {
  
  /**
    * Required. Configuration describing where to import data from.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2InputConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ImportConversationDataRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ImportConversationDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ImportConversationDataRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ImportConversationDataRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaGoogleCloudDialogflowV2InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
