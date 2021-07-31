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
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
