package typings.htmlValidator.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageSubTypes extends js.Object
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageSubTypes")
@js.native
object ValidationMessageSubTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes with String] = js.native
  
  @js.native
  sealed trait fatal extends ValidationMessageSubTypes
  /* "fatal" */ @js.native
  object fatal extends TopLevel[fatal with String]
  
  @js.native
  sealed trait internal extends ValidationMessageSubTypes
  /* "internal" */ @js.native
  object internal extends TopLevel[internal with String]
  
  @js.native
  sealed trait io extends ValidationMessageSubTypes
  /* "io" */ @js.native
  object io extends TopLevel[io with String]
  
  @js.native
  sealed trait schema extends ValidationMessageSubTypes
  /* "schema" */ @js.native
  object schema extends TopLevel[schema with String]
  
  @js.native
  sealed trait warning extends ValidationMessageSubTypes
  /* "warning" */ @js.native
  object warning extends TopLevel[warning with String]
}
