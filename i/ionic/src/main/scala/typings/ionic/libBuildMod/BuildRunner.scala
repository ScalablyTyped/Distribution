package typings.ionic.libBuildMod

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.BaseBuildOptions
import typings.ionic.definitionsMod.BuildOptions
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.Runner
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/build", "BuildRunner")
@js.native
abstract class BuildRunner[T /* <: BuildOptions[_] */] () extends Runner[T, Unit] {
  val e: BuildRunnerDeps = js.native
  def afterBuild(options: T): js.Promise[Unit] = js.native
  def beforeBuild(options: T): js.Promise[Unit] = js.native
  def buildProject(options: T): js.Promise[Unit] = js.native
  def createBaseOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): BaseBuildOptions = js.native
  def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): T = js.native
  def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
  def getCommandMetadata(): js.Promise[Partial[CommandMetadata]] = js.native
  def getPkgManagerBuildCLI(): PkgManagerBuildCLI = js.native
  /* CompleteClass */
  override def run(options: T): js.Promise[Unit] = js.native
}

