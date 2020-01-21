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
    client: Int | Double = null,
    delta: Int | Double = null,
    location: Int | Double = null,
    startLocation: Int | Double = null,
    velocity: Int | Double = null
  ): TouchAxis = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (startLocation != null) __obj.updateDynamic("startLocation")(startLocation.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAxis]
  }
}

