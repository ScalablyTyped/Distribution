package typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod

import typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.ERR_SUBPROCESS_COMMAND_NOT_FOUND
import typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.ERR_SUBPROCESS_NON_ZERO_EXIT
import typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.ERR_SUBPROCESS_SIGNAL_EXIT
import typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.stdio
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ForkOptions
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.std.Pick
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_COMMAND_NOT_FOUND: ERR_SUBPROCESS_COMMAND_NOT_FOUND = js.native
  val ERROR_NON_ZERO_EXIT: ERR_SUBPROCESS_NON_ZERO_EXIT = js.native
  val ERROR_SIGNAL_EXIT: ERR_SUBPROCESS_SIGNAL_EXIT = js.native
  val TILDE_PATH_REGEX: RegExp = js.native
  def convertPATH(): String = js.native
  def convertPATH(path: String): String = js.native
  def expandTildePath(p: String): String = js.native
  def findExecutables(program: String): js.Promise[js.Array[String]] = js.native
  def findExecutables(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[js.Array[String]] = js.native
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  @JSName("fork")
  def fork_stdio(modulePath: String, args: js.Array[String], options: ForkOptions with (Pick[SpawnOptions, stdio])): ChildProcess = js.native
  def spawn(command: String): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def which(program: String): js.Promise[String] = js.native
  def which(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[String] = js.native
}

