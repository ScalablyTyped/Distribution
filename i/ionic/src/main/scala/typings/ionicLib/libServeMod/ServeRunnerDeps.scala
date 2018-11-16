package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeRunnerDeps extends js.Object {
  val config: ionicLib.definitionsMod.IConfig = js.native
  val flags: ionicLib.definitionsMod.IonicEnvironmentFlags = js.native
  val log: ionicLib.definitionsMod.ILogger = js.native
  val project: ionicLib.definitionsMod.IProject = js.native
  @JSName("prompt")
  val prompt_Original: atIonicCliDashFrameworkLib.libPromptsMod.PromptModule = js.native
  val shell: ionicLib.definitionsMod.IShell = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionCheckbox): stdLib.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueCheckbox] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionConfirm): stdLib.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueConfirm] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionOther): stdLib.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueOther] = js.native
}

