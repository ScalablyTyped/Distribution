package typings.atIonicCliDashFramework.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "CommandNotFoundError")
@js.native
class CommandNotFoundError protected () extends BaseError {
  def this(message: String, args: js.Array[String]) = this()
  var args: js.Array[String] = js.native
  @JSName("code")
  var code_CommandNotFoundError: String = js.native
  @JSName("name")
  val name_CommandNotFoundError: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.CommandNotFoundError = js.native
}

