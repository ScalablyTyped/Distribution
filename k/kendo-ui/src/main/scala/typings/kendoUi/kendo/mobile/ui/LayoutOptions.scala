package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions extends js.Object {
  var hide: js.UndefOr[js.Function1[/* e */ LayoutHideEvent, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ LayoutInitEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ LayoutShowEvent, Unit]] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply(
    hide: /* e */ LayoutHideEvent => Unit = null,
    id: String = null,
    init: /* e */ LayoutInitEvent => Unit = null,
    name: String = null,
    platform: String = null,
    show: /* e */ LayoutShowEvent => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    __obj.asInstanceOf[LayoutOptions]
  }
}

