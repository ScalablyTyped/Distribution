package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.CheckboxQuestionOptions
import typings.inquirer.mod.prompts.FailedPromptStateData
import typings.inquirer.mod.prompts.SuccessfulPromptStateData
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  /**
    * Represents a prompt which provides a set of choices to check.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/checkbox", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends CheckboxPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `CheckboxPrompt<T>` class.
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
    * Represents a prompt which provides a set of choices to check.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait CheckboxPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.baseMod.^[TQuestion] {
    
    /**
      * Gets the current value of the prompt.
      *
      * @returns
      * The current value of the prompt.
      */
    /* protected */ def getCurrentValue(): js.Any = js.native
    
    /**
      * Handles the `AllKey`-event of the prompt.
      */
    /* protected */ def onAllKey(): Unit = js.native
    
    /**
      * Handles the `DownKey`-event of the prompt.
      */
    /* protected */ def onDownKey(): Unit = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onEnd(eventArgs: SuccessfulPromptStateData[js.Any]): Unit = js.native
    
    /**
      * Handles the `error`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onError(eventArgs: FailedPromptStateData): Unit = js.native
    
    /**
      * Handles the `InverseKey`-event of the prompt.
      */
    /* protected */ def onInverseKey(): Unit = js.native
    
    /**
      * Handles the `NumberKey`-event of the prompt.
      *
      * @param input
      * The number which has been pressed.
      */
    /* protected */ def onNumberKey(input: Double): Unit = js.native
    
    /**
      * Handles the `SpaceKey`-event of the prompt.
      */
    /* protected */ def onSpaceKey(): Unit = js.native
    
    /**
      * Handles the `UpdKey`-event of the prompt.
      */
    /* protected */ def onUpKey(): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    /* protected */ var paginator: typings.inquirer.paginatorMod.^ = js.native
    
    /**
      * Gets or sets the index of the currently focused choice.
      */
    /* protected */ var pointer: Double = js.native
    
    /**
      * Renders the prompt.
      *
      * @param error
      * An error message to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
    
    /**
      * Toggles the state of a choice.
      *
      * @param index
      * The index of the choice to toggle.
      */
    /* protected */ def toggleChoice(index: Double): Unit = js.native
  }
  
  /**
    * The question-options for the `ChoicePrompt<T>`.
    */
  type Question = CheckboxQuestionOptions[Answers]
}
