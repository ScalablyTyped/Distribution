package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SearchAgentsResponse extends StObject {
  
  /**
    * The list of agents. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var agents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Agent]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SearchAgentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SearchAgentsResponse](x: Self) {
    
    inline def setAgents(value: js.Array[SchemaGoogleCloudDialogflowV2Agent]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    inline def setAgentsVarargs(value: SchemaGoogleCloudDialogflowV2Agent*): Self = StObject.set(x, "agents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
