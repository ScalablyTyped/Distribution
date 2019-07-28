package typings.ionic.libBuildMod

import typings.ionic.definitionsMod.BaseBuildOptions
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.ionicNumbers.`true`
import typings.ionic.ionicStrings.`ionic:build`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerBuildCLI extends BuildCLI[BaseBuildOptions] {
  @JSName("global")
  val global_PkgManagerBuildCLI: `true` = js.native
  @JSName("program")
  val program_PkgManagerBuildCLI: NpmClient = js.native
  @JSName("script")
  val script_PkgManagerBuildCLI: `ionic:build` = js.native
}

