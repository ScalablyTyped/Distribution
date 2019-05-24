package typings
package inquirerLib.inquirerMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface class other can inherits from
  */
@js.native
trait PromptUI
  extends BaseUI
     with org.scalablytyped.runtime.Instantiable2[
      /* prompts */ inquirerLib.inquirerMod.Prompts, 
      /* opt */ inquirerLib.inquirerMod.StreamOptions, 
      PromptUI
    ] {
  var process: rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.Answer] = js.native
  def fetchAnswer[A](question: inquirerLib.inquirerMod.Question[A]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.Question[A]] = js.native
  def filterIfRunnable[A](question: inquirerLib.inquirerMod.Question[A]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.Question[A]] = js.native
  /**
    * Once all prompt are over
    */
  def onCompletion(): scala.Unit = js.native
  def processQuestion[A](question: inquirerLib.inquirerMod.Question[A]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.Question[A]] = js.native
  def run[A](questions: inquirerLib.inquirerMod.Questions[A]): js.Promise[A] = js.native
  def setDefaultType[A](question: inquirerLib.inquirerMod.Question[A]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.Question[A]] = js.native
}

