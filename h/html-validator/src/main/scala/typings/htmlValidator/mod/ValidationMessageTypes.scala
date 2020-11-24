package typings.htmlValidator.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageTypes extends js.Object
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageTypes")
@js.native
object ValidationMessageTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageTypes with String] = js.native
  
  @js.native
  sealed trait error extends ValidationMessageTypes
  /* "error" */ @js.native
  object error extends TopLevel[error with String]
  
  @js.native
  sealed trait info extends ValidationMessageTypes
  /* "info" */ @js.native
  object info extends TopLevel[info with String]
  
  @js.native
  sealed trait `non-document-error` extends ValidationMessageTypes
  /* "non-document-error" */ @js.native
  object `non-document-error` extends TopLevel[`non-document-error` with String]
}
