package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsListMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.ListQuestionOptions

  /**
    * The question-options for the `ListPrompt<T>`.
    */
  type Question = ListQuestionOptions[Answers]
}
