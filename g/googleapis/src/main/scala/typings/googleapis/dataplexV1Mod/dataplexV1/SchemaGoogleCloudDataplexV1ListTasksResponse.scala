package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListTasksResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tasks under the given parent lake.
    */
  var tasks: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Task]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachableLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListTasksResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListTasksResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListTasksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTasks(value: js.Array[SchemaGoogleCloudDataplexV1Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: SchemaGoogleCloudDataplexV1Task*): Self = StObject.set(x, "tasks", js.Array(value*))
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsNull: Self = StObject.set(x, "unreachableLocations", null)
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
