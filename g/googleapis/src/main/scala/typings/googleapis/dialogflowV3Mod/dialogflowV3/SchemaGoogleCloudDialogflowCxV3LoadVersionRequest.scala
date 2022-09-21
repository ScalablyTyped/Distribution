package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3LoadVersionRequest extends StObject {
  
  /**
    * This field is used to prevent accidental overwrite of other agent resources, which can potentially impact other flow's behavior. If `allow_override_agent_resources` is false, conflicted agent-level resources will not be overridden (i.e. intents, entities, webhooks).
    */
  var allowOverrideAgentResources: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3LoadVersionRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3LoadVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3LoadVersionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3LoadVersionRequest](x: Self) {
    
    inline def setAllowOverrideAgentResources(value: Boolean): Self = StObject.set(x, "allowOverrideAgentResources", value.asInstanceOf[js.Any])
    
    inline def setAllowOverrideAgentResourcesNull: Self = StObject.set(x, "allowOverrideAgentResources", null)
    
    inline def setAllowOverrideAgentResourcesUndefined: Self = StObject.set(x, "allowOverrideAgentResources", js.undefined)
  }
}
