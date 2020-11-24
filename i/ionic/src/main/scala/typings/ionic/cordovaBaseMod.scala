package typings.ionic

import typings.ionic.anon.PromptToInstall
import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.IShellRunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/cordova/base", JSImport.Namespace)
@js.native
object cordovaBaseMod extends js.Object {
  
  val CORDOVA_BUILD_EXAMPLE_COMMANDS: js.Array[String] = js.native
  
  val CORDOVA_COMPILE_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  val CORDOVA_RUN_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @js.native
  abstract class CordovaCommand () extends Command {
    
    var _integration: js.Any = js.native
    
    /* protected */ def checkCordova(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* protected */ def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    /* protected */ def checkForPlatformInstallation(platform: String, hasPromptToInstallPromptToInstallRefusalMsg: PromptToInstall): js.Promise[Unit] = js.native
    
    /* protected */ def integration: RequiredProjectIntegratio = js.native
    
    /* protected */ def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* protected */ def runCordova(argList: js.Array[String]): js.Promise[Unit] = js.native
    /* protected */ def runCordova(argList: js.Array[String], hasFatalOnNotFoundTruncateErrorOutputOptions: IShellRunOptions): js.Promise[Unit] = js.native
  }
}
