package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsBaseMod {
  import typings.inquirer.inquirerMod.Answers

  /**
    * The question-options for the `Prompt<T>`.
    */
  type Question = typings.inquirer.inquirerMod.Question[Answers]
}
