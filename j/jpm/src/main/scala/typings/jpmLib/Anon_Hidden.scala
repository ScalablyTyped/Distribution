package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hidden extends js.Object {
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.Array[jpmLib.sdkUiToolbarMod.ToolbarItem]
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _]] = js.undefined
  var title: java.lang.String
}

object Anon_Hidden {
  @scala.inline
  def apply(
    items: js.Array[jpmLib.sdkUiToolbarMod.ToolbarItem],
    title: java.lang.String,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    onAttach: /* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar => _ = null,
    onDetach: /* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar => _ = null,
    onHide: /* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar => _ = null,
    onShow: /* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar => _ = null
  ): Anon_Hidden = {
    val __obj = js.Dynamic.literal(items = items, title = title)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1(onDetach))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[Anon_Hidden]
  }
}

