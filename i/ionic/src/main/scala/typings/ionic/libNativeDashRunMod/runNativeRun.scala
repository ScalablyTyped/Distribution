package typings.ionic.libNativeDashRunMod

import typings.ionic.definitionsMod.IShellRunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/native-run", "runNativeRun")
@js.native
object runNativeRun extends js.Object {
  def apply(hasConfigLogShell: RunNativeRunDeps, args: js.Array[String]): js.Promise[Unit] = js.native
  def apply(hasConfigLogShell: RunNativeRunDeps, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = js.native
}

