package typings.intlTelInput.mod.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait validationError extends js.Object
@JSImport("intl-tel-input", "intlTelInputUtils.validationError")
@js.native
object validationError extends js.Object {
  
  @js.native
  sealed trait INVALID_COUNTRY_CODE extends validationError
  
  @js.native
  sealed trait IS_POSSIBLE extends validationError
  
  @js.native
  sealed trait NOT_A_NUMBER extends validationError
  
  @js.native
  sealed trait TOO_LONG extends validationError
  
  @js.native
  sealed trait TOO_SHORT extends validationError
}
