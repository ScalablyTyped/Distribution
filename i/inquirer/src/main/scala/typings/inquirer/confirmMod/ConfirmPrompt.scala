package typings.inquirer.confirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a prompt which provides a message to confirm.
  *
  * @template TQuestion
  * The options for the question.
  */
@js.native
trait ConfirmPrompt[TQuestion /* <: Question */]
  extends typings.inquirer.baseMod.^[TQuestion] {
  
  /**
    * Handles the `success`-event of the prompt.
    *
    * @param input
    * The input provided by the user.
    */
  /* protected */ def onEnd(input: String): Unit = js.native
  
  /**
    * Handles the `Keypress`-event of the prompt.
    */
  /* protected */ def onKeypress(): Unit = js.native
  
  /**
    * Renders the prompt.
    *
    * @param answer
    * The answer provided by the user.
    */
  /* protected */ def render(): this.type = js.native
  /* protected */ def render(answer: Boolean): this.type = js.native
}
