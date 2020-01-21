package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.IShellRunOptions
import typings.ionic.definitionsMod.ProjectIntegration
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/cordova/base", JSImport.Namespace)
@js.native
object cordovaBaseMod extends js.Object {
  @js.native
  abstract class CordovaCommand () extends Command {
    var _integration: js.UndefOr[js.Any] = js.native
    /* protected */ def checkCordova(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    /* protected */ def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    /* protected */ def checkForPlatformInstallation(platform: String, hasPromptToInstallPromptToInstallRefusalMsg: AnonPromptToInstall): js.Promise[Unit] = js.native
    /* protected */ def integration(): Required[ProjectIntegration] = js.native
    /* protected */ def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    /* protected */ def runCordova(argList: js.Array[String]): js.Promise[Unit] = js.native
    /* protected */ def runCordova(argList: js.Array[String], hasFatalOnNotFoundTruncateErrorOutputOptions: IShellRunOptions): js.Promise[Unit] = js.native
  }
  
  val CORDOVA_BUILD_EXAMPLE_COMMANDS: js.Array[String] = js.native
  val CORDOVA_COMPILE_OPTIONS: js.Array[CommandMetadataOption] = js.native
  val CORDOVA_RUN_OPTIONS: js.Array[CommandMetadataOption] = js.native
}

