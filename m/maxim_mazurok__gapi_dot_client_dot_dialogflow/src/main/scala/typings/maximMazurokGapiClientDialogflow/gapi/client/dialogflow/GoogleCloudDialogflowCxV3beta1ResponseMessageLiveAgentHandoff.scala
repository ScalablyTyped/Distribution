package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff extends StObject {
  
  /** Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff](x: Self) {
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
