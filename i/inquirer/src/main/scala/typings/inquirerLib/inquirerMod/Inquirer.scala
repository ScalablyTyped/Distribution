package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inquirer extends js.Object {
  var Separator: inquirerLib.inquirerMod.objectsNs.SeparatorStatic = js.native
  /**
    * Public CLI helper interface
    * @param questions Questions settings array
    * @return
    */
  @JSName("prompt")
  var prompt_Original: PromptModule = js.native
  var prompts: Prompts = js.native
  var ui: inquirerLib.Anon_BottomBar = js.native
  /**
    * Create a new self-contained prompt module.
    * @param opt Object specifying input and output streams for the prompt
    */
  def createPromptModule(): PromptModule = js.native
  def createPromptModule(opt: StreamOptions): PromptModule = js.native
  /**
    * Public CLI helper interface
    * @param questions Questions settings array
    * @return
    */
  def prompt[A](questions: Questions[A]): js.Promise[A] with inquirerLib.Anon_Ui = js.native
  /**
    * Expose helper functions on the top level for easiest usage by common users
    * @param name
    * @param prompt
    */
  def registerPrompt(name: java.lang.String, prompt: PromptModule): scala.Unit = js.native
  def restoreDefaultPrompts(): scala.Unit = js.native
}

