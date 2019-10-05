package typings.intlDashTelDashInput.intlDashTelDashInputMod.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberFormat extends js.Object

@JSImport("intl-tel-input", "intlTelInputUtils.numberFormat")
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
  
}

