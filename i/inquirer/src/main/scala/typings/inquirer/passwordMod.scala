package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.PasswordQuestionOptions
import typings.inquirer.mod.inquirer.prompts.FailedPromptStateData
import typings.inquirer.mod.inquirer.prompts.SuccessfulPromptStateData
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordMod {
  
  /**
    * Represents a prompt which allows the user to type a password.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/password", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected () extends PasswordPrompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link PasswordPrompt `PasswordPrompt<TQuestion>`} class.
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
    * Represents a prompt which allows the user to type a password.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait PasswordPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.baseMod.default[TQuestion] {
    
    /**
      * The answer to this prompt.
      */
    /* protected */ var answer: Any = js.native
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: Any): Unit = js.native
    
    /**
      * Filters the specified {@link input `input`}.
      *
      * @param input
      * The input to filter.
      *
      * @returns
      * The filtered input.
      */
    /* protected */ def filterInput(input: String): String = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onEnd(eventArgs: SuccessfulPromptStateData[Any]): Unit = js.native
    
    /**
      * Handles the `error`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onError(eventArgs: FailedPromptStateData): Unit = js.native
    
    /**
      * Handles the `keypress`-event of the prompt.
      */
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Renders the prompt.
      *
      * @param error
      * The error to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
  }
  
  /**
    * The question for the {@link PasswordPrompt `PasswordPrompt<TQuestion>`}.
    */
  type Question = PasswordQuestionOptions[Answers]
}
