package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.ListQuestionOptions
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsListMod {
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/list", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected () extends ListPrompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link ListPrompt `ListPrompt<TQuestion>`} class.
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
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait ListPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.libPromptsBaseMod.default[TQuestion] {
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: Any): Unit = js.native
    
    /**
      * Gets or sets a value indicating whether the prompt has been rendered the first time.
      */
    /* protected */ var firstRender: Boolean = js.native
    
    /**
      * Gets the current value of the prompt.
      */
    /* protected */ def getCurrentValue(): Any = js.native
    
    /**
      * Handles the `downKey`-event.
      */
    /* protected */ def onDownKey(): Unit = js.native
    
    /**
      * Handles the `numberKey`-event.
      *
      * @param input
      * The number that has been pressed.
      */
    /* protected */ def onNumberKey(input: Double): Unit = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param value
      * The value of the prompt.
      */
    /* protected */ def onSubmit(value: Any): Unit = js.native
    
    /**
      * Handles the `upKey`-event.
      */
    /* protected */ def onUpKey(): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    /* protected */ var paginator: typings.inquirer.libUtilsPaginatorMod.default = js.native
    
    /**
      * Renders the prompt.
      */
    /* protected */ def render(): Unit = js.native
    
    /**
      * The index of the selected choice.
      */
    /* protected */ var selected: Double = js.native
  }
  
  /**
    * The question-options for the {@link ListPrompt `ListPrompt<TQuestion>`}.
    */
  type Question = ListQuestionOptions[Answers]
}
