package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageSubTypes extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageSubTypes")
@js.native
object ValidationMessageSubTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes with String] = js.native
  
  @js.native
  sealed trait fatal extends ValidationMessageSubTypes
  /* "fatal" */ val fatal: typings.htmlValidator.mod.ValidationMessageSubTypes.fatal with String = js.native
  
  @js.native
  sealed trait internal extends ValidationMessageSubTypes
  /* "internal" */ val internal: typings.htmlValidator.mod.ValidationMessageSubTypes.internal with String = js.native
  
  @js.native
  sealed trait io extends ValidationMessageSubTypes
  /* "io" */ val io: typings.htmlValidator.mod.ValidationMessageSubTypes.io with String = js.native
  
  @js.native
  sealed trait schema extends ValidationMessageSubTypes
  /* "schema" */ val schema: typings.htmlValidator.mod.ValidationMessageSubTypes.schema with String = js.native
  
  @js.native
  sealed trait warning extends ValidationMessageSubTypes
  /* "warning" */ val warning: typings.htmlValidator.mod.ValidationMessageSubTypes.warning with String = js.native
}
