package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to the worker messages.
  */
@js.native
trait SchemaSendWorkerMessagesResponse extends js.Object {
  /**
    * The servers response to the worker messages.
    */
  var workerMessageResponses: js.UndefOr[js.Array[SchemaWorkerMessageResponse]] = js.native
}

object SchemaSendWorkerMessagesResponse {
  @scala.inline
  def apply(): SchemaSendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesResponse]
  }
  @scala.inline
  implicit class SchemaSendWorkerMessagesResponseOps[Self <: SchemaSendWorkerMessagesResponse] (val x: Self) extends AnyVal {
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
    def setWorkerMessageResponsesVarargs(value: SchemaWorkerMessageResponse*): Self = this.set("workerMessageResponses", js.Array(value :_*))
    @scala.inline
    def setWorkerMessageResponses(value: js.Array[SchemaWorkerMessageResponse]): Self = this.set("workerMessageResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMessageResponses: Self = this.set("workerMessageResponses", js.undefined)
  }
  
}

