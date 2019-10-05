package typings.inquirer.libUiBaseUIMod

import typings.inquirer.inquirerMod.prompts.PromptBase
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a ui.
  */
trait UI extends js.Object {
  /**
    * Gets or sets the currently active prompt.
    */
  var activePrompt: PromptBase
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit
  /**
    * Handles a forced exit of the application.
    */
  /* protected */ def onForceClose(): Unit
}

object UI {
  @scala.inline
  def apply(activePrompt: PromptBase, close: () => Unit, onForceClose: () => Unit, rl: Interface): UI = {
    val __obj = js.Dynamic.literal(activePrompt = activePrompt, close = js.Any.fromFunction0(close), onForceClose = js.Any.fromFunction0(onForceClose), rl = rl)
  
    __obj.asInstanceOf[UI]
  }
}

