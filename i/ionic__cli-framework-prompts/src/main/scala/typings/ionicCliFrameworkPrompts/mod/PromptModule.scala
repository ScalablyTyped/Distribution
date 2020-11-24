package typings.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptModule extends js.Object {
  
  def apply(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def apply(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def apply(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  
  val _inquirer: Inquirer = js.native
}
