package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for sending worker messages to the service.
  */
@js.native
trait SchemaSendWorkerMessagesRequest extends js.Object {
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The WorkerMessages to send.
    */
  var workerMessages: js.UndefOr[js.Array[SchemaWorkerMessage]] = js.native
}
object SchemaSendWorkerMessagesRequest {
  
  @scala.inline
  def apply(): SchemaSendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesRequest]
  }
  
  @scala.inline
  implicit class SchemaSendWorkerMessagesRequestOps[Self <: SchemaSendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setWorkerMessagesVarargs(value: SchemaWorkerMessage*): Self = this.set("workerMessages", js.Array(value :_*))
    
    @scala.inline
    def setWorkerMessages(value: js.Array[SchemaWorkerMessage]): Self = this.set("workerMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerMessages: Self = this.set("workerMessages", js.undefined)
  }
}
