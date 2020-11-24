package typings.luminoWidgets.menuMod.Menu

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a menu item.
  */
@js.native
trait IItemOptions extends js.Object {
  
  /**
    * The arguments for the command.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.native
  
  /**
    * The command to execute when the item is triggered.
    *
    * The default value is an empty string.
    */
  var command: js.UndefOr[String] = js.native
  
  /**
    * The submenu for a `'submenu'` type item.
    *
    * The default value is `null`.
    */
  var submenu: js.UndefOr[typings.luminoWidgets.menuMod.Menu | Null] = js.native
  
  /**
    * The type of the menu item.
    *
    * The default value is `'command'`.
    */
  var `type`: js.UndefOr[ItemType] = js.native
}
object IItemOptions {
  
  @scala.inline
  def apply(): IItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemOptions]
  }
  
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: ReadonlyJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setSubmenu(value: typings.luminoWidgets.menuMod.Menu): Self = this.set("submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    
    @scala.inline
    def setSubmenuNull: Self = this.set("submenu", null)
    
    @scala.inline
    def setType(value: ItemType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
