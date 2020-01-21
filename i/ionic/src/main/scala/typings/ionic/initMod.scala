package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  @js.native
  class InitCommand () extends Command {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
  
}

