package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the execution of a container results in a non-zero
  * exit status that was not otherwise ignored. Execution will continue, but
  * only actions that are flagged as `ALWAYS_RUN` will be executed. Other
  * actions will be skipped.
  */
@js.native
trait SchemaUnexpectedExitStatusEvent extends js.Object {
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
}

object SchemaUnexpectedExitStatusEvent {
  @scala.inline
  def apply(actionId: Int | Double = null, exitStatus: Int | Double = null): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    if (exitStatus != null) __obj.updateDynamic("exitStatus")(exitStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
}

