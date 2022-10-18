package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.EditorQuestionOptions
import typings.inquirer.mod.inquirer.prompts.FailedPromptStateData
import typings.inquirer.mod.inquirer.prompts.SuccessfulPromptStateData
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Subject
import typings.rxjs.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsEditorMod {
  
  /**
    * Represents a prompt which provides a text-editor.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/editor", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected () extends EditorPrompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link EditorPrompt `EditorPrompt<TQuestion>`} class.
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
    * Represents a prompt which provides a text-editor.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait EditorPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.libPromptsBaseMod.default[TQuestion] {
    
    /**
      * Gets or sets the initial text.
      */
    /* protected */ var currentText: String = js.native
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: Any): Unit = js.native
    
    /**
      * Gets or sets an object for subscribing to the editor-result.
      */
    /* protected */ var editorResult: Subject[String] = js.native
    
    /**
      * Closes the external editor.
      *
      * @param error
      * Either the error which occurred while executing the external editor or `null`.
      *
      * @param result
      * The result of the editor.
      */
    /* protected */ def endExternalEditor(error: js.Error, result: String): Unit = js.native
    
    /**
      * Gets or sets a subscription to the `line`-event.
      */
    /* protected */ var lineSubscription: Subscription = js.native
    
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
      * Renders the prompt.
      *
      * @param error
      * The error to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
    
    /**
      * Launches the default text-editor of the system.
      */
    /* protected */ def startExternalEditor(): Unit = js.native
  }
  
  /**
    * The question-options for the {@link EditorPrompt `EditorPrompt<TQuestion>`}.
    */
  type Question = EditorQuestionOptions[Answers]
}
