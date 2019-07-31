package typings.inquirer.inquirerMod

import typings.inquirer.Anon_BottomBar
import typings.inquirer.Anon_Ui
import typings.inquirer.TypeofClassSeparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inquirer extends PromptModuleBase {
  /**
    * Represents a choice-item separator.
    */
  var Separator: TypeofClassSeparator = js.native
  /**
    * The default prompt-module.
    */
  @JSName("prompt")
  var prompt_Original: PromptModule = js.native
  /**
    * Provides ui-components.
    */
  var ui: Anon_BottomBar = js.native
  /**
    * Creates a prompt-module.
    *
    * @param opt
    * The streams for the prompt-module.
    *
    * @returns
    * The new prompt-module.
    */
  def createPromptModule(): PromptModule = js.native
  def createPromptModule(opt: StreamOptions): PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  /**
    * The default prompt-module.
    */
  def prompt[T](questions: QuestionCollection[T]): js.Promise[T] with Anon_Ui = js.native
}

