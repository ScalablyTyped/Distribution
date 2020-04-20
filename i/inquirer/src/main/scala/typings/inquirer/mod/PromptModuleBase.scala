package typings.inquirer.mod

import typings.inquirer.mod.prompts.PromptConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides prompts for answering questions.
  */
trait PromptModuleBase extends js.Object {
  /**
    * Registers a new prompt-type.
    *
    * @param name
    * The name of the prompt.
    *
    * @param prompt
    * The constructor of the prompt.
    */
  def registerPrompt(name: String, prompt: PromptConstructor): Unit
  /**
    * Registers the default prompts.
    */
  def restoreDefaultPrompts(): Unit
}

object PromptModuleBase {
  @scala.inline
  def apply(registerPrompt: (String, PromptConstructor) => Unit, restoreDefaultPrompts: () => Unit): PromptModuleBase = {
    val __obj = js.Dynamic.literal(registerPrompt = js.Any.fromFunction2(registerPrompt), restoreDefaultPrompts = js.Any.fromFunction0(restoreDefaultPrompts))
    __obj.asInstanceOf[PromptModuleBase]
  }
}

