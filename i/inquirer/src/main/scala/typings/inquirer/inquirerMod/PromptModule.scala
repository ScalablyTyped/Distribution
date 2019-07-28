package typings.inquirer.inquirerMod

import typings.inquirer.Anon_Ui
import typings.inquirer.inquirerMod.promptsNs.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  def apply[A](questions: Questions[A]): js.Promise[A] with Anon_Ui = js.native
  /**
    * Register a prompt type
    * @param name Prompt type name
    * @param prompt Prompt constructor
    */
  def registerPrompt(name: String, prompt: Base): PromptModule = js.native
  /**
    * Register the defaults provider prompts
    */
  def restoreDefaultPrompts(): Unit = js.native
}

