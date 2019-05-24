package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  def apply[A](questions: Questions[A]): js.Promise[A] with inquirerLib.Anon_Ui = js.native
  /**
    * Register a prompt type
    * @param name Prompt type name
    * @param prompt Prompt constructor
    */
  def registerPrompt(name: java.lang.String, prompt: inquirerLib.inquirerMod.promptsNs.Base): PromptModule = js.native
  /**
    * Register the defaults provider prompts
    */
  def restoreDefaultPrompts(): scala.Unit = js.native
}

