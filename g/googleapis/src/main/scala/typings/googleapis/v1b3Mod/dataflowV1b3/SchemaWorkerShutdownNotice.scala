package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shutdown notification from workers. This is to be sent by the shutdown
  * script of the worker VM so that the backend knows that the VM is being shut
  * down.
  */
@js.native
trait SchemaWorkerShutdownNotice extends js.Object {
  /**
    * The reason for the worker shutdown. Current possible values are:
    * &quot;UNKNOWN&quot;: shutdown reason is unknown. &quot;PREEMPTION&quot;:
    * shutdown reason is preemption. Other possible reasons may be added in the
    * future.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaWorkerShutdownNotice {
  @scala.inline
  def apply(reason: String = null): SchemaWorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerShutdownNotice]
  }
}

