package typings.inquirer.inquirerMod.uiNs

import org.scalablytyped.runtime.Instantiable2
import typings.inquirer.inquirerMod.Answer
import typings.inquirer.inquirerMod.Prompts
import typings.inquirer.inquirerMod.Question
import typings.inquirer.inquirerMod.Questions
import typings.inquirer.inquirerMod.StreamOptions
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface class other can inherits from
  */
@js.native
trait PromptUI
  extends BaseUI
     with Instantiable2[/* prompts */ Prompts, /* opt */ StreamOptions, PromptUI] {
  var process: Observable[Answer] = js.native
  def fetchAnswer[A](question: Question[A]): Observable[Question[A]] = js.native
  def filterIfRunnable[A](question: Question[A]): Observable[Question[A]] = js.native
  /**
    * Once all prompt are over
    */
  def onCompletion(): Unit = js.native
  def processQuestion[A](question: Question[A]): Observable[Question[A]] = js.native
  def run[A](questions: Questions[A]): js.Promise[A] = js.native
  def setDefaultType[A](question: Question[A]): Observable[Question[A]] = js.native
}

