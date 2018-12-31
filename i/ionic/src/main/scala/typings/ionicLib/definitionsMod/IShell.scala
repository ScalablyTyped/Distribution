package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShell extends js.Object {
  def alterPath(path: java.lang.String): java.lang.String = js.native
  def cmdinfo(cmd: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def cmdinfo(cmd: java.lang.String, args: js.Array[java.lang.String]): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def cmdinfo(
    cmd: java.lang.String,
    args: js.Array[java.lang.String],
    options: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ShellCommandOptions */ js.Any
  ): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def output(command: java.lang.String, args: js.Array[java.lang.String], options: IShellOutputOptions): js.Promise[java.lang.String] = js.native
  def run(command: java.lang.String, args: js.Array[java.lang.String], options: IShellRunOptions): js.Promise[scala.Unit] = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: IShellSpawnOptions): js.Promise[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
}

