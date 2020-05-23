package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowCompass extends js.Object {
  var showCompass: js.UndefOr[Boolean] = js.undefined
  var showZoom: js.UndefOr[Boolean] = js.undefined
  var visualizePitch: js.UndefOr[Boolean] = js.undefined
}

object ShowCompass {
  @scala.inline
  def apply(
    showCompass: js.UndefOr[Boolean] = js.undefined,
    showZoom: js.UndefOr[Boolean] = js.undefined,
    visualizePitch: js.UndefOr[Boolean] = js.undefined
  ): ShowCompass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visualizePitch)) __obj.updateDynamic("visualizePitch")(visualizePitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowCompass]
  }
}

