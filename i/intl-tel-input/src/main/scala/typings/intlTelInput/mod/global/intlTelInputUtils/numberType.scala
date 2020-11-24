package typings.intlTelInput.mod.global.intlTelInputUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait numberType extends js.Object
@JSGlobal("intlTelInputUtils.numberType")
@js.native
object numberType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[numberType with Double] = js.native
  
  @js.native
  sealed trait FIXED_LINE extends numberType
  /* 0 */ @js.native
  object FIXED_LINE extends TopLevel[FIXED_LINE with Double]
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE extends numberType
  /* 2 */ @js.native
  object FIXED_LINE_OR_MOBILE extends TopLevel[FIXED_LINE_OR_MOBILE with Double]
  
  @js.native
  sealed trait MOBILE extends numberType
  /* 1 */ @js.native
  object MOBILE extends TopLevel[MOBILE with Double]
  
  @js.native
  sealed trait PAGER extends numberType
  /* 8 */ @js.native
  object PAGER extends TopLevel[PAGER with Double]
  
  @js.native
  sealed trait PERSONAL_NUMBER extends numberType
  /* 7 */ @js.native
  object PERSONAL_NUMBER extends TopLevel[PERSONAL_NUMBER with Double]
  
  @js.native
  sealed trait PREMIUM_RATE extends numberType
  /* 4 */ @js.native
  object PREMIUM_RATE extends TopLevel[PREMIUM_RATE with Double]
  
  @js.native
  sealed trait SHARED_COST extends numberType
  /* 5 */ @js.native
  object SHARED_COST extends TopLevel[SHARED_COST with Double]
  
  @js.native
  sealed trait TOLL_FREE extends numberType
  /* 3 */ @js.native
  object TOLL_FREE extends TopLevel[TOLL_FREE with Double]
  
  @js.native
  sealed trait UAN extends numberType
  /* 9 */ @js.native
  object UAN extends TopLevel[UAN with Double]
  
  @js.native
  sealed trait UNKNOWN extends numberType
  /* -1 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  @js.native
  sealed trait VOICEMAIL extends numberType
  /* 10 */ @js.native
  object VOICEMAIL extends TopLevel[VOICEMAIL with Double]
  
  @js.native
  sealed trait VOIP extends numberType
  /* 6 */ @js.native
  object VOIP extends TopLevel[VOIP with Double]
}
