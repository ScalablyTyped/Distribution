package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.ValidationError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@ionic/cli-framework/errors", "BaseError")
  @js.native
  abstract class BaseError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[js.Error] = js.native
    
    var exitCode: js.UndefOr[Double] = js.native
    
    def inspect(): String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("stack")
    var stack_BaseError: String = js.native
  }
  
  @JSImport("@ionic/cli-framework/errors", "CommandNotFoundError")
  @js.native
  open class CommandNotFoundError protected () extends BaseError {
    def this(message: String, args: js.Array[String]) = this()
    
    var args: js.Array[String] = js.native
    
    @JSName("code")
    var code_CommandNotFoundError: String = js.native
  }
  
  @JSImport("@ionic/cli-framework/errors", "ERROR_COMMAND_NOT_FOUND")
  @js.native
  val ERROR_COMMAND_NOT_FOUND: /* "ERR_ICF_COMMAND_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/cli-framework/errors", "ERROR_INPUT_VALIDATION")
  @js.native
  val ERROR_INPUT_VALIDATION: /* "ERR_ICF_INPUT_VALIDATION" */ String = js.native
  
  @JSImport("@ionic/cli-framework/errors", "ERROR_IPC_MODULE_INACCESSIBLE")
  @js.native
  val ERROR_IPC_MODULE_INACCESSIBLE: /* "ERR_ICF_IPC_MODULE_INACCESSIBLE" */ String = js.native
  
  @JSImport("@ionic/cli-framework/errors", "ERROR_IPC_UNKNOWN_PROCEDURE")
  @js.native
  val ERROR_IPC_UNKNOWN_PROCEDURE: /* "ERR_ICF_IPC_UNKNOWN_PROCEDURE" */ String = js.native
  
  @JSImport("@ionic/cli-framework/errors", "IPCError")
  @js.native
  open class IPCError protected () extends BaseError {
    def this(message: String) = this()
  }
  
  @JSImport("@ionic/cli-framework/errors", "InputValidationError")
  @js.native
  open class InputValidationError protected () extends BaseError {
    def this(message: String, errors: js.Array[ValidationError]) = this()
    
    @JSName("code")
    var code_InputValidationError: String = js.native
    
    var errors: js.Array[ValidationError] = js.native
  }
}
