package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsPasswordMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.PasswordQuestionOptions

  /**
    * The question for the `PasswordPrompt<T>`.
    */
  type Question = PasswordQuestionOptions[Answers]
}
