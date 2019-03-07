package typings
package atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "Subprocess")
@js.native
class Subprocess protected () extends js.Object {
  def this(name: java.lang.String, args: js.Array[java.lang.String]) = this()
  def this(name: java.lang.String, args: js.Array[java.lang.String], options: SubprocessOptions) = this()
  var _options: nodeLib.childUnderscoreProcessMod.SpawnOptions = js.native
  var args: js.Array[java.lang.String] = js.native
  var name: java.lang.String = js.native
  val options: stdLib.Readonly[nodeLib.childUnderscoreProcessMod.SpawnOptions] = js.native
  val path: js.UndefOr[java.lang.String] = js.native
  def bashify(): java.lang.String = js.native
  def bashify(hasMaskArgv0MaskArgv1ShiftArgv0: SubprocessBashifyOptions): java.lang.String = js.native
  def bashifyArg(arg: java.lang.String): java.lang.String = js.native
  def combinedOutput(): js.Promise[java.lang.String] = js.native
  def maskArg(arg: java.lang.String): java.lang.String = js.native
  def output(): js.Promise[java.lang.String] = js.native
  def run(): js.Promise[scala.Unit] with atIonicUtilsDashSubprocessLib.Anon_P = js.native
  def spawn(): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
}

