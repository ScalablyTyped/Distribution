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
    maxZoom: Int | Double = null,
    refreshOnResize: js.UndefOr[Boolean] = js.undefined,
    snapView: js.UndefOr[Boolean] = js.undefined,
    zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined,
    zoomValue: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnResize)) __obj.updateDynamic("refreshOnResize")(refreshOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(snapView)) __obj.updateDynamic("snapView")(snapView.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnMouseWheel)) __obj.updateDynamic("zoomOnMouseWheel")(zoomOnMouseWheel.asInstanceOf[js.Any])
    if (zoomValue != null) __obj.updateDynamic("zoomValue")(zoomValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

