package typings.intlTelInput.mod.global.intlTelInputUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait validationError extends js.Object
@JSGlobal("intlTelInputUtils.validationError")
@js.native
object validationError extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[validationError with Double] = js.native
  
  @js.native
  sealed trait INVALID_COUNTRY_CODE extends validationError
  /* 1 */ @js.native
  object INVALID_COUNTRY_CODE extends TopLevel[INVALID_COUNTRY_CODE with Double]
  
  @js.native
  sealed trait IS_POSSIBLE extends validationError
  /* 0 */ @js.native
  object IS_POSSIBLE extends TopLevel[IS_POSSIBLE with Double]
  
  @js.native
  sealed trait NOT_A_NUMBER extends validationError
  /* 4 */ @js.native
  object NOT_A_NUMBER extends TopLevel[NOT_A_NUMBER with Double]
  
  @js.native
  sealed trait TOO_LONG extends validationError
  /* 3 */ @js.native
  object TOO_LONG extends TopLevel[TOO_LONG with Double]
  
  @js.native
  sealed trait TOO_SHORT extends validationError
  /* 2 */ @js.native
  object TOO_SHORT extends TopLevel[TOO_SHORT with Double]
}
