package typings.ionic

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRepairMod {
  
  @JSImport("ionic/commands/repair", "RepairCommand")
  @js.native
  open class RepairCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def cordovaRepair(cordova: RequiredProjectIntegratio, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
  }
}
