package typings.jupyterlabApplication.routerMod.Router

import typings.luminoCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for instantiating a JupyterLab URL router.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The fully qualified base URL for the router.
    */
  var base: String = js.native
  
  /**
    * The command registry used by the router.
    */
  var commands: CommandRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(base: String, commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: CommandRegistry): Self = this.set("commands", value.asInstanceOf[js.Any])
  }
}
