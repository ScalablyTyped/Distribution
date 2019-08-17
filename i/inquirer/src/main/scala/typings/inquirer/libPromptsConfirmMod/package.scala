package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsConfirmMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.ConfirmQuestionOptions

  /**
    * The question-options for the `ConfirmPrompt<T>`.
    */
  type Question = ConfirmQuestionOptions[Answers]
}
