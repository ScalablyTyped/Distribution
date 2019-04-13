package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerServeCLI
  extends ServeCLI[ionicLib.definitionsMod.ServeOptions] {
  @JSName("global")
  val global_PkgManagerServeCLI: ionicLib.ionicLibNumbers.`true` = js.native
  @JSName("program")
  val program_PkgManagerServeCLI: ionicLib.definitionsMod.NpmClient = js.native
  @JSName("script")
  val script_PkgManagerServeCLI: ionicLib.ionicLibStrings.`ionic:serve` = js.native
}

