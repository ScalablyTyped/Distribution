package typings.jupyterlabSettingeditor.anon

import typings.luminoCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registry extends js.Object {
  
  /**
    * The command registry.
    */
  var registry: CommandRegistry = js.native
  
  /**
    * The revert command ID.
    */
  var revert: String = js.native
  
  /**
    * The save command ID.
    */
  var save: String = js.native
}
object Registry {
  
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): Registry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
  
  @scala.inline
  implicit class RegistryOps[Self <: Registry] (val x: Self) extends AnyVal {
    
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
    def setRegistry(value: CommandRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevert(value: String): Self = this.set("revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
  }
}
