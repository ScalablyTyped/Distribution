package typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberFormat extends js.Object

@JSGlobal("intlTelInputUtils.numberFormat")
@js.native
object numberFormat extends js.Object {
  @js.native
  sealed trait E164 extends numberFormat
  
  @js.native
  sealed trait INTERNATIONAL extends numberFormat
  
  @js.native
  sealed trait NATIONAL extends numberFormat
  
  @js.native
  sealed trait RFC3966 extends numberFormat
  
  /* 0 */ val E164: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberFormat.E164 with Double = js.native
  /* 1 */ val INTERNATIONAL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberFormat.INTERNATIONAL with Double = js.native
  /* 2 */ val NATIONAL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberFormat.NATIONAL with Double = js.native
  /* 3 */ val RFC3966: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberFormat.RFC3966 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[numberFormat with Double] = js.native
}

