package typings.ionic

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.sshBaseMod.SSHBaseCommand
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/ssh/setup", JSImport.Namespace)
@js.native
object setupMod extends js.Object {
  
  @js.native
  class SSHSetupCommand () extends SSHBaseCommand {
    
    def preRun(): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
