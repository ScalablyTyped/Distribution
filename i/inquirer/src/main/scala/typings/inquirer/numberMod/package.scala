package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object numberMod {
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: typings.inquirer.numberMod.Question */] = typings.inquirer.inputMod.^[TQuestion]
  /**
    * The question for the `NumberPrompt<T>`.
    */
  type Question = typings.inquirer.mod.NumberQuestionOptions[typings.inquirer.mod.Answers]
}
