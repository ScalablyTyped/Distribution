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
    onAttach: js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _] = null,
    onDetach: js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _] = null,
    onHide: js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _] = null,
    onShow: js.Function1[/* toolbar */ jpmLib.sdkUiToolbarMod.Toolbar, _] = null
  ): Anon_Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("title")(title)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (onAttach != null) __obj.updateDynamic("onAttach")(onAttach)
    if (onDetach != null) __obj.updateDynamic("onDetach")(onDetach)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    __obj.asInstanceOf[Anon_Hidden]
  }
}

