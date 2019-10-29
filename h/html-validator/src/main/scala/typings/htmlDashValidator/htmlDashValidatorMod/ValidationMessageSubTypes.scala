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
  sealed trait fatal extends ValidationMessageSubTypes
  
  @js.native
  sealed trait internal extends ValidationMessageSubTypes
  
  @js.native
  sealed trait io extends ValidationMessageSubTypes
  
  @js.native
  sealed trait schema extends ValidationMessageSubTypes
  
  @js.native
  sealed trait warning extends ValidationMessageSubTypes
  
  /* "fatal" */ val fatal: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.fatal with String = js.native
  /* "internal" */ val internal: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.internal with String = js.native
  /* "io" */ val io: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.io with String = js.native
  /* "schema" */ val schema: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.schema with String = js.native
  /* "warning" */ val warning: typings.htmlDashValidator.htmlDashValidatorMod.ValidationMessageSubTypes.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes with String] = js.native
}

