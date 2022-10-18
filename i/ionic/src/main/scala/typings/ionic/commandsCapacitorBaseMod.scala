package typings.ionic

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCapacitorBaseMod {
  
  /* note: abstract class */ @JSImport("ionic/commands/capacitor/base", "CapacitorCommand")
  @js.native
  open class CapacitorCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    /* private */ var _integration: Any = js.native
    
    /* private */ var _runCapacitor: Any = js.native
    
    def checkCapacitor(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    
    def integration: RequiredProjectIntegratio = js.native
    
    def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* private */ var promptToInstallCapacitor: Any = js.native
    
    def runCapacitor(argList: js.Array[String]): js.Promise[Unit] = js.native
  }
}
