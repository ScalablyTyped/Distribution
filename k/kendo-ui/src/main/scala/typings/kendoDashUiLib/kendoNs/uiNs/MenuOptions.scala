package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | MenuAnimation] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, scala.Unit]] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, scala.Unit]] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, scala.Unit]] = js.undefined
  var openOnClick: js.UndefOr[scala.Boolean | MenuOpenOnClick] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var popupCollision: js.UndefOr[java.lang.String] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean | MenuScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, scala.Unit]] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(
    activate: /* e */ MenuActivateEvent => scala.Unit = null,
    animation: scala.Boolean | MenuAnimation = null,
    close: /* e */ MenuCloseEvent => scala.Unit = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    dataSource: js.Any = null,
    deactivate: /* e */ MenuDeactivateEvent => scala.Unit = null,
    direction: java.lang.String = null,
    hoverDelay: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    open: /* e */ MenuOpenEvent => scala.Unit = null,
    openOnClick: scala.Boolean | MenuOpenOnClick = null,
    orientation: java.lang.String = null,
    popupCollision: java.lang.String = null,
    scrollable: scala.Boolean | MenuScrollable = null,
    select: /* e */ MenuSelectEvent => scala.Unit = null
  ): MenuOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1(deactivate))
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (openOnClick != null) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (popupCollision != null) __obj.updateDynamic("popupCollision")(popupCollision)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    __obj.asInstanceOf[MenuOptions]
  }
}

