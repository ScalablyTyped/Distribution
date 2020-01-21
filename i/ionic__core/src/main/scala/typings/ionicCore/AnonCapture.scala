package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
}

object AnonCapture {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined, passive: js.UndefOr[Boolean] = js.undefined): AnonCapture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapture]
  }
}

