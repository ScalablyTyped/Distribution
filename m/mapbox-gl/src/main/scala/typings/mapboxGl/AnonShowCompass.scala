package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowCompass extends js.Object {
  var showCompass: js.UndefOr[Boolean] = js.undefined
  var showZoom: js.UndefOr[Boolean] = js.undefined
  var visualizePitch: js.UndefOr[Boolean] = js.undefined
}

object AnonShowCompass {
  @scala.inline
  def apply(
    showCompass: js.UndefOr[Boolean] = js.undefined,
    showZoom: js.UndefOr[Boolean] = js.undefined,
    visualizePitch: js.UndefOr[Boolean] = js.undefined
  ): AnonShowCompass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(visualizePitch)) __obj.updateDynamic("visualizePitch")(visualizePitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowCompass]
  }
}

