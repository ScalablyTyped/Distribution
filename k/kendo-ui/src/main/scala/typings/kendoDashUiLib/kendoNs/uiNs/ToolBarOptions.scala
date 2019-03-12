package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ToolBarClickEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ToolBarCloseEvent, scala.Unit]] = js.undefined
  var items: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ToolBarOpenEvent, scala.Unit]] = js.undefined
  var overflowClose: js.UndefOr[js.Function1[/* e */ ToolBarOverflowCloseEvent, scala.Unit]] = js.undefined
  var overflowOpen: js.UndefOr[js.Function1[/* e */ ToolBarOverflowOpenEvent, scala.Unit]] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function1[/* e */ ToolBarToggleEvent, scala.Unit]] = js.undefined
}

object ToolBarOptions {
  @scala.inline
  def apply(
    click: /* e */ ToolBarClickEvent => scala.Unit = null,
    close: /* e */ ToolBarCloseEvent => scala.Unit = null,
    items: js.Array[ToolBarItem] = null,
    name: java.lang.String = null,
    open: /* e */ ToolBarOpenEvent => scala.Unit = null,
    overflowClose: /* e */ ToolBarOverflowCloseEvent => scala.Unit = null,
    overflowOpen: /* e */ ToolBarOverflowOpenEvent => scala.Unit = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: /* e */ ToolBarToggleEvent => scala.Unit = null
  ): ToolBarOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (overflowClose != null) __obj.updateDynamic("overflowClose")(js.Any.fromFunction1(overflowClose))
    if (overflowOpen != null) __obj.updateDynamic("overflowOpen")(js.Any.fromFunction1(overflowOpen))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[ToolBarOptions]
  }
}

