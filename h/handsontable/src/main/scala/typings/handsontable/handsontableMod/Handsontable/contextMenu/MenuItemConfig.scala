package typings.handsontable.handsontableMod.Handsontable.contextMenu

import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConfig extends js.Object {
  var callback: js.UndefOr[
    js.ThisFunction3[
      /* this */ Core, 
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.undefined
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.undefined
  var hidden: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.undefined
  var isCommand: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String | (js.ThisFunction0[/* this */ Core, String])] = js.undefined
  var renderer: js.UndefOr[
    js.ThisFunction6[
      /* this */ this.type, 
      /* hot */ Core, 
      /* wrapper */ HTMLElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ Double | String, 
      /* itemValue */ String, 
      HTMLElement
    ]
  ] = js.undefined
  var submenu: js.UndefOr[SubmenuConfig] = js.undefined
}

object MenuItemConfig {
  @scala.inline
  def apply(
    callback: js.ThisFunction3[
      /* this */ Core, 
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ] = null,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    disabled: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit]) = null,
    hidden: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit]) = null,
    isCommand: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    name: String | (js.ThisFunction0[/* this */ Core, String]) = null,
    renderer: js.ThisFunction6[
      MenuItemConfig, 
      /* hot */ Core, 
      /* wrapper */ HTMLElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ Double | String, 
      /* itemValue */ String, 
      HTMLElement
    ] = null,
    submenu: SubmenuConfig = null
  ): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommand)) __obj.updateDynamic("isCommand")(isCommand.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemConfig]
  }
}

