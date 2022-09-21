package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig extends StObject {
  
  /**
    * Required. Live Agent chat button ID.
    */
  var buttonId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Live Agent deployment ID.
    */
  var deploymentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
    */
  var endpointDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The organization ID of the Salesforce account.
    */
  var organizationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfig](x: Self) {
    
    inline def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
    
    inline def setButtonIdNull: Self = StObject.set(x, "buttonId", null)
    
    inline def setButtonIdUndefined: Self = StObject.set(x, "buttonId", js.undefined)
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdNull: Self = StObject.set(x, "deploymentId", null)
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setEndpointDomain(value: String): Self = StObject.set(x, "endpointDomain", value.asInstanceOf[js.Any])
    
    inline def setEndpointDomainNull: Self = StObject.set(x, "endpointDomain", null)
    
    inline def setEndpointDomainUndefined: Self = StObject.set(x, "endpointDomain", js.undefined)
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdNull: Self = StObject.set(x, "organizationId", null)
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
