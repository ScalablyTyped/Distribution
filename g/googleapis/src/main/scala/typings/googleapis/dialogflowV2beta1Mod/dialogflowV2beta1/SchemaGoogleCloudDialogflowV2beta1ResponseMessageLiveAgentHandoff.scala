package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff extends StObject {
  
  /**
    * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff](x: Self) {
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
