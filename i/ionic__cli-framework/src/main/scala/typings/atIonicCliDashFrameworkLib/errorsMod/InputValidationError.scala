package typings
package atIonicCliDashFrameworkLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "InputValidationError")
@js.native
class InputValidationError protected () extends BaseError {
  def this(message: java.lang.String, errors: js.Array[atIonicCliDashFrameworkLib.definitionsMod.ValidationError]) = this()
  @JSName("code")
  var code_InputValidationError: java.lang.String = js.native
  var errors: js.Array[atIonicCliDashFrameworkLib.definitionsMod.ValidationError] = js.native
  @JSName("name")
  val name_InputValidationError: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.InputValidationError = js.native
}

