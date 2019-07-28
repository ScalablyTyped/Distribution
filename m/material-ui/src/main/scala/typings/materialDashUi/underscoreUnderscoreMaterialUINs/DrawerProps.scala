package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined
  var docked: js.UndefOr[Boolean] = js.undefined
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var openSecondary: js.UndefOr[Boolean] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swipeAreaWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    className: String = null,
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    docked: js.UndefOr[Boolean] = js.undefined,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openSecondary: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    style: CSSProperties = null,
    swipeAreaWidth: Int | Double = null,
    width: Double | String = null,
    zDepth: Int | Double = null
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

