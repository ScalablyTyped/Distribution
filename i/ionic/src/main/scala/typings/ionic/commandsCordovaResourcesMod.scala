package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.commandsCordovaBaseMod.CordovaCommand
import typings.ionic.definitionsMod.CommandInstanceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/cordova/resources", JSImport.Namespace)
@js.native
object commandsCordovaResourcesMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class ResourcesCommand () extends CordovaCommand {
    def getBuildPlatforms(): js.Promise[js.Array[String]] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def runCordovaRes(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runCordovaRes(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
  
}

