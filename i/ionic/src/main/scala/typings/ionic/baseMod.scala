package typings.ionic

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/capacitor/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  abstract class CapacitorCommand () extends Command {
    var _integration: js.Any = js.native
    var _runCapacitor: js.Any = js.native
    var promptToInstallCapacitor: js.Any = js.native
    def checkCapacitor(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    def integration: RequiredProjectIntegratio = js.native
    def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def runCapacitor(argList: js.Array[String]): js.Promise[Unit] = js.native
  }
  
}

