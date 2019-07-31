package typings.inquirer

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.EditorQuestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsEditorMod {
  /**
    * The question-options for the `EditorPrompt<T>`.
    */
  type Question = EditorQuestionOptions[Answers]
}
