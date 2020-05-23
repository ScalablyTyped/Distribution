package typings.ionic

import typings.ionic.baseMod.CapacitorCommand
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/capacitor/run", JSImport.Namespace)
@js.native
object runMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class RunCommand () extends CapacitorCommand {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def runBuild(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def runServe(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
  
}

