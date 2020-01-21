package typings.htmlValidator.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageTypes with String] = js.native
  /* "error" */ @js.native
  object error extends TopLevel[error with String]
  
  /* "info" */ @js.native
  object info extends TopLevel[info with String]
  
  /* "non-document-error" */ @js.native
  object `non-document-error` extends TopLevel[`non-document-error` with String]
  
}

