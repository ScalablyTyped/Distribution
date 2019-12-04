package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.libCommandMod.Command
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/repair", JSImport.Namespace)
@js.native
object commandsRepairMod extends js.Object {
  @js.native
  class RepairCommand () extends Command {
    def cordovaRepair(cordova: Required[ProjectIntegration], runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

