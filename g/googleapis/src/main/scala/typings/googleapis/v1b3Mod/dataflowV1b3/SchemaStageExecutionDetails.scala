package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStageExecutionDetails extends StObject {
  
  /**
    * If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Workers that have done work on the stage.
    */
  var workers: js.UndefOr[js.Array[SchemaWorkerDetails]] = js.undefined
}
object SchemaStageExecutionDetails {
  
  inline def apply(): SchemaStageExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStageExecutionDetails]
  }
  
  extension [Self <: SchemaStageExecutionDetails](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkers(value: js.Array[SchemaWorkerDetails]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    inline def setWorkersVarargs(value: SchemaWorkerDetails*): Self = StObject.set(x, "workers", js.Array(value*))
  }
}
