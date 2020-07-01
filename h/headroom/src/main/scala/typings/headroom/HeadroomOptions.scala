package typings.headroom

import typings.headroom.anon.Bottom
import typings.headroom.anon.Down
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadroomOptions extends js.Object {
  /** css classes to apply multiple classes are also supported with a space-separated list */
  var classes: js.UndefOr[Bottom] = js.undefined
  /** vertical offset in px before element is first unpinned */
  var offset: js.UndefOr[Double] = js.undefined
  /** callback when at bottom of page, `this` is headroom object */
  var onBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** callback when moving away from bottom of page, `this` is headroom object */
  var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** callback when below offset, `this` is headroom object */
  var onNotTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** callback when pinned, `this` is headroom object */
  var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** callback when above offset, `this` is headroom object */
  var onTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** callback when unpinned, `this` is headroom object */
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** element to listen to scroll events on, defaults to `window` */
  var scroller: js.UndefOr[HTMLElement] = js.undefined
  /** scroll tolerance in px before state changes or you can specify tolerance individually for up/down scroll */
  var tolerance: js.UndefOr[Down | Double] = js.undefined
}

object HeadroomOptions {
  @scala.inline
  def apply(
    classes: Bottom = null,
    offset: js.UndefOr[Double] = js.undefined,
    onBottom: () => Unit = null,
    onNotBottom: () => Unit = null,
    onNotTop: () => Unit = null,
    onPin: () => Unit = null,
    onTop: () => Unit = null,
    onUnpin: () => Unit = null,
    scroller: HTMLElement = null,
    tolerance: Down | Double = null
  ): HeadroomOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction0(onBottom))
    if (onNotBottom != null) __obj.updateDynamic("onNotBottom")(js.Any.fromFunction0(onNotBottom))
    if (onNotTop != null) __obj.updateDynamic("onNotTop")(js.Any.fromFunction0(onNotTop))
    if (onPin != null) __obj.updateDynamic("onPin")(js.Any.fromFunction0(onPin))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction0(onTop))
    if (onUnpin != null) __obj.updateDynamic("onUnpin")(js.Any.fromFunction0(onUnpin))
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadroomOptions]
  }
}

