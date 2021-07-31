package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationMessageSubTypes extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationMessageSubTypes")
@js.native
object ValidationMessageSubTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationMessageSubTypes & String] = js.native
  
  @js.native
  sealed trait fatal
    extends StObject
       with ValidationMessageSubTypes
  /* "fatal" */ val fatal: typings.htmlValidator.mod.ValidationMessageSubTypes.fatal & String = js.native
  
  @js.native
  sealed trait internal
    extends StObject
       with ValidationMessageSubTypes
  /* "internal" */ val internal: typings.htmlValidator.mod.ValidationMessageSubTypes.internal & String = js.native
  
  @js.native
  sealed trait io
    extends StObject
       with ValidationMessageSubTypes
  /* "io" */ val io: typings.htmlValidator.mod.ValidationMessageSubTypes.io & String = js.native
  
  @js.native
  sealed trait schema
    extends StObject
       with ValidationMessageSubTypes
  /* "schema" */ val schema: typings.htmlValidator.mod.ValidationMessageSubTypes.schema & String = js.native
  
  @js.native
  sealed trait warning
    extends StObject
       with ValidationMessageSubTypes
  /* "warning" */ val warning: typings.htmlValidator.mod.ValidationMessageSubTypes.warning & String = js.native
}
