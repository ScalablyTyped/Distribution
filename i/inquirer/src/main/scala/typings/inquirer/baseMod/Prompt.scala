package typings.inquirer.baseMod

import typings.inquirer.mod.Answers
import typings.inquirer.mod.prompts.PromptBase
import typings.inquirer.mod.prompts.PromptEventPipes
import typings.inquirer.mod.prompts.PromptOptions
import typings.inquirer.mod.prompts.PromptState
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  *
  * @template TQuestion
  * The options for the question.
  */
@js.native
trait Prompt[TQuestion /* <: Question */] extends PromptBase {
  /**
    * Gets or sets an object which contains the answers.
    */
  var answers: Answers = js.native
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
    * Runs the prompt.
    *
    * @param callback
    * The callback for resolving the result.
    */
  /* protected */ def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit = js.native
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
    * Throws an error for a missing param.
    *
    * @param name
    * The name of the missing param.
    */
  /* protected */ def throwParamError(name: String): Unit = js.native
}

object Prompt {
  @scala.inline
  def apply[/* <: typings.inquirer.baseMod.Question */ TQuestion](
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
  implicit class PromptOps[Self <: Prompt[_], /* <: typings.inquirer.baseMod.Question */ TQuestion] (val x: Self with Prompt[TQuestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_run(value: js.Function1[/* callback */ js.Any, Unit] => Unit): Self = this.set("_run", js.Any.fromFunction1(value))
    @scala.inline
    def setAnswers(value: Answers): Self = this.set("answers", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQuestion(value: () => String): Self = this.set("getQuestion", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleSubmitEvents(value: Observable_[js.Any] => PromptEventPipes[js.Any]): Self = this.set("handleSubmitEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setOpt(value: PromptOptions[TQuestion]): Self = this.set("opt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRl(value: Interface): Self = this.set("rl", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: typings.inquirer.screenManagerMod.^): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrowParamError(value: String => Unit): Self = this.set("throwParamError", js.Any.fromFunction1(value))
  }
  
}

