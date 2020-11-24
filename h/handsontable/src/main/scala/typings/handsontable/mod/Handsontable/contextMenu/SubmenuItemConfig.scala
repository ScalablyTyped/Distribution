package typings.handsontable.mod.Handsontable.contextMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig ]: P} & {[ P in 'key' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig] ]: handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig[P]} */ @js.native
trait SubmenuItemConfig extends js.Object {
  
  /**
    * Submenu item `key` must be defined as "parent_key:sub_key" where "parent_key" is the parent MenuItemConfig key.
    */
  var key: String = js.native
}
object SubmenuItemConfig {
  
  @scala.inline
  def apply(key: String): SubmenuItemConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmenuItemConfig]
  }
  
  @scala.inline
  implicit class SubmenuItemConfigOps[Self <: SubmenuItemConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
