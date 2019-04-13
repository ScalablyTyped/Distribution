package typings
package atIonicCliDashFrameworkLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "CommandNotFoundError")
@js.native
class CommandNotFoundError protected () extends BaseError {
  def this(message: java.lang.String, args: js.Array[java.lang.String]) = this()
  var args: js.Array[java.lang.String] = js.native
  @JSName("code")
  var code_CommandNotFoundError: java.lang.String = js.native
  @JSName("name")
  val name_CommandNotFoundError: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.CommandNotFoundError = js.native
}

