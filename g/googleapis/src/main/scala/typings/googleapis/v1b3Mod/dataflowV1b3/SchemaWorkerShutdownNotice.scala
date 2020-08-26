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
  def apply(): SchemaWorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerShutdownNotice]
  }
  @scala.inline
  implicit class SchemaWorkerShutdownNoticeOps[Self <: SchemaWorkerShutdownNotice] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

