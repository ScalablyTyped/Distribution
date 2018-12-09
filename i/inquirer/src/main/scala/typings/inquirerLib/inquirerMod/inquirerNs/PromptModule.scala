package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  def apply[T](questions: Questions[T]): js.Promise[T] = js.native
  def apply[T](questions: Questions[T], cb: js.Function1[/* answers */ T, _]): inquirerLib.inquirerMod.inquirerNs.uiNs.Prompt = js.native
  /**
           * Register a prompt type
           * @param name Prompt type name
           * @param prompt Prompt constructor
           */
  def registerPrompt(name: java.lang.String, prompt: PromptModule): inquirerLib.inquirerMod.inquirerNs.uiNs.Prompt = js.native
  /**
           * Register the defaults provider prompts
           */
  def restoreDefaultPrompts(): scala.Unit = js.native
}

