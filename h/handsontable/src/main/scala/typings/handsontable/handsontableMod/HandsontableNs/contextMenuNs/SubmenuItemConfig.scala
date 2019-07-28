package typings.handsontable.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig ]: P} & {[ P in 'key' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig] ]: handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig[P]} */ trait SubmenuItemConfig extends js.Object {
  /**
    * Submenu item `key` must be defined as "parent_key:sub_key" where "parent_key" is the parent MenuItemConfig key.
    */
  var key: String
}

object SubmenuItemConfig {
  @scala.inline
  def apply(key: String): SubmenuItemConfig = {
    val __obj = js.Dynamic.literal(key = key)
  
    __obj.asInstanceOf[SubmenuItemConfig]
  }
}

