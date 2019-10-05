package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERR_ICF_COMMAND_NOT_FOUND
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERR_ICF_INPUT_VALIDATION
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERR_ICF_IPC_MODULE_INACCESSIBLE
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERR_ICF_IPC_UNKNOWN_PROCEDURE
import typings.atIonicCliDashFramework.definitionsMod.ValidationError
import typings.atIonicCliDashFramework.errorsMod.BaseError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  abstract class BaseError protected () extends Error {
    def this(message: String) = this()
    var code: js.UndefOr[String] = js.native
    var error: js.UndefOr[Error] = js.native
    var exitCode: js.UndefOr[Double] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("stack")
    var stack_BaseError: String = js.native
    def inspect(): String = js.native
  }
  
  @js.native
  class CommandNotFoundError protected () extends BaseError {
    def this(message: String, args: js.Array[String]) = this()
    var args: js.Array[String] = js.native
    @JSName("code")
    var code_CommandNotFoundError: String = js.native
    @JSName("name")
    val name_CommandNotFoundError: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.CommandNotFoundError = js.native
  }
  
  @js.native
  class IPCError () extends BaseError {
    @JSName("name")
    val name_IPCError: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.IPCError = js.native
  }
  
  @js.native
  class InputValidationError protected () extends BaseError {
    def this(message: String, errors: js.Array[ValidationError]) = this()
    @JSName("code")
    var code_InputValidationError: String = js.native
    var errors: js.Array[ValidationError] = js.native
    @JSName("name")
    val name_InputValidationError: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.InputValidationError = js.native
  }
  
  val ERROR_COMMAND_NOT_FOUND: ERR_ICF_COMMAND_NOT_FOUND = js.native
  val ERROR_INPUT_VALIDATION: ERR_ICF_INPUT_VALIDATION = js.native
  val ERROR_IPC_MODULE_INACCESSIBLE: ERR_ICF_IPC_MODULE_INACCESSIBLE = js.native
  val ERROR_IPC_UNKNOWN_PROCEDURE: ERR_ICF_IPC_UNKNOWN_PROCEDURE = js.native
}

