package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Agents.ExportAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest extends StObject {
  
  /**
    * Optional. The [Google Cloud
    * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
    * to. The format of this URI must be
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left unspecified, the
    * serialized agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ExportAgentRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
