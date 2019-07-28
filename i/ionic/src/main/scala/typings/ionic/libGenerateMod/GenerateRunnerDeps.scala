package typings.ionic.libGenerateMod

import typings.atIonicCliDashFramework.libPromptsMod.PromptModule
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueOther
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateRunnerDeps extends js.Object {
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val log: ILogger = js.native
  val project: IProject = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val shell: IShell = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

