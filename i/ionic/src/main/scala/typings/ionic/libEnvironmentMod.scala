package typings.ionic

import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptModule
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueOther
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionic.libEnvironmentMod.EnvironmentDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/environment", JSImport.Namespace)
@js.native
object libEnvironmentMod extends js.Object {
  @js.native
  class Environment protected () extends IonicEnvironment {
    def this(hasClientConfigFlagsGetInfoLogCtxPromptSessionShell: EnvironmentDeps) = this()
  }
  
  @js.native
  trait EnvironmentDeps extends js.Object {
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
  
}

