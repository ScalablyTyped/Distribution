package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

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
  def apply(actionId: js.UndefOr[Double] = js.undefined, exitStatus: js.UndefOr[Double] = js.undefined): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionId)) __obj.updateDynamic("actionId")(actionId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exitStatus)) __obj.updateDynamic("exitStatus")(exitStatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
}

