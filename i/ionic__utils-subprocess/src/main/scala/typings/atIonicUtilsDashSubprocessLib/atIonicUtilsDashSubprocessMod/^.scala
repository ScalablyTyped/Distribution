package typings
package atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_COMMAND_NOT_FOUND: atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_COMMAND_NOT_FOUND = js.native
  val ERROR_NON_ZERO_EXIT: atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_NON_ZERO_EXIT = js.native
  val ERROR_SIGNAL_EXIT: atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_SIGNAL_EXIT = js.native
  val TILDE_PATH_REGEX: stdLib.RegExp = js.native
  def convertPATH(): java.lang.String = js.native
  def convertPATH(path: java.lang.String): java.lang.String = js.native
  def expandTildePath(p: java.lang.String): java.lang.String = js.native
  def findExecutables(program: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def findExecutables(program: java.lang.String, hasPATH: WhichOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def fork(modulePath: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  @JSName("fork")
  def fork_stdio(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ForkOptions with (stdLib.Pick[
      nodeLib.childUnderscoreProcessMod.SpawnOptions, 
      atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.stdio
    ])
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def which(program: java.lang.String): js.Promise[java.lang.String] = js.native
  def which(program: java.lang.String, hasPATH: WhichOptions): js.Promise[java.lang.String] = js.native
}

