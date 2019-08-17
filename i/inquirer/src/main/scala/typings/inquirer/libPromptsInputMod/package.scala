package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsInputMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.InputQuestionOptions

  /**
    * The question-options for the `InputPrompt<T>`.
    */
  type Question = InputQuestionOptions[Answers]
}
