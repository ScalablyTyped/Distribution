package typings
package handsontableLib.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function3[
      /* key */ java.lang.String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var items: js.Array[PredefinedMenuItemKey] | MenuConfig
}

object Settings {
  @scala.inline
  def apply(
    items: js.Array[PredefinedMenuItemKey] | MenuConfig,
    callback: (/* key */ java.lang.String, /* selection */ js.Array[Selection], /* clickEvent */ stdLib.MouseEvent) => scala.Unit = null
  ): Settings = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    __obj.asInstanceOf[Settings]
  }
}

