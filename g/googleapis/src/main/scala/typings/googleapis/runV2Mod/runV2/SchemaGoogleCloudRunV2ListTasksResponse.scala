package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ListTasksResponse extends StObject {
  
  /**
    * A token indicating there are more items than page_size. Use it in the next ListTasks request to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting list of Tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Task]] = js.undefined
}
object SchemaGoogleCloudRunV2ListTasksResponse {
  
  inline def apply(): SchemaGoogleCloudRunV2ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ListTasksResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ListTasksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTasks(value: js.Array[SchemaGoogleCloudRunV2Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: SchemaGoogleCloudRunV2Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
