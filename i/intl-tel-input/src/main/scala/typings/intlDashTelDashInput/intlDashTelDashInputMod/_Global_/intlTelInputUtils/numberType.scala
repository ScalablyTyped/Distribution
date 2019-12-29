package typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberType extends js.Object

@JSGlobal("intlTelInputUtils.numberType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[numberType with Double] = js.native
  /* 0 */ @js.native
  object FIXED_LINE extends TopLevel[FIXED_LINE with Double]
  
  /* 2 */ @js.native
  object FIXED_LINE_OR_MOBILE extends TopLevel[FIXED_LINE_OR_MOBILE with Double]
  
  /* 1 */ @js.native
  object MOBILE extends TopLevel[MOBILE with Double]
  
  /* 8 */ @js.native
  object PAGER extends TopLevel[PAGER with Double]
  
  /* 7 */ @js.native
  object PERSONAL_NUMBER extends TopLevel[PERSONAL_NUMBER with Double]
  
  /* 4 */ @js.native
  object PREMIUM_RATE extends TopLevel[PREMIUM_RATE with Double]
  
  /* 5 */ @js.native
  object SHARED_COST extends TopLevel[SHARED_COST with Double]
  
  /* 3 */ @js.native
  object TOLL_FREE extends TopLevel[TOLL_FREE with Double]
  
  /* 9 */ @js.native
  object UAN extends TopLevel[UAN with Double]
  
  /* -1 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 10 */ @js.native
  object VOICEMAIL extends TopLevel[VOICEMAIL with Double]
  
  /* 6 */ @js.native
  object VOIP extends TopLevel[VOIP with Double]
  
}

