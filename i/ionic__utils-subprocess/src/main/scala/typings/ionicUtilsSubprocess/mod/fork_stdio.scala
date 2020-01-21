package typings.ionicUtilsSubprocess.mod

import typings.ionicUtilsSubprocess.ionicUtilsSubprocessStrings.stdio
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ForkOptions
import typings.node.childProcessMod.SpawnOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "fork")
@js.native
object fork_stdio extends js.Object {
  def apply(modulePath: String, args: js.Array[String], options: ForkOptions with (Pick[SpawnOptions, stdio])): ChildProcess = js.native
}

