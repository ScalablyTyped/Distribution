package typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod

import typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.stdio
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ForkOptions
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "fork")
@js.native
object fork_stdio extends js.Object {
  def apply(modulePath: String, args: js.Array[String], options: ForkOptions with (Pick[SpawnOptions, stdio])): ChildProcess = js.native
}

