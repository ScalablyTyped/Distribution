package typings.inquirer.inquirerMod.promptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  */
trait PromptBase extends js.Object {
  /**
    * Gets or sets a string which represents the state of the prompt.
    */
  var status: PromptState
  /**
    * Runs the prompt.
    *
    * @returns
    * The result of the prompt.
    */
  def run(): js.Promise[_]
}

object PromptBase {
  @scala.inline
  def apply(run: () => js.Promise[_], status: PromptState): PromptBase = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromptBase]
  }
}

