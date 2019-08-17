package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsExpandMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.ExpandQuestionOptions

  /**
    * The question-options for the `ExpandPrompt<T>`.
    */
  type Question = ExpandQuestionOptions[Answers]
}
