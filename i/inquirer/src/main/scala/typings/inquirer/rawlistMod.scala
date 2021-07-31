package typings.inquirer

import typings.inquirer.inquirerStrings.down
import typings.inquirer.inquirerStrings.up
import typings.inquirer.mod.Answers
import typings.inquirer.mod.RawListQuestionOptions
import typings.inquirer.mod.prompts.SuccessfulPromptStateData
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawlistMod {
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/rawlist", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends RawListPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `RawListPrompt<T>` class.
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
    * The question for the `RawListPrompt<T>`.
    */
  type Question = RawListQuestionOptions[Answers]
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait RawListPrompt[TQuestion /* <: Question */]
    extends typings.inquirer.baseMod.^[TQuestion] {
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: js.Any): Unit = js.native
    
    /**
      * Gets the value of the specified `index`.
      *
      * @param index
      * The index to get the value for.
      *
      * @returns
      * The value of the specified `index`.
      */
    /* protected */ def getCurrentValue(index: Double): js.Any = js.native
    
    @JSName("onArrowKey")
    /* protected */ def onArrowKey_down(`type`: down): Unit = js.native
    /**
      * Handles the `ArrowKey`-event of the prompt.
      *
      * @param type
      * A value indicating whether the up or the down-arrow is being pressed.
      */
    @JSName("onArrowKey")
    /* protected */ def onArrowKey_up(`type`: up): Unit = js.native
    
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
    /* protected */ def onError(): Unit = js.native
    
    /**
      * Handles the `Keypress`-event of the prompt.
      */
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Handles the `UpdKey`-event of the prompt.
      */
    /* protected */ def onUpKey(): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    var paginator: typings.inquirer.paginatorMod.^ = js.native
    
    /**
      * Gets or sets the default index.
      */
    var rawDefault: Double = js.native
    
    /**
      * Renders the prompt.
      *
      * @param error
      * The error to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
    
    /**
      * The index of the selected choice.
      */
    var selected: Double = js.native
  }
}
