package typings.ionic

import typings.ionic.commandsDeployCoreMod.DeployConfCommand
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeployConfigureMod {
  
  @JSImport("ionic/commands/deploy/configure", "ConfigureCommand")
  @js.native
  open class ConfigureCommand protected () extends DeployConfCommand {
    def this(namespace: INamespace) = this()
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
