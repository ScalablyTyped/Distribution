package typings.ionic.libErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/errors", "FatalException")
@js.native
class FatalException () extends BaseException {
  def this(message: String) = this()
  def this(message: String, exitCode: Double) = this()
  @JSName("exitCode")
  var exitCode_FatalException: Double = js.native
  var fatal: Boolean = js.native
}

