package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerDetails extends StObject {
  
  /** Work items processed by this worker, sorted by time. */
  var workItems: js.UndefOr[js.Array[WorkItemDetails]] = js.native
  
  /** Name of this worker */
  var workerName: js.UndefOr[String] = js.native
}
object WorkerDetails {
  
  @scala.inline
  def apply(): WorkerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerDetails]
  }
  
  @scala.inline
  implicit class WorkerDetailsMutableBuilder[Self <: WorkerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItemDetails]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItemDetails*): Self = StObject.set(x, "workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerNameUndefined: Self = StObject.set(x, "workerName", js.undefined)
  }
}
