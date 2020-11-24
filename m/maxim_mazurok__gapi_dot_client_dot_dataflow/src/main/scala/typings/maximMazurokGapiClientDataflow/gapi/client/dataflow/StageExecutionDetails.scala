package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageExecutionDetails extends js.Object {
  
  /** If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Workers that have done work on the stage. */
  var workers: js.UndefOr[js.Array[WorkerDetails]] = js.native
}
object StageExecutionDetails {
  
  @scala.inline
  def apply(): StageExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageExecutionDetails]
  }
  
  @scala.inline
  implicit class StageExecutionDetailsOps[Self <: StageExecutionDetails] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setWorkersVarargs(value: WorkerDetails*): Self = this.set("workers", js.Array(value :_*))
    
    @scala.inline
    def setWorkers(value: js.Array[WorkerDetails]): Self = this.set("workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
}
