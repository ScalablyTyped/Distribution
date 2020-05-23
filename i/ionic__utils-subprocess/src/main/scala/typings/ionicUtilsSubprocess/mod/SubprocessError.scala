package typings.ionicUtilsSubprocess.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "SubprocessError")
@js.native
class SubprocessError protected () extends Error {
  def this(message: String) = this()
  var code: js.UndefOr[/* "ERR_SUBPROCESS_COMMAND_NOT_FOUND" */ String] = js.native
  var error: js.UndefOr[Error] = js.native
  var exitCode: js.UndefOr[Double] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var output: js.UndefOr[String] = js.native
  var signal: js.UndefOr[String] = js.native
  @JSName("stack")
  var stack_SubprocessError: String = js.native
}

