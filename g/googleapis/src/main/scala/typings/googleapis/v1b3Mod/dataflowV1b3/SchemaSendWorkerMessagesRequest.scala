package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for sending worker messages to the service.
  */
trait SchemaSendWorkerMessagesRequest extends StObject {
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The WorkerMessages to send.
    */
  var workerMessages: js.UndefOr[js.Array[SchemaWorkerMessage]] = js.undefined
}
object SchemaSendWorkerMessagesRequest {
  
  inline def apply(): SchemaSendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesRequest]
  }
  
  extension [Self <: SchemaSendWorkerMessagesRequest](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setWorkerMessages(value: js.Array[SchemaWorkerMessage]): Self = StObject.set(x, "workerMessages", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessagesUndefined: Self = StObject.set(x, "workerMessages", js.undefined)
    
    inline def setWorkerMessagesVarargs(value: SchemaWorkerMessage*): Self = StObject.set(x, "workerMessages", js.Array(value :_*))
  }
}
