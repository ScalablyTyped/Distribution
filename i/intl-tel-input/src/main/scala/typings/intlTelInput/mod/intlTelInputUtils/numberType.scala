package typings.intlTelInput.mod.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberType extends js.Object

@JSImport("intl-tel-input", "intlTelInputUtils.numberType")
@js.native
object numberType extends js.Object {
  @js.native
  sealed trait FIXED_LINE extends numberType
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE extends numberType
  
  @js.native
  sealed trait MOBILE extends numberType
  
  @js.native
  sealed trait PAGER extends numberType
  
  @js.native
  sealed trait PERSONAL_NUMBER extends numberType
  
  @js.native
  sealed trait PREMIUM_RATE extends numberType
  
  @js.native
  sealed trait SHARED_COST extends numberType
  
  @js.native
  sealed trait TOLL_FREE extends numberType
  
  @js.native
  sealed trait UAN extends numberType
  
  @js.native
  sealed trait UNKNOWN extends numberType
  
  @js.native
  sealed trait VOICEMAIL extends numberType
  
  @js.native
  sealed trait VOIP extends numberType
  
}

