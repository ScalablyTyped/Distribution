package typings.inquirer.libUiPromptMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.DistinctQuestion
import typings.inquirer.inquirerMod.promptsNs.PromptCollection
import typings.inquirer.inquirerMod.uiNs.FetchedAnswer
import typings.inquirer.inquirerMod.uiNs.FetchedQuestion
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the prompt ui.
  */
@js.native
trait PromptUI
  extends typings.inquirer.libUiBaseUIMod.^ {
  /**
    * Gets or sets the answers provided by the user.
    */
  var answers: Answers = js.native
  /**
    * Gets or sets the event-flow of the process.
    */
  var process: Observable[Answers] = js.native
  /**
    * Gets or sets the prompts of the ui.
    */
  var prompts: PromptCollection = js.native
  /**
    * Fetches the answer to a question.
    *
    * @param question
    * The question to fetch the answer for.
    *
    * @returns
    * The answer to the question.
    */
  /* protected */ def fetchAnswer(question: FetchedQuestion[Answers]): Observable[FetchedAnswer] = js.native
  /**
    * Filters the question if it is runnable.
    *
    * @param question
    * The question to filter.
    *
    * @returns
    * Either the event-flow of the question if it is runnable or an empty event-flow.
    */
  /* protected */ def filterIfRunnable(question: DistinctQuestion[Answers]): Observable[DistinctQuestion[Answers]] = js.native
  /**
    * Finishes the process.
    */
  /* protected */ def onCompletion(): Answers = js.native
  /**
    * Processes a question.
    *
    * @param question
    * The question to process.
    *
    * @returns
    * The answer to the question.
    */
  /* protected */ def processQuestion(question: DistinctQuestion[Answers]): Observable[FetchedAnswer] = js.native
  /**
    * Runs the prompt-UI.
    *
    * @param questions
    * The questions to prompt the user to answer.
    *
    * @returns
    * The answers provided by the user.
    */
  def run(questions: js.Array[DistinctQuestion[Answers]]): js.Promise[Answers] = js.native
  /**
    * Sets the type of the question if no question-type is specified.
    *
    * @param question
    * The question to set the default type for.
    *
    * @returns
    * The processed question.
    */
  /* protected */ def setDefaultType(question: DistinctQuestion[Answers]): Observable[DistinctQuestion[Answers]] = js.native
}

