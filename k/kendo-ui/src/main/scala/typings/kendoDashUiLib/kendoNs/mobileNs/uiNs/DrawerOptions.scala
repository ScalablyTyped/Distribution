package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var afterHide: js.UndefOr[js.Function1[/* e */ DrawerAfterHideEvent, scala.Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function1[/* e */ DrawerEvent, scala.Unit]] = js.undefined
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ DrawerInitEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DrawerShowEvent, scala.Unit]] = js.undefined
  var swipeToOpen: js.UndefOr[scala.Boolean] = js.undefined
  var swipeToOpenViews: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var views: js.UndefOr[js.Any] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    afterHide: js.Function1[/* e */ DrawerAfterHideEvent, scala.Unit] = null,
    beforeShow: js.Function1[/* e */ DrawerEvent, scala.Unit] = null,
    container: kendoDashUiLib.JQuery = null,
    hide: js.Function1[/* e */ DrawerHideEvent, scala.Unit] = null,
    init: js.Function1[/* e */ DrawerInitEvent, scala.Unit] = null,
    name: java.lang.String = null,
    position: java.lang.String = null,
    show: js.Function1[/* e */ DrawerShowEvent, scala.Unit] = null,
    swipeToOpen: js.UndefOr[scala.Boolean] = js.undefined,
    swipeToOpenViews: js.Any = null,
    title: java.lang.String = null,
    views: js.Any = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (afterHide != null) __obj.updateDynamic("afterHide")(afterHide)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (container != null) __obj.updateDynamic("container")(container)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (init != null) __obj.updateDynamic("init")(init)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(swipeToOpen)) __obj.updateDynamic("swipeToOpen")(swipeToOpen)
    if (swipeToOpenViews != null) __obj.updateDynamic("swipeToOpenViews")(swipeToOpenViews)
    if (title != null) __obj.updateDynamic("title")(title)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[DrawerOptions]
  }
}

