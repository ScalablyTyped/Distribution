package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.Question
import typings.inquirer.mod.inquirer.prompts.PromptBase
import typings.inquirer.mod.inquirer.prompts.PromptEventPipes
import typings.inquirer.mod.inquirer.prompts.PromptOptions
import typings.inquirer.mod.inquirer.prompts.PromptState
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsBaseMod {
  
  /**
    * Represents a prompt.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/base", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question[Answers] */] protected ()
    extends StObject
       with Prompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link Prompt `Prompt<TQuestion>`} class.
      *
      * @param question
      * The question to prompt the user to answer.
      *
      * @param readLine
      * An object for performing read from and write to the console.
      *
      * @param answers
      * The {@link Answers `Answers`}-object.
      */
    def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
    
    /**
      * Runs the prompt.
      *
      * @param callback
      * The callback for resolving the result.
      */
    /* protected */ /* CompleteClass */
    override def _run(callback: js.Function1[/* callback */ Any, Unit]): Unit = js.native
    
    /**
      * Gets or sets an object which contains the answers.
      */
    /* protected */ /* CompleteClass */
    var answers: Answers = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Generates the question-string.
      *
      * @returns
      * The question-string.
      */
    /* protected */ /* CompleteClass */
    override def getQuestion(): String = js.native
    
    /**
      * Handles the submit-event.
      *
      * @param observable
      * The observable submit-event flow.
      */
    /* protected */ /* CompleteClass */
    override def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T] = js.native
    
    /**
      * Gets or sets the options of the prompt.
      */
    /* protected */ /* CompleteClass */
    var opt: PromptOptions[TQuestion] = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ /* CompleteClass */
    var rl: Interface = js.native
    
    /**
      * Runs the prompt.
      *
      * @returns
      * The result of the prompt.
      */
    /* CompleteClass */
    override def run(): js.Promise[Any] = js.native
    
    /**
      * Gets or sets an object for managing the console-screen.
      */
    /* protected */ /* CompleteClass */
    var screen: typings.inquirer.libUtilsScreenManagerMod.default = js.native
    
    /**
      * Gets or sets a string which represents the state of the prompt.
      */
    /* CompleteClass */
    var status: PromptState = js.native
    
    /**
      * Throws an error for a missing parameter.
      *
      * @param name
      * The name of the missing parameter.
      */
    /* protected */ /* CompleteClass */
    override def throwParamError(name: String): Unit = js.native
  }
  
  /**
    * Represents a prompt.
    *
    * @template TQuestion
    * The options for the question.
    */
  trait Prompt[TQuestion /* <: Question[Answers] */]
    extends StObject
       with PromptBase {
    
    /**
      * Runs the prompt.
      *
      * @param callback
      * The callback for resolving the result.
      */
    /* protected */ def _run(callback: js.Function1[/* callback */ Any, Unit]): Unit
    
    /**
      * Gets or sets an object which contains the answers.
      */
    /* protected */ var answers: Answers
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ def close(): Unit
    
    /**
      * Generates the question-string.
      *
      * @returns
      * The question-string.
      */
    /* protected */ def getQuestion(): String
    
    /**
      * Handles the submit-event.
      *
      * @param observable
      * The observable submit-event flow.
      */
    /* protected */ def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T]
    
    /**
      * Gets or sets the options of the prompt.
      */
    /* protected */ var opt: PromptOptions[TQuestion]
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ var rl: Interface
    
    /**
      * Gets or sets an object for managing the console-screen.
      */
    /* protected */ var screen: typings.inquirer.libUtilsScreenManagerMod.default
    
    /**
      * Throws an error for a missing parameter.
      *
      * @param name
      * The name of the missing parameter.
      */
    /* protected */ def throwParamError(name: String): Unit
  }
  object Prompt {
    
    inline def apply[TQuestion /* <: Question[Answers] */](
      _run: js.Function1[/* callback */ Any, Unit] => Unit,
      answers: Answers,
      close: () => Unit,
      getQuestion: () => String,
      handleSubmitEvents: Observable_[Any] => PromptEventPipes[Any],
      opt: PromptOptions[TQuestion],
      rl: Interface,
      run: () => js.Promise[Any],
      screen: typings.inquirer.libUtilsScreenManagerMod.default,
      status: PromptState,
      throwParamError: String => Unit
    ): Prompt[TQuestion] = {
      val __obj = js.Dynamic.literal(_run = js.Any.fromFunction1(_run), answers = answers.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), getQuestion = js.Any.fromFunction0(getQuestion), handleSubmitEvents = js.Any.fromFunction1(handleSubmitEvents), opt = opt.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), screen = screen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwParamError = js.Any.fromFunction1(throwParamError))
      __obj.asInstanceOf[Prompt[TQuestion]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prompt[?], TQuestion /* <: Question[Answers] */] (val x: Self & Prompt[TQuestion]) extends AnyVal {
      
      inline def setAnswers(value: Answers): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetQuestion(value: () => String): Self = StObject.set(x, "getQuestion", js.Any.fromFunction0(value))
      
      inline def setHandleSubmitEvents(value: Observable_[Any] => PromptEventPipes[Any]): Self = StObject.set(x, "handleSubmitEvents", js.Any.fromFunction1(value))
      
      inline def setOpt(value: PromptOptions[TQuestion]): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      inline def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: typings.inquirer.libUtilsScreenManagerMod.default): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setThrowParamError(value: String => Unit): Self = StObject.set(x, "throwParamError", js.Any.fromFunction1(value))
      
      inline def set_run(value: js.Function1[/* callback */ Any, Unit] => Unit): Self = StObject.set(x, "_run", js.Any.fromFunction1(value))
    }
  }
}
