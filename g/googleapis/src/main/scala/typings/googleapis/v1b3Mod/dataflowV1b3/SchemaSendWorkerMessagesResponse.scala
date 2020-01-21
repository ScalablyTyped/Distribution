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
  def apply(workerMessageResponses: js.Array[SchemaWorkerMessageResponse] = null): SchemaSendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (workerMessageResponses != null) __obj.updateDynamic("workerMessageResponses")(workerMessageResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSendWorkerMessagesResponse]
  }
}

