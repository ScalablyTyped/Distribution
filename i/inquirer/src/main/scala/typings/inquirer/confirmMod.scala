package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.ConfirmQuestionOptions
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  /**
    * Represents a prompt which provides a message to confirm.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/confirm", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected () extends ConfirmPrompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link ConfirmPrompt `ConfirmPrompt<TQuestion>`} class.
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
    * Represents a prompt which provides a message to confirm.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait ConfirmPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.baseMod.default[TQuestion] {
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param input
      * The input provided by the user.
      */
    /* protected */ def onEnd(input: String): Unit = js.native
    
    /**
      * Handles the `Keypress`-event of the prompt.
      */
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Renders the prompt.
      *
      * @param answer
      * The answer provided by the user.
      */
    /* protected */ def render(): this.type = js.native
    /* protected */ def render(answer: Boolean): this.type = js.native
  }
  
  /**
    * The question-options for the {@link ConfirmPrompt `ConfirmPrompt<TQuestion>`}.
    */
  type Question = ConfirmQuestionOptions[Answers]
}
