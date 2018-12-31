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

