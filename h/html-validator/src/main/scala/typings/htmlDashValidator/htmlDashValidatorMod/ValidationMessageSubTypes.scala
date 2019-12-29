package typings.htmlDashValidator.htmlDashValidatorMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes with String] = js.native
  /* "fatal" */ @js.native
  object fatal extends TopLevel[fatal with String]
  
  /* "internal" */ @js.native
  object internal extends TopLevel[internal with String]
  
  /* "io" */ @js.native
  object io extends TopLevel[io with String]
  
  /* "schema" */ @js.native
  object schema extends TopLevel[schema with String]
  
  /* "warning" */ @js.native
  object warning extends TopLevel[warning with String]
  
}

