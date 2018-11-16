package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Base interface class other can inherits from
         */
@js.native
trait Prompt
  extends BaseUI[inquirerLib.inquirerMod.inquirerNs.Prompts] {
  def fetchAnswer[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): js.Any = js.native
  def filterIfRunnable[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): js.Any = js.native
  /**
               * Once all prompt are over
               */
  def onCompletion(): scala.Unit = js.native
  def processQuestion[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): js.Any = js.native
  def setDefaultType[T](question: inquirerLib.inquirerMod.inquirerNs.Question[T]): js.Any = js.native
}

