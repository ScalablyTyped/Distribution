package typings.inquirer.mod

import typings.inquirer.anon.Ui
import typings.inquirer.mod.prompts.PromptCollection
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
  def apply[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
}

