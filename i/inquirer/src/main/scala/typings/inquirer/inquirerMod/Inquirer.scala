package typings.inquirer.inquirerMod

import typings.inquirer.Anon_BottomBar
import typings.inquirer.Anon_Ui
import typings.inquirer.inquirerMod.objectsNs.SeparatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inquirer extends js.Object {
  var Separator: SeparatorStatic = js.native
  /**
    * Public CLI helper interface
    * @param questions Questions settings array
    * @return
    */
  @JSName("prompt")
  var prompt_Original: PromptModule = js.native
  var prompts: Prompts = js.native
  var ui: Anon_BottomBar = js.native
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
  def prompt[A](questions: Questions[A]): js.Promise[A] with Anon_Ui = js.native
  /**
    * Expose helper functions on the top level for easiest usage by common users
    * @param name
    * @param prompt
    */
  def registerPrompt(name: String, prompt: PromptModule): Unit = js.native
  def restoreDefaultPrompts(): Unit = js.native
}

