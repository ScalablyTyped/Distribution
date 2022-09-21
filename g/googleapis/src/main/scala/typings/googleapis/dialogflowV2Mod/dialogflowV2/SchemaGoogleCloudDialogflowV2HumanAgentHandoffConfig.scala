package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfig extends StObject {
  
  /**
    * Uses LivePerson (https://www.liveperson.com).
    */
  var livePersonConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig] = js.undefined
  
  /**
    * Uses Salesforce Live Agent.
    */
  var salesforceLiveAgentConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfig](x: Self) {
    
    inline def setLivePersonConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig): Self = StObject.set(x, "livePersonConfig", value.asInstanceOf[js.Any])
    
    inline def setLivePersonConfigUndefined: Self = StObject.set(x, "livePersonConfig", js.undefined)
    
    inline def setSalesforceLiveAgentConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig): Self = StObject.set(x, "salesforceLiveAgentConfig", value.asInstanceOf[js.Any])
    
    inline def setSalesforceLiveAgentConfigUndefined: Self = StObject.set(x, "salesforceLiveAgentConfig", js.undefined)
  }
}
