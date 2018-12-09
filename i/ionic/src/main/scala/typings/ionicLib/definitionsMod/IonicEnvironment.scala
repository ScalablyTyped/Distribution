package typings
package ionicLib.definitionsMod

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
  val prompt_Original: atIonicCliDashFrameworkLib.libPromptsMod.PromptModule = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionCheckbox): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueCheckbox] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionConfirm): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueConfirm] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionOther): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueOther] = js.native
}

