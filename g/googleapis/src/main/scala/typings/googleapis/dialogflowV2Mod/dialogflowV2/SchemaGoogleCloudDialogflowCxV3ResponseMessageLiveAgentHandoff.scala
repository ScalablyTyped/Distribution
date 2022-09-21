package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff extends StObject {
  
  /**
    * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff](x: Self) {
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
