package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff extends StObject {
  
  /**
    * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff](x: Self) {
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
