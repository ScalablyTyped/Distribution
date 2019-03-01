package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAxis extends js.Object {
  var client: js.UndefOr[scala.Double] = js.undefined
  var delta: js.UndefOr[scala.Double] = js.undefined
  var location: js.UndefOr[scala.Double] = js.undefined
  var startLocation: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

object TouchAxis {
  @scala.inline
  def apply(
    client: scala.Int | scala.Double = null,
    delta: scala.Int | scala.Double = null,
    location: scala.Int | scala.Double = null,
    startLocation: scala.Int | scala.Double = null,
    velocity: scala.Int | scala.Double = null
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

