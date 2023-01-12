package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3LoadVersionRequest extends StObject {
  
  /**
    * This field is used to prevent accidental overwrite of other agent resources, which can potentially impact other flow's behavior. If `allow_override_agent_resources` is false,
    * conflicted agent-level resources will not be overridden (i.e. intents, entities, webhooks).
    */
  var allowOverrideAgentResources: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3LoadVersionRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3LoadVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3LoadVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3LoadVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowOverrideAgentResources(value: Boolean): Self = StObject.set(x, "allowOverrideAgentResources", value.asInstanceOf[js.Any])
    
    inline def setAllowOverrideAgentResourcesUndefined: Self = StObject.set(x, "allowOverrideAgentResources", js.undefined)
  }
}
