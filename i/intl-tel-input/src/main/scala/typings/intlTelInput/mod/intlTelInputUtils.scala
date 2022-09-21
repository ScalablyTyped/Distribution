package typings.intlTelInput.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlTelInputUtils {
  
  @js.native
  sealed trait numberFormat extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.numberFormat")
  @js.native
  object numberFormat extends StObject {
    
    @js.native
    sealed trait E164
      extends StObject
         with numberFormat
    
    @js.native
    sealed trait INTERNATIONAL
      extends StObject
         with numberFormat
    
    @js.native
    sealed trait NATIONAL
      extends StObject
         with numberFormat
    
    @js.native
    sealed trait RFC3966
      extends StObject
         with numberFormat
  }
  
  @js.native
  sealed trait numberType extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.numberType")
  @js.native
  object numberType extends StObject {
    
    @js.native
    sealed trait FIXED_LINE
      extends StObject
         with numberType
    
    @js.native
    sealed trait FIXED_LINE_OR_MOBILE
      extends StObject
         with numberType
    
    @js.native
    sealed trait MOBILE
      extends StObject
         with numberType
    
    @js.native
    sealed trait PAGER
      extends StObject
         with numberType
    
    @js.native
    sealed trait PERSONAL_NUMBER
      extends StObject
         with numberType
    
    @js.native
    sealed trait PREMIUM_RATE
      extends StObject
         with numberType
    
    @js.native
    sealed trait SHARED_COST
      extends StObject
         with numberType
    
    @js.native
    sealed trait TOLL_FREE
      extends StObject
         with numberType
    
    @js.native
    sealed trait UAN
      extends StObject
         with numberType
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with numberType
    
    @js.native
    sealed trait VOICEMAIL
      extends StObject
         with numberType
    
    @js.native
    sealed trait VOIP
      extends StObject
         with numberType
  }
  
  @js.native
  sealed trait validationError extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.validationError")
  @js.native
  object validationError extends StObject {
    
    @js.native
    sealed trait INVALID_COUNTRY_CODE
      extends StObject
         with validationError
    
    @js.native
    sealed trait IS_POSSIBLE
      extends StObject
         with validationError
    
    @js.native
    sealed trait NOT_A_NUMBER
      extends StObject
         with validationError
    
    @js.native
    sealed trait TOO_LONG
      extends StObject
         with validationError
    
    @js.native
    sealed trait TOO_SHORT
      extends StObject
         with validationError
  }
}
