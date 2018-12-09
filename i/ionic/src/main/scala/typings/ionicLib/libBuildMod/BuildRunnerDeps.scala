package typings
package ionicLib.libBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRunnerDeps extends js.Object {
  val config: ionicLib.definitionsMod.IConfig = js.native
  val log: ionicLib.definitionsMod.ILogger = js.native
  val project: ionicLib.definitionsMod.IProject = js.native
  @JSName("prompt")
  val prompt_Original: atIonicCliDashFrameworkLib.libPromptsMod.PromptModule = js.native
  val shell: ionicLib.definitionsMod.IShell = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionCheckbox): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueCheckbox] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionConfirm): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueConfirm] = js.native
  def prompt(question: atIonicCliDashFrameworkLib.libPromptsMod.PromptQuestionOther): js.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptValueOther] = js.native
}

