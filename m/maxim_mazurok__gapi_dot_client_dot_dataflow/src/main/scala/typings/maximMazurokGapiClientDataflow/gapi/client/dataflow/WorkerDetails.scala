package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerDetails extends StObject {
  
  /** Work items processed by this worker, sorted by time. */
  var workItems: js.UndefOr[js.Array[WorkItemDetails]] = js.undefined
  
  /** Name of this worker */
  var workerName: js.UndefOr[String] = js.undefined
}
object WorkerDetails {
  
  inline def apply(): WorkerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerDetails]
  }
  
  extension [Self <: WorkerDetails](x: Self) {
    
    inline def setWorkItems(value: js.Array[WorkItemDetails]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    inline def setWorkItemsVarargs(value: WorkItemDetails*): Self = StObject.set(x, "workItems", js.Array(value :_*))
    
    inline def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    inline def setWorkerNameUndefined: Self = StObject.set(x, "workerName", js.undefined)
  }
}
