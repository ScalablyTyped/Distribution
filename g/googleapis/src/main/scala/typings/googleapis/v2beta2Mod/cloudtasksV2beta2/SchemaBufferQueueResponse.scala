package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBufferQueueResponse extends StObject {
  
  /**
    * The name of the created task. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`. TASK_ID is randomly generated and is unique within the queue.
    */
  var task: js.UndefOr[String | Null] = js.undefined
}
object SchemaBufferQueueResponse {
  
  inline def apply(): SchemaBufferQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBufferQueueResponse]
  }
  
  extension [Self <: SchemaBufferQueueResponse](x: Self) {
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskNull: Self = StObject.set(x, "task", null)
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
