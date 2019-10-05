package typings.inquirer.inquirerMod

import typings.inquirer.Anon_Ui
import typings.inquirer.inquirerMod.prompts.PromptCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to prompt questions to the user.
  */
@js.native
trait PromptModule extends PromptModuleBase {
  /**
    * The prompts of the prompt-module.
    */
  var prompts: PromptCollection = js.native
  /**
    * Prompts the questions to the user.
    */
  def apply[T](questions: QuestionCollection[T]): js.Promise[T] with Anon_Ui = js.native
}

