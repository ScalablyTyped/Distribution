package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.NumberQuestionOptions
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/number", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected ()
    extends typings.inquirer.inputMod.^[TQuestion] {
    /**
      * Initializes a new instance of the `NumberPrompt<T>` class.
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
    def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
  }
  
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: Question */] = typings.inquirer.inputMod.^[TQuestion]
  
  /**
    * The question for the `NumberPrompt<T>`.
    */
  type Question = NumberQuestionOptions[Answers]
}
