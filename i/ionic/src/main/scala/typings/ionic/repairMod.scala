package typings.ionic

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repairMod {
  
  @JSImport("ionic/commands/repair", "RepairCommand")
  @js.native
  class RepairCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def cordovaRepair(cordova: RequiredProjectIntegratio, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
