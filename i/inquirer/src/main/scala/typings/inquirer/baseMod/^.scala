package typings.inquirer.baseMod

import typings.inquirer.mod.Answers
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
  /**
    * Gets or sets an object which contains the answers.
    */
  /* CompleteClass */
  override var answers: Answers = js.native
  /**
    * Gets or sets the options of the prompt.
    */
  /* CompleteClass */
  override var opt: PromptOptions[TQuestion] = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  /* CompleteClass */
  override var rl: Interface = js.native
  /**
    * Gets or sets an object for managing the console-screen.
    */
  /* CompleteClass */
  override var screen: typings.inquirer.screenManagerMod.^ = js.native
  /**
    * Gets or sets a string which represents the state of the prompt.
    */
  /* CompleteClass */
  override var status: PromptState = js.native
  /**
    * Runs the prompt.
    *
    * @param callback
    * The callback for resolving the result.
    */
  /* CompleteClass */
  /* protected */ override def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit = js.native
  /**
    * Releases all unmanaged resources.
    */
  /* CompleteClass */
  /* protected */ override def close(): Unit = js.native
  /**
    * Generates the question-string.
    *
    * @returns
    * The question-string.
    */
  /* CompleteClass */
  /* protected */ override def getQuestion(): String = js.native
  /**
    * Handles the submit-event.
    *
    * @param observable
    * The observable submit-event flow.
    */
  /* CompleteClass */
  /* protected */ override def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T] = js.native
  /**
    * Runs the prompt.
    *
    * @returns
    * The result of the prompt.
    */
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /**
    * Throws an error for a missing param.
    *
    * @param name
    * The name of the missing param.
    */
  /* CompleteClass */
  /* protected */ override def throwParamError(name: String): Unit = js.native
}

