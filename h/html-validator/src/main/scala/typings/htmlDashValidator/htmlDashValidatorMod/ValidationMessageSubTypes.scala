package typings.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationMessageSubTypes extends js.Object

// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageSubTypes")
@js.native
object ValidationMessageSubTypes extends js.Object {
  @js.native
  sealed trait warning extends ValidationMessageSubTypes
  
  /* "warning" */ val warning: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes with String] = js.native
}

