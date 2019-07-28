package typings.ionic.libServeMod

import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.ServeOptions
import typings.ionic.ionicNumbers.`true`
import typings.ionic.ionicStrings.`ionic:serve`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerServeCLI extends ServeCLI[ServeOptions] {
  @JSName("global")
  val global_PkgManagerServeCLI: `true` = js.native
  @JSName("program")
  val program_PkgManagerServeCLI: NpmClient = js.native
  @JSName("script")
  val script_PkgManagerServeCLI: `ionic:serve` = js.native
}

