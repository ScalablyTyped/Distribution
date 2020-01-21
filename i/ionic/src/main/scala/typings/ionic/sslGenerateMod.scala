package typings.ionic

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.sslBaseMod.SSLBaseCommand
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/ssl/generate", JSImport.Namespace)
@js.native
object sslGenerateMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class SSLGenerateCommand () extends SSLBaseCommand {
    var checkExistingFile: js.Any = js.native
    var ensureDirectory: js.Any = js.native
    var formatSubj: js.Any = js.native
    var writeConfig: js.Any = js.native
    def getDefaultCertPath(): String = js.native
    def getDefaultKeyPath(): String = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

