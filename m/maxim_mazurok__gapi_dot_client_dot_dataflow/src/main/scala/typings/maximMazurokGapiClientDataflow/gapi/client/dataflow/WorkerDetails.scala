package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerDetails extends js.Object {
  
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
  implicit class WorkerDetailsOps[Self <: WorkerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItemDetails*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItemDetails]): Self = this.set("workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkItems: Self = this.set("workItems", js.undefined)
    
    @scala.inline
    def setWorkerName(value: String): Self = this.set("workerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerName: Self = this.set("workerName", js.undefined)
  }
}
