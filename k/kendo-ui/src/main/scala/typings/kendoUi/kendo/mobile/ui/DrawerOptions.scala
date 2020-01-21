package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var afterHide: js.UndefOr[js.Function1[/* e */ DrawerAfterHideEvent, Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  var container: js.UndefOr[JQuery] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ DrawerInitEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DrawerShowEvent, Unit]] = js.undefined
  var swipeToOpen: js.UndefOr[Boolean] = js.undefined
  var swipeToOpenViews: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[js.Any] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    afterHide: /* e */ DrawerAfterHideEvent => Unit = null,
    beforeShow: /* e */ DrawerEvent => Unit = null,
    container: JQuery = null,
    hide: /* e */ DrawerHideEvent => Unit = null,
    init: /* e */ DrawerInitEvent => Unit = null,
    name: String = null,
    position: String = null,
    show: /* e */ DrawerShowEvent => Unit = null,
    swipeToOpen: js.UndefOr[Boolean] = js.undefined,
    swipeToOpenViews: js.Any = null,
    title: String = null,
    views: js.Any = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction1(afterHide))
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction1(beforeShow))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (!js.isUndefined(swipeToOpen)) __obj.updateDynamic("swipeToOpen")(swipeToOpen.asInstanceOf[js.Any])
    if (swipeToOpenViews != null) __obj.updateDynamic("swipeToOpenViews")(swipeToOpenViews.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
}

