package typings.inquirer

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.InputQuestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsInputMod {
  /**
    * The question-options for the `InputPrompt<T>`.
    */
  type Question = InputQuestionOptions[Answers]
}
