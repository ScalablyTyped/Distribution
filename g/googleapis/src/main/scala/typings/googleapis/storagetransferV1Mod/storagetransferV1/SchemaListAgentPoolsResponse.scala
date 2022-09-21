package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAgentPoolsResponse extends StObject {
  
  /**
    * A list of agent pools.
    */
  var agentPools: js.UndefOr[js.Array[SchemaAgentPool]] = js.undefined
  
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAgentPoolsResponse {
  
  inline def apply(): SchemaListAgentPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAgentPoolsResponse]
  }
  
  extension [Self <: SchemaListAgentPoolsResponse](x: Self) {
    
    inline def setAgentPools(value: js.Array[SchemaAgentPool]): Self = StObject.set(x, "agentPools", value.asInstanceOf[js.Any])
    
    inline def setAgentPoolsUndefined: Self = StObject.set(x, "agentPools", js.undefined)
    
    inline def setAgentPoolsVarargs(value: SchemaAgentPool*): Self = StObject.set(x, "agentPools", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
