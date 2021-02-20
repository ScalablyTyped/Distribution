package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.prompts.PromptBase
import typings.inquirer.mod.prompts.PromptEventPipes
import typings.inquirer.mod.prompts.PromptOptions
import typings.inquirer.mod.prompts.PromptState
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  /**
    * Represents a prompt.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/base", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends Prompt[TQuestion] {
    /**
      * Initializes a new instance of the `Prompt<T>` class.
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
    * Represents a prompt.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait Prompt[TQuestion /* <: Question */] extends PromptBase {
    
    /**
      * Runs the prompt.
      *
      * @param callback
      * The callback for resolving the result.
      */
    /* protected */ def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit = js.native
    
    /**
      * Gets or sets an object which contains the answers.
      */
    var answers: Answers = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ def close(): Unit = js.native
    
    /**
      * Generates the question-string.
      *
      * @returns
      * The question-string.
      */
    /* protected */ def getQuestion(): String = js.native
    
    /**
      * Handles the submit-event.
      *
      * @param observable
      * The observable submit-event flow.
      */
    /* protected */ def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T] = js.native
    
    /**
      * Gets or sets the options of the prompt.
      */
    var opt: PromptOptions[TQuestion] = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    var rl: Interface = js.native
    
    /**
      * Gets or sets an object for managing the console-screen.
      */
    var screen: typings.inquirer.screenManagerMod.^ = js.native
    
    /**
      * Throws an error for a missing param.
      *
      * @param name
      * The name of the missing param.
      */
    /* protected */ def throwParamError(name: String): Unit = js.native
  }
  object Prompt {
    
    @scala.inline
    def apply[TQuestion /* <: Question */](
      _run: js.Function1[/* callback */ js.Any, Unit] => Unit,
      answers: Answers,
      close: () => Unit,
      getQuestion: () => String,
      handleSubmitEvents: Observable_[js.Any] => PromptEventPipes[js.Any],
      opt: PromptOptions[TQuestion],
      rl: Interface,
      run: () => js.Promise[_],
      screen: typings.inquirer.screenManagerMod.^,
      status: PromptState,
      throwParamError: String => Unit
    ): Prompt[TQuestion] = {
      val __obj = js.Dynamic.literal(_run = js.Any.fromFunction1(_run), answers = answers.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), getQuestion = js.Any.fromFunction0(getQuestion), handleSubmitEvents = js.Any.fromFunction1(handleSubmitEvents), opt = opt.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), screen = screen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwParamError = js.Any.fromFunction1(throwParamError))
      __obj.asInstanceOf[Prompt[TQuestion]]
    }
    
    @scala.inline
    implicit class PromptMutableBuilder[Self <: Prompt[_], TQuestion /* <: Question */] (val x: Self with Prompt[TQuestion]) extends AnyVal {
      
      @scala.inline
      def setAnswers(value: Answers): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetQuestion(value: () => String): Self = StObject.set(x, "getQuestion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleSubmitEvents(value: Observable_[js.Any] => PromptEventPipes[js.Any]): Self = StObject.set(x, "handleSubmitEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpt(value: PromptOptions[TQuestion]): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: typings.inquirer.screenManagerMod.^): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowParamError(value: String => Unit): Self = StObject.set(x, "throwParamError", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_run(value: js.Function1[/* callback */ js.Any, Unit] => Unit): Self = StObject.set(x, "_run", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The question-options for the `Prompt<T>`.
    */
  type Question = typings.inquirer.mod.Question[Answers]
}
