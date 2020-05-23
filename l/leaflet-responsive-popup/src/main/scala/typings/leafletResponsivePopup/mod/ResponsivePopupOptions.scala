package typings.leafletResponsivePopup.mod

import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.PopupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsivePopupOptions extends PopupOptions {
  var hasTip: js.UndefOr[Boolean] = js.undefined
}

object ResponsivePopupOptions {
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
    hasTip: js.UndefOr[Boolean] = js.undefined,
    keepInView: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    offset: PointExpression = null,
    pane: String = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): ResponsivePopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.get.asInstanceOf[js.Any])
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanPaddingBottomRight != null) __obj.updateDynamic("autoPanPaddingBottomRight")(autoPanPaddingBottomRight.asInstanceOf[js.Any])
    if (autoPanPaddingTopLeft != null) __obj.updateDynamic("autoPanPaddingTopLeft")(autoPanPaddingTopLeft.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscapeKey)) __obj.updateDynamic("closeOnEscapeKey")(closeOnEscapeKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTip)) __obj.updateDynamic("hasTip")(hasTip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInView)) __obj.updateDynamic("keepInView")(keepInView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsivePopupOptions]
  }
}

