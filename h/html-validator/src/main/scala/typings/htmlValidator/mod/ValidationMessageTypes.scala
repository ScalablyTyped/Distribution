package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageTypes extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageTypes")
@js.native
object ValidationMessageTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageTypes & String] = js.native
  
  @js.native
  sealed trait error
    extends StObject
       with ValidationMessageTypes
  /* "error" */ val error: typings.htmlValidator.mod.ValidationMessageTypes.error & String = js.native
  
  @js.native
  sealed trait info
    extends StObject
       with ValidationMessageTypes
  /* "info" */ val info: typings.htmlValidator.mod.ValidationMessageTypes.info & String = js.native
  
  @js.native
  sealed trait `non-document-error`
    extends StObject
       with ValidationMessageTypes
  /* "non-document-error" */ val `non-document-error`: typings.htmlValidator.mod.ValidationMessageTypes.`non-document-error` & String = js.native
}
