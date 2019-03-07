package typings
package atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "SubprocessError")
@js.native
class SubprocessError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
  var code: js.UndefOr[
    atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_COMMAND_NOT_FOUND | atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_NON_ZERO_EXIT | atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessLibStrings.ERR_SUBPROCESS_SIGNAL_EXIT
  ] = js.native
  var error: js.UndefOr[nodeLib.Error] = js.native
  var exitCode: js.UndefOr[scala.Double] = js.native
  var message: java.lang.String = js.native
  val name: /* SubprocessError */ java.lang.String = js.native
  var output: js.UndefOr[java.lang.String] = js.native
  var signal: js.UndefOr[java.lang.String] = js.native
  @JSName("stack")
  var stack_SubprocessError: java.lang.String = js.native
}

