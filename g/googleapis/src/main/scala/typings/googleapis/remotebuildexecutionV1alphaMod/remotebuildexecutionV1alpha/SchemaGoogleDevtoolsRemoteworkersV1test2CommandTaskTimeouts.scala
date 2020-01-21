package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the timeouts associated with this task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts extends js.Object {
  /**
    * This specifies the maximum time that the task can run, excluding the time
    * required to download inputs or upload outputs. That is, the worker will
    * terminate the task if it runs longer than this.
    */
  var execution: js.UndefOr[String] = js.native
  /**
    * This specifies the maximum amount of time the task can be idle - that is,
    * go without generating some output in either stdout or stderr. If the
    * process is silent for more than the specified time, the worker will
    * terminate the task.
    */
  var idle: js.UndefOr[String] = js.native
  /**
    * If the execution or IO timeouts are exceeded, the worker will try to
    * gracefully terminate the task and return any existing logs. However,
    * tasks may be hard-frozen in which case this process will fail. This
    * timeout specifies how long to wait for a terminated task to shut down
    * gracefully (e.g. via SIGTERM) before we bring down the hammer (e.g.
    * SIGKILL on *nix, CTRL_BREAK_EVENT on Windows).
    */
  var shutdown: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts {
  @scala.inline
  def apply(execution: String = null, idle: String = null, shutdown: String = null): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts = {
    val __obj = js.Dynamic.literal()
    if (execution != null) __obj.updateDynamic("execution")(execution.asInstanceOf[js.Any])
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (shutdown != null) __obj.updateDynamic("shutdown")(shutdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts]
  }
}

