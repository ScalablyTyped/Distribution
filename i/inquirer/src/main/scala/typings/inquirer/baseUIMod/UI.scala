package typings.inquirer.baseUIMod

import typings.inquirer.mod.prompts.PromptBase
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a ui.
  */
@js.native
trait UI extends js.Object {
  
  /**
    * Gets or sets the currently active prompt.
    */
  var activePrompt: PromptBase = js.native
  
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit = js.native
  
  /**
    * Handles a forced exit of the application.
    */
  /* protected */ def onForceClose(): Unit = js.native
  
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface = js.native
}
object UI {
  
  @scala.inline
  def apply(activePrompt: PromptBase, close: () => Unit, onForceClose: () => Unit, rl: Interface): UI = {
    val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), onForceClose = js.Any.fromFunction0(onForceClose), rl = rl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
  
  @scala.inline
  implicit class UIOps[Self <: UI] (val x: Self) extends AnyVal {
    
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
    def setActivePrompt(value: PromptBase): Self = this.set("activePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnForceClose(value: () => Unit): Self = this.set("onForceClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRl(value: Interface): Self = this.set("rl", value.asInstanceOf[js.Any])
  }
}
