package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUserProcessesResponse extends StObject {
  
  /**
    * Token for the next page of results. If empty, there are no more pages remaining.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeProcess]] = js.undefined
}
object SchemaListUserProcessesResponse {
  
  inline def apply(): SchemaListUserProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserProcessesResponse]
  }
  
  extension [Self <: SchemaListUserProcessesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProcesses(value: js.Array[SchemaGoogleAppsScriptTypeProcess]): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    inline def setProcessesUndefined: Self = StObject.set(x, "processes", js.undefined)
    
    inline def setProcessesVarargs(value: SchemaGoogleAppsScriptTypeProcess*): Self = StObject.set(x, "processes", js.Array(value*))
  }
}
