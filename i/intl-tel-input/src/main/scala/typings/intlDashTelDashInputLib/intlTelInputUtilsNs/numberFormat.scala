package typings
package intlDashTelDashInputLib.intlTelInputUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberFormat extends js.Object

@JSGlobal("intlTelInputUtils.numberFormat")
@js.native
object numberFormat extends js.Object {
  @js.native
  sealed trait E164
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat
  
  @js.native
  sealed trait INTERNATIONAL
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat
  
  @js.native
  sealed trait NATIONAL
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat
  
  @js.native
  sealed trait RFC3966
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat
  
  /* 0 */ val E164: E164 with scala.Double = js.native
  /* 1 */ val INTERNATIONAL: INTERNATIONAL with scala.Double = js.native
  /* 2 */ val NATIONAL: NATIONAL with scala.Double = js.native
  /* 3 */ val RFC3966: RFC3966 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat with scala.Double] = js.native
}

