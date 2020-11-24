package typings.inquirer.mod

import typings.inquirer.anon.BottomBar
import typings.inquirer.anon.TypeofSeparator
import typings.inquirer.anon.Ui
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inquirer extends PromptModuleBase {
  
  /**
    * Represents a choice-item separator.
    */
  var Separator: TypeofSeparator = js.native
  
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
  def prompt[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
  def prompt[T](questions: QuestionCollection[T], initialAnswers: Partial[T]): js.Promise[T] with Ui = js.native
  /**
    * The default prompt-module.
    */
  @JSName("prompt")
  var prompt_Original: PromptModule = js.native
  
  /**
    * Provides ui-components.
    */
  var ui: BottomBar = js.native
}
