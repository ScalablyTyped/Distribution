package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which represents a key binding.
  *
  * #### Notes
  * A key binding is an immutable object created by a registry.
  */
@js.native
trait IKeyBinding extends js.Object {
  
  /**
    * The arguments for the command.
    */
  val args: ReadonlyPartialJSONObject = js.native
  
  /**
    * The command executed when the binding is matched.
    */
  val command: String = js.native
  
  /**
    * The key sequence for the binding.
    */
  val keys: js.Array[String] = js.native
  
  /**
    * The CSS selector for the binding.
    */
  val selector: String = js.native
}
object IKeyBinding {
  
  @scala.inline
  def apply(args: ReadonlyPartialJSONObject, command: String, keys: js.Array[String], selector: String): IKeyBinding = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBinding]
  }
  
  @scala.inline
  implicit class IKeyBindingOps[Self <: IKeyBinding] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: ReadonlyPartialJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
}
