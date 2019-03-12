package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var disableSwipeToOpen: js.UndefOr[scala.Boolean] = js.undefined
  var docked: js.UndefOr[scala.Boolean] = js.undefined
  var onRequestChange: js.UndefOr[
    js.Function2[/* opening */ scala.Boolean, /* reason */ java.lang.String, scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var openSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swipeAreaWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    containerClassName: java.lang.String = null,
    containerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    disableSwipeToOpen: js.UndefOr[scala.Boolean] = js.undefined,
    docked: js.UndefOr[scala.Boolean] = js.undefined,
    onRequestChange: (/* opening */ scala.Boolean, /* reason */ java.lang.String) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openSecondary: js.UndefOr[scala.Boolean] = js.undefined,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    swipeAreaWidth: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null,
    zDepth: scala.Int | scala.Double = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(disableSwipeToOpen)) __obj.updateDynamic("disableSwipeToOpen")(disableSwipeToOpen)
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked)
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openSecondary)) __obj.updateDynamic("openSecondary")(openSecondary)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeAreaWidth != null) __obj.updateDynamic("swipeAreaWidth")(swipeAreaWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

