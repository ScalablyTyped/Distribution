package typings
package ionicLib.libGenerateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/generate", "GenerateRunner")
@js.native
abstract class GenerateRunner[T /* <: ionicLib.definitionsMod.GenerateOptions */] ()
  extends ionicLib.definitionsMod.Runner[T, scala.Unit] {
  val e: GenerateRunnerDeps = js.native
  def createOptionsFromCommandLine(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): ionicLib.definitionsMod.GenerateOptions = js.native
  def ensureCommandLine(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): stdLib.Promise[scala.Unit] = js.native
  def getCommandMetadata(): stdLib.Promise[stdLib.Partial[ionicLib.definitionsMod.CommandMetadata]] = js.native
  /* CompleteClass */
  override def run(options: T): stdLib.Promise[scala.Unit] = js.native
}

