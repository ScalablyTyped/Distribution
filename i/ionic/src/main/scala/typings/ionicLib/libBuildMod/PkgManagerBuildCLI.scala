package typings
package ionicLib.libBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerBuildCLI
  extends BuildCLI[ionicLib.definitionsMod.BaseBuildOptions] {
  @JSName("global")
  val global_PkgManagerBuildCLI: ionicLib.ionicLibNumbers.`true` = js.native
  @JSName("program")
  val program_PkgManagerBuildCLI: ionicLib.definitionsMod.NpmClient = js.native
  @JSName("script")
  val script_PkgManagerBuildCLI: ionicLib.ionicLibStrings.`ionic:build` = js.native
}

