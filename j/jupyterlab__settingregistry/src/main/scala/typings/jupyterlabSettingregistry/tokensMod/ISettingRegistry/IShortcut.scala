package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface describing a JupyterLab keyboard shortcut.
  */
@js.native
trait IShortcut extends PartialJSONObject {
  
  /**
    * The optional arguments passed into the shortcut's command.
    */
  var args: js.UndefOr[PartialJSONObject] = js.native
  
  /**
    * The command invoked by the shortcut.
    */
  var command: String = js.native
  
  /**
    * Whether a keyboard shortcut is disabled. `False` by default.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The key combination of the shortcut.
    */
  var keys: js.Array[String] = js.native
  
  /**
    * The CSS selector applicable to the shortcut.
    */
  var selector: String = js.native
}
object IShortcut {
  
  @scala.inline
  def apply(command: String, keys: js.Array[String], selector: String): IShortcut = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcut]
  }
  
  @scala.inline
  implicit class IShortcutOps[Self <: IShortcut] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: PartialJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
