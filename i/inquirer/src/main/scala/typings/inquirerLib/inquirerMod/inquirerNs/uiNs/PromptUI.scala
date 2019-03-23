package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

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
      /* prompts */ inquirerLib.inquirerMod.inquirerNs.Prompts, 
      /* opt */ inquirerLib.inquirerMod.inquirerNs.StreamOptions, 
      PromptUI
    ] {
  var process: rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.inquirerNs.Answer] = js.native
  def fetchAnswer[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.inquirerNs.Question[T]] = js.native
  def filterIfRunnable[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.inquirerNs.Question[T]] = js.native
  /**
    * Once all prompt are over
    */
  def onCompletion(): scala.Unit = js.native
  def processQuestion[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.inquirerNs.Question[T]] = js.native
  def run[T](questions: inquirerLib.inquirerMod.inquirerNs.Questions[T]): js.Promise[inquirerLib.inquirerMod.inquirerNs.Answers] = js.native
  def setDefaultType[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): rxjsLib.rxjsMod.Observable[inquirerLib.inquirerMod.inquirerNs.Question[T]] = js.native
}

