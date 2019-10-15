package typings.ionic.definitionsMod

import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptModule
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueOther
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicEnvironment extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

