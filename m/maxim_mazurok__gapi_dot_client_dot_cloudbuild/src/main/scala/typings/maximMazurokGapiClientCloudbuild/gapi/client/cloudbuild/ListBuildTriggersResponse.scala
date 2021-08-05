package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildTriggersResponse extends StObject {
  
  /** Token to receive the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** `BuildTriggers` for the project, sorted by `create_time` descending. */
  var triggers: js.UndefOr[js.Array[BuildTrigger]] = js.undefined
}
object ListBuildTriggersResponse {
  
  inline def apply(): ListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildTriggersResponse]
  }
  
  extension [Self <: ListBuildTriggersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTriggers(value: js.Array[BuildTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: BuildTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
