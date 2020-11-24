package typings.inquirer.confirmMod

import typings.inquirer.mod.Answers
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a prompt which provides a message to confirm.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/confirm", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected () extends ConfirmPrompt[TQuestion] {
  /**
    * Initializes a new instance of the `ConfirmPrompt<T>` class.
    *
    * @param question
    * The question to prompt the user to answer.
    *
    * @param readLine
    * An object for performing read from and write to the console.
    *
    * @param answers
    * The answer-object.
    */
  def this(questions: TQuestion, readLine: Interface, answers: Answers) = this()
}
