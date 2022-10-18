package typings.ionic

import typings.ionic.commandsDeployCoreMod.DeployConfCommand
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeployAddMod {
  
  @JSImport("ionic/commands/deploy/add", "AddCommand")
  @js.native
  open class AddCommand protected () extends DeployConfCommand {
    def this(namespace: INamespace) = this()
    
    /* protected */ def buildCordovaDeployOptions(options: CommandLineOptions): js.Array[String] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
