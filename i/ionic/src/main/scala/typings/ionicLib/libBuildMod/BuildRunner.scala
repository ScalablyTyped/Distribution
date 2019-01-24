package typings
package ionicLib.libBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/build", "BuildRunner")
@js.native
abstract class BuildRunner[T /* <: ionicLib.definitionsMod.BuildOptions[_] */] ()
  extends ionicLib.definitionsMod.Runner[T, scala.Unit] {
  val e: BuildRunnerDeps = js.native
  def afterBuild(options: T): js.Promise[scala.Unit] = js.native
  def beforeBuild(options: T): js.Promise[scala.Unit] = js.native
  def buildProject(options: T): js.Promise[scala.Unit] = js.native
  def createBaseOptionsFromCommandLine(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): ionicLib.definitionsMod.BaseBuildOptions = js.native
  def createOptionsFromCommandLine(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): T = js.native
  def determineEngineFromCommandLine(options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions): java.lang.String = js.native
  def getCommandMetadata(): js.Promise[stdLib.Partial[ionicLib.definitionsMod.CommandMetadata]] = js.native
  def getPkgManagerBuildCLI(): PkgManagerBuildCLI = js.native
  /* CompleteClass */
  override def run(options: T): js.Promise[scala.Unit] = js.native
}

