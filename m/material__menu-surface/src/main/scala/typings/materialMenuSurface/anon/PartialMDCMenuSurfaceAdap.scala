package typings.materialMenuSurface.anon

import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
trait PartialMDCMenuSurfaceAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var getAnchorDimensions: js.UndefOr[js.Function0[ClientRect | Null]] = js.undefined
  var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.undefined
  var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.undefined
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isRtl: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var saveFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.undefined
  var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.undefined
  var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.undefined
}

object PartialMDCMenuSurfaceAdap {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    getAnchorDimensions: () => ClientRect | Null = null,
    getBodyDimensions: () => MDCMenuDimensions = null,
    getInnerDimensions: () => MDCMenuDimensions = null,
    getWindowDimensions: () => MDCMenuDimensions = null,
    getWindowScroll: () => MDCMenuPoint = null,
    hasAnchor: () => Boolean = null,
    hasClass: /* className */ String => Boolean = null,
    isElementInContainer: /* el */ Element => Boolean = null,
    isFocused: () => Boolean = null,
    isRtl: () => Boolean = null,
    notifyClose: () => Unit = null,
    notifyOpen: () => Unit = null,
    removeClass: /* className */ String => Unit = null,
    restoreFocus: () => Unit = null,
    saveFocus: () => Unit = null,
    setMaxHeight: /* height */ String => Unit = null,
    setPosition: /* position */ PartialMDCMenuDistance => Unit = null,
    setTransformOrigin: /* origin */ String => Unit = null
  ): PartialMDCMenuSurfaceAdap = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (getAnchorDimensions != null) __obj.updateDynamic("getAnchorDimensions")(js.Any.fromFunction0(getAnchorDimensions))
    if (getBodyDimensions != null) __obj.updateDynamic("getBodyDimensions")(js.Any.fromFunction0(getBodyDimensions))
    if (getInnerDimensions != null) __obj.updateDynamic("getInnerDimensions")(js.Any.fromFunction0(getInnerDimensions))
    if (getWindowDimensions != null) __obj.updateDynamic("getWindowDimensions")(js.Any.fromFunction0(getWindowDimensions))
    if (getWindowScroll != null) __obj.updateDynamic("getWindowScroll")(js.Any.fromFunction0(getWindowScroll))
    if (hasAnchor != null) __obj.updateDynamic("hasAnchor")(js.Any.fromFunction0(hasAnchor))
    if (hasClass != null) __obj.updateDynamic("hasClass")(js.Any.fromFunction1(hasClass))
    if (isElementInContainer != null) __obj.updateDynamic("isElementInContainer")(js.Any.fromFunction1(isElementInContainer))
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction0(isFocused))
    if (isRtl != null) __obj.updateDynamic("isRtl")(js.Any.fromFunction0(isRtl))
    if (notifyClose != null) __obj.updateDynamic("notifyClose")(js.Any.fromFunction0(notifyClose))
    if (notifyOpen != null) __obj.updateDynamic("notifyOpen")(js.Any.fromFunction0(notifyOpen))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (restoreFocus != null) __obj.updateDynamic("restoreFocus")(js.Any.fromFunction0(restoreFocus))
    if (saveFocus != null) __obj.updateDynamic("saveFocus")(js.Any.fromFunction0(saveFocus))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1(setPosition))
    if (setTransformOrigin != null) __obj.updateDynamic("setTransformOrigin")(js.Any.fromFunction1(setTransformOrigin))
    __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
  }
}

