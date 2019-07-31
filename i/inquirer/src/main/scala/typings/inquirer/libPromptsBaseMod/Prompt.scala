package typings.inquirer.libPromptsBaseMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.promptsNs.PromptBase
import typings.inquirer.inquirerMod.promptsNs.PromptEventPipes
import typings.inquirer.inquirerMod.promptsNs.PromptOptions
import typings.inquirer.inquirerMod.promptsNs.PromptState
import typings.node.readlineMod.Interface
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  *
  * @template TQuestion
  * The options for the question.
  */
trait Prompt[TQuestion /* <: Question */] extends PromptBase {
  /**
    * Gets or sets an object which contains the answers.
    */
  var answers: Answers
  /**
    * Gets or sets the options of the prompt.
    */
  var opt: PromptOptions[TQuestion]
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Gets or sets an object for managing the console-screen.
    */
  var screen: typings.inquirer.libUtilsScreenDashManagerMod.^
  /**
    * Runs the prompt.
    *
    * @param callback
    * The callback for resolving the result.
    */
  /* protected */ def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit
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
  /* protected */ def handleSubmitEvents[T](observable: Observable[T]): PromptEventPipes[T]
  /**
    * Throws an error for a missing param.
    *
    * @param name
    * The name of the missing param.
    */
  /* protected */ def throwParamError(name: String): Unit
}

object Prompt {
  @scala.inline
  def apply[TQuestion /* <: Question */](
    _run: js.Function1[/* callback */ js.Any, Unit] => Unit,
    answers: Answers,
    close: () => Unit,
    getQuestion: () => String,
    handleSubmitEvents: Observable[js.Any] => PromptEventPipes[js.Any],
    opt: PromptOptions[TQuestion],
    rl: Interface,
    run: () => js.Promise[_],
    screen: typings.inquirer.libUtilsScreenDashManagerMod.^,
    status: PromptState,
    throwParamError: String => Unit
  ): Prompt[TQuestion] = {
    val __obj = js.Dynamic.literal(_run = js.Any.fromFunction1(_run), answers = answers, close = js.Any.fromFunction0(close), getQuestion = js.Any.fromFunction0(getQuestion), handleSubmitEvents = js.Any.fromFunction1(handleSubmitEvents), opt = opt.asInstanceOf[js.Any], rl = rl, run = js.Any.fromFunction0(run), screen = screen, status = status.asInstanceOf[js.Any], throwParamError = js.Any.fromFunction1(throwParamError))
  
    __obj.asInstanceOf[Prompt[TQuestion]]
  }
}

