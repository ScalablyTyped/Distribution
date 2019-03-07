package typings
package handsontableLib.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConfig extends js.Object {
  var callback: js.UndefOr[
    js.ThisFunction3[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* key */ java.lang.String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var disableSelection: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[
    scala.Boolean | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      scala.Boolean | scala.Unit
    ])
  ] = js.undefined
  var hidden: js.UndefOr[
    scala.Boolean | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      scala.Boolean | scala.Unit
    ])
  ] = js.undefined
  var isCommand: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[
    java.lang.String | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      java.lang.String
    ])
  ] = js.undefined
  var renderer: js.UndefOr[
    js.ThisFunction6[
      /* this */ this.type, 
      /* hot */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* wrapper */ stdLib.HTMLElement, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ scala.Double | java.lang.String, 
      /* itemValue */ java.lang.String, 
      stdLib.HTMLElement
    ]
  ] = js.undefined
  var submenu: js.UndefOr[SubmenuConfig] = js.undefined
}

object MenuItemConfig {
  @scala.inline
  def apply(
    callback: js.ThisFunction3[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* key */ java.lang.String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ stdLib.MouseEvent, 
      scala.Unit
    ] = null,
    disableSelection: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: scala.Boolean | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      scala.Boolean | scala.Unit
    ]) = null,
    hidden: scala.Boolean | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      scala.Boolean | scala.Unit
    ]) = null,
    isCommand: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    name: java.lang.String | (js.ThisFunction0[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      java.lang.String
    ]) = null,
    renderer: js.ThisFunction6[
      MenuItemConfig, 
      /* hot */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* wrapper */ stdLib.HTMLElement, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ scala.Double | java.lang.String, 
      /* itemValue */ java.lang.String, 
      stdLib.HTMLElement
    ] = null,
    submenu: SubmenuConfig = null
  ): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommand)) __obj.updateDynamic("isCommand")(isCommand)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    __obj.asInstanceOf[MenuItemConfig]
  }
}

