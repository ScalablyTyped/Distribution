package typings.intlTelInput.mod.global.intlTelInputUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait numberFormat extends js.Object
@JSGlobal("intlTelInputUtils.numberFormat")
@js.native
object numberFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[numberFormat with Double] = js.native
  
  @js.native
  sealed trait E164 extends numberFormat
  /* 0 */ @js.native
  object E164 extends TopLevel[E164 with Double]
  
  @js.native
  sealed trait INTERNATIONAL extends numberFormat
  /* 1 */ @js.native
  object INTERNATIONAL extends TopLevel[INTERNATIONAL with Double]
  
  @js.native
  sealed trait NATIONAL extends numberFormat
  /* 2 */ @js.native
  object NATIONAL extends TopLevel[NATIONAL with Double]
  
  @js.native
  sealed trait RFC3966 extends numberFormat
  /* 3 */ @js.native
  object RFC3966 extends TopLevel[RFC3966 with Double]
}
