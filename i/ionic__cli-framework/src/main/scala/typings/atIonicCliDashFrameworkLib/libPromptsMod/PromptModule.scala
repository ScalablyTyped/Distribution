package typings
package atIonicCliDashFrameworkLib.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  val _inquirer: inquirerLib.inquirerMod.inquirerNs.Inquirer = js.native
  def apply(question: PromptQuestionCheckbox): stdLib.Promise[PromptValueCheckbox] = js.native
  def apply(question: PromptQuestionConfirm): stdLib.Promise[PromptValueConfirm] = js.native
  def apply(question: PromptQuestionOther): stdLib.Promise[PromptValueOther] = js.native
}

