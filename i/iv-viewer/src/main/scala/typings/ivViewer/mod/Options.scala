package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var maxZoom: js.UndefOr[Double] = js.undefined
  var refreshOnResize: js.UndefOr[Boolean] = js.undefined
  var snapView: js.UndefOr[Boolean] = js.undefined
  var zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined
  var zoomValue: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maxZoom: js.UndefOr[Double] = js.undefined,
    refreshOnResize: js.UndefOr[Boolean] = js.undefined,
    snapView: js.UndefOr[Boolean] = js.undefined,
    zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined,
    zoomValue: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnResize)) __obj.updateDynamic("refreshOnResize")(refreshOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapView)) __obj.updateDynamic("snapView")(snapView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnMouseWheel)) __obj.updateDynamic("zoomOnMouseWheel")(zoomOnMouseWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomValue)) __obj.updateDynamic("zoomValue")(zoomValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

