package typings
package ionicLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", "Executor")
@js.native
class Executor protected ()
  extends atIonicCliDashFrameworkLib.cliDashFrameworkMod.AbstractExecutor[
      ionicLib.definitionsMod.ICommand, 
      ionicLib.definitionsMod.INamespace, 
      ionicLib.definitionsMod.CommandMetadata, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      ionicLib.definitionsMod.CommandMetadataOption
    ] {
  def this(hasNamespace: ExecutorDeps) = this()
  def run(
    command: ionicLib.definitionsMod.ICommand,
    cmdargs: js.Array[java.lang.String],
    hasLocationEnvExecutor: ionicLib.definitionsMod.CommandInstanceInfo
  ): js.Promise[scala.Unit] = js.native
}

