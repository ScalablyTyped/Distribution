package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easeLinearity: js.UndefOr[Double] = js.undefined
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easeLinearity: js.UndefOr[Double] = js.undefined,
    noMoveStart: js.UndefOr[Boolean] = js.undefined
  ): PanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easeLinearity)) __obj.updateDynamic("easeLinearity")(easeLinearity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

