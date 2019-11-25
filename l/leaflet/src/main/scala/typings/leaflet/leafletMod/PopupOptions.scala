package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends DivOverlayOptions {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoPan: js.UndefOr[Boolean] = js.undefined
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.undefined
  var keepInView: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanPaddingBottomRight: PointExpression = null,
    autoPanPaddingTopLeft: PointExpression = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscapeKey: js.UndefOr[Boolean] = js.undefined,
    keepInView: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    offset: PointExpression = null,
    pane: String = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.asInstanceOf[js.Any])
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanPaddingBottomRight != null) __obj.updateDynamic("autoPanPaddingBottomRight")(autoPanPaddingBottomRight.asInstanceOf[js.Any])
    if (autoPanPaddingTopLeft != null) __obj.updateDynamic("autoPanPaddingTopLeft")(autoPanPaddingTopLeft.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscapeKey)) __obj.updateDynamic("closeOnEscapeKey")(closeOnEscapeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInView)) __obj.updateDynamic("keepInView")(keepInView.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

