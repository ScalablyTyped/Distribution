package typings.atIonicCliDashFramework.errorsMod

import typings.atIonicCliDashFramework.definitionsMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "InputValidationError")
@js.native
class InputValidationError protected () extends BaseError {
  def this(message: String, errors: js.Array[ValidationError]) = this()
  @JSName("code")
  var code_InputValidationError: String = js.native
  var errors: js.Array[ValidationError] = js.native
  @JSName("name")
  val name_InputValidationError: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.InputValidationError = js.native
}

