package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAxis extends js.Object {
  var client: js.UndefOr[Double] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var startLocation: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object TouchAxis {
  @scala.inline
  def apply(
    client: js.UndefOr[Double] = js.undefined,
    delta: js.UndefOr[Double] = js.undefined,
    location: js.UndefOr[Double] = js.undefined,
    startLocation: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): TouchAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startLocation)) __obj.updateDynamic("startLocation")(startLocation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAxis]
  }
}

