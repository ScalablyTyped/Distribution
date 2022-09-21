package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentpoolsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
    */
  var agentPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud project that owns the agent pool.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAgentPool] = js.undefined
}
object ParamsResourceProjectsAgentpoolsCreate {
  
  inline def apply(): ParamsResourceProjectsAgentpoolsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentpoolsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsAgentpoolsCreate](x: Self) {
    
    inline def setAgentPoolId(value: String): Self = StObject.set(x, "agentPoolId", value.asInstanceOf[js.Any])
    
    inline def setAgentPoolIdUndefined: Self = StObject.set(x, "agentPoolId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaAgentPool): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
