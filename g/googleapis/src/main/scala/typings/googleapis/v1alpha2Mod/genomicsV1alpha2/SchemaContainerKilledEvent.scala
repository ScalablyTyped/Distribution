package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container is forcibly terminated by the worker.
  * Currently, this only occurs when the container outlives the timeout
  * specified by the user.
  */
@js.native
trait SchemaContainerKilledEvent extends js.Object {
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
}

object SchemaContainerKilledEvent {
  @scala.inline
  def apply(actionId: js.UndefOr[Double] = js.undefined): SchemaContainerKilledEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionId)) __obj.updateDynamic("actionId")(actionId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerKilledEvent]
  }
}

