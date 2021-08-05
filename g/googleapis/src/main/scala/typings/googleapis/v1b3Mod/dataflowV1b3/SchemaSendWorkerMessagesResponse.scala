package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to the worker messages.
  */
trait SchemaSendWorkerMessagesResponse extends StObject {
  
  /**
    * The servers response to the worker messages.
    */
  var workerMessageResponses: js.UndefOr[js.Array[SchemaWorkerMessageResponse]] = js.undefined
}
object SchemaSendWorkerMessagesResponse {
  
  inline def apply(): SchemaSendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesResponse]
  }
  
  extension [Self <: SchemaSendWorkerMessagesResponse](x: Self) {
    
    inline def setWorkerMessageResponses(value: js.Array[SchemaWorkerMessageResponse]): Self = StObject.set(x, "workerMessageResponses", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessageResponsesUndefined: Self = StObject.set(x, "workerMessageResponses", js.undefined)
    
    inline def setWorkerMessageResponsesVarargs(value: SchemaWorkerMessageResponse*): Self = StObject.set(x, "workerMessageResponses", js.Array(value :_*))
  }
}
