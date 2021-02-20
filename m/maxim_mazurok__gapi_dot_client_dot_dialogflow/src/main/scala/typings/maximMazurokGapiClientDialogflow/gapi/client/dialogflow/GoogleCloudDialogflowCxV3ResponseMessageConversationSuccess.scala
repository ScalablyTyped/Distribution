package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess extends StObject {
  
  /** Custom metadata. Dialogflow doesn't impose any structure on this. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessMutableBuilder[Self <: GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3ResponseMessageConversationSuccess with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
