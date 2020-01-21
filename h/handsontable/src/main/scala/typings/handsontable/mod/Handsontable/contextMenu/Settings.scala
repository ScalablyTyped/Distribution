package typings.handsontable.mod.Handsontable.contextMenu

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function3[
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.undefined
  var items: js.Array[PredefinedMenuItemKey] | MenuConfig
}

object Settings {
  @scala.inline
  def apply(
    items: js.Array[PredefinedMenuItemKey] | MenuConfig,
    callback: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Unit = null
  ): Settings = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    __obj.asInstanceOf[Settings]
  }
}

