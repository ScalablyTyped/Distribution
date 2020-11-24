package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendWorkerMessagesResponse extends js.Object {
  
  /** The servers response to the worker messages. */
  var workerMessageResponses: js.UndefOr[js.Array[WorkerMessageResponse]] = js.native
}
object SendWorkerMessagesResponse {
  
  @scala.inline
  def apply(): SendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesResponse]
  }
  
  @scala.inline
  implicit class SendWorkerMessagesResponseOps[Self <: SendWorkerMessagesResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkerMessageResponsesVarargs(value: WorkerMessageResponse*): Self = this.set("workerMessageResponses", js.Array(value :_*))
    
    @scala.inline
    def setWorkerMessageResponses(value: js.Array[WorkerMessageResponse]): Self = this.set("workerMessageResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerMessageResponses: Self = this.set("workerMessageResponses", js.undefined)
  }
}
