package typings.ionic.libProjectMod

import typings.atIonicCliDashFramework.libPromptsMod.PromptModule
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFramework.libPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFramework.libPromptsMod.PromptValueOther
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDeps extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

