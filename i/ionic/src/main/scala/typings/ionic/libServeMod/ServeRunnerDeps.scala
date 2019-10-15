package typings.ionic.libServeMod

import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptModule
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueOther
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeRunnerDeps extends js.Object {
  val config: IConfig = js.native
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
  val project: IProject = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val shell: IShell = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

