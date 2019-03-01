package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends DivOverlayOptions {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscapeKey: js.UndefOr[scala.Boolean] = js.undefined
  var keepInView: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanPaddingBottomRight: PointExpression = null,
    autoPanPaddingTopLeft: PointExpression = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscapeKey: js.UndefOr[scala.Boolean] = js.undefined,
    keepInView: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    offset: PointExpression = null,
    pane: java.lang.String = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanPaddingBottomRight != null) __obj.updateDynamic("autoPanPaddingBottomRight")(autoPanPaddingBottomRight.asInstanceOf[js.Any])
    if (autoPanPaddingTopLeft != null) __obj.updateDynamic("autoPanPaddingTopLeft")(autoPanPaddingTopLeft.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(closeOnEscapeKey)) __obj.updateDynamic("closeOnEscapeKey")(closeOnEscapeKey)
    if (!js.isUndefined(keepInView)) __obj.updateDynamic("keepInView")(keepInView)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[PopupOptions]
  }
}

