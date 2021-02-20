package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageTypes extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageTypes")
@js.native
object ValidationMessageTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageTypes with String] = js.native
  
  @js.native
  sealed trait error extends ValidationMessageTypes
  /* "error" */ val error: typings.htmlValidator.mod.ValidationMessageTypes.error with String = js.native
  
  @js.native
  sealed trait info extends ValidationMessageTypes
  /* "info" */ val info: typings.htmlValidator.mod.ValidationMessageTypes.info with String = js.native
  
  @js.native
  sealed trait `non-document-error` extends ValidationMessageTypes
  /* "non-document-error" */ val `non-document-error`: typings.htmlValidator.mod.ValidationMessageTypes.`non-document-error` with String = js.native
}
