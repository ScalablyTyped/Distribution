package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(location: String = null, workerMessages: js.Array[SchemaWorkerMessage] = null): SchemaSendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (workerMessages != null) __obj.updateDynamic("workerMessages")(workerMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSendWorkerMessagesRequest]
  }
}

