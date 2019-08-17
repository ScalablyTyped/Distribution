package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsEditorMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.EditorQuestionOptions

  /**
    * The question-options for the `EditorPrompt<T>`.
    */
  type Question = EditorQuestionOptions[Answers]
}
