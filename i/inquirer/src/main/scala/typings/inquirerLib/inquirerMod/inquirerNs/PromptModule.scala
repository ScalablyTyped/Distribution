package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  def apply[T](questions: Questions[T]): js.Promise[T] with inquirerLib.Anon_Ui = js.native
  /**
    * Register a prompt type
    * @param name Prompt type name
    * @param prompt Prompt constructor
    */
  def registerPrompt(name: java.lang.String, prompt: inquirerLib.inquirerMod.inquirerNs.promptsNs.Base): PromptModule = js.native
  /**
    * Register the defaults provider prompts
    */
  def restoreDefaultPrompts(): scala.Unit = js.native
}

