package typings.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container exits.
  */
@js.native
trait SchemaContainerStoppedEvent extends js.Object {
  /**
    * The numeric ID of the action that started this container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
  /**
    * The tail end of any content written to standard error by the container.
    * If the content emits large amounts of debugging noise or contains
    * sensitive information, you can prevent the content from being printed by
    * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.  Note that only a
    * small amount of the end of the stream is captured here. The entire stream
    * is stored in the `/google/logs` directory mounted into each action, and
    * can be copied off the machine as described elsewhere.
    */
  var stderr: js.UndefOr[String] = js.native
}

object SchemaContainerStoppedEvent {
  @scala.inline
  def apply(
    actionId: js.UndefOr[Double] = js.undefined,
    exitStatus: js.UndefOr[Double] = js.undefined,
    stderr: String = null
  ): SchemaContainerStoppedEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionId)) __obj.updateDynamic("actionId")(actionId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exitStatus)) __obj.updateDynamic("exitStatus")(exitStatus.get.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerStoppedEvent]
  }
}

