package typings.ionic

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("ionic/commands/capacitor/base", "CapacitorCommand")
  @js.native
  abstract class CapacitorCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    var _integration: js.Any = js.native
    
    var _runCapacitor: js.Any = js.native
    
    def checkCapacitor(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    
    def integration: RequiredProjectIntegratio = js.native
    
    def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    var promptToInstallCapacitor: js.Any = js.native
    
    def runCapacitor(argList: js.Array[String]): js.Promise[Unit] = js.native
  }
}
