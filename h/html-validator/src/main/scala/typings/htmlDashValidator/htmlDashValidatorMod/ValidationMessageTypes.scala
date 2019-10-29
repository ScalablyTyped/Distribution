package typings.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationMessageTypes extends js.Object

// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageTypes")
@js.native
object ValidationMessageTypes extends js.Object {
  @js.native
  sealed trait error extends ValidationMessageTypes
  
  @js.native
  sealed trait info extends ValidationMessageTypes
  
  @js.native
  sealed trait `non-document-error` extends ValidationMessageTypes
  
  /* "error" */ val error: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageTypes.error with String = js.native
  /* "info" */ val info: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageTypes.info with String = js.native
  /* "non-document-error" */ val `non-document-error`: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageTypes.`non-document-error` with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageTypes with String] = js.native
}

