package typings.ionic.libGenerateMod

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.GenerateOptions
import typings.ionic.definitionsMod.Runner
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/generate", "GenerateRunner")
@js.native
abstract class GenerateRunner[T /* <: GenerateOptions */] () extends Runner[T, Unit] {
  val e: GenerateRunnerDeps = js.native
  def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
  def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  def getCommandMetadata(): js.Promise[Partial[CommandMetadata]] = js.native
  /* CompleteClass */
  override def run(options: T): js.Promise[Unit] = js.native
}

