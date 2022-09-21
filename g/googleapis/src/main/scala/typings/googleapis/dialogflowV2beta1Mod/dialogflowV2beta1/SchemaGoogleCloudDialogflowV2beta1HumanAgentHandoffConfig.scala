package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig extends StObject {
  
  /**
    * Uses LivePerson (https://www.liveperson.com).
    */
  var livePersonConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfig] = js.undefined
  
  /**
    * Uses Salesforce Live Agent.
    */
  var salesforceLiveAgentConfig: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfig
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig](x: Self) {
    
    inline def setLivePersonConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfig): Self = StObject.set(x, "livePersonConfig", value.asInstanceOf[js.Any])
    
    inline def setLivePersonConfigUndefined: Self = StObject.set(x, "livePersonConfig", js.undefined)
    
    inline def setSalesforceLiveAgentConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfig): Self = StObject.set(x, "salesforceLiveAgentConfig", value.asInstanceOf[js.Any])
    
    inline def setSalesforceLiveAgentConfigUndefined: Self = StObject.set(x, "salesforceLiveAgentConfig", js.undefined)
  }
}
