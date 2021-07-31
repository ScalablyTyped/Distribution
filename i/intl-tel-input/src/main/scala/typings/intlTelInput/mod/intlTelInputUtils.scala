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
  
  trait CountryData extends StObject {
    
    var dialCode: String
    
    var iso2: String
    
    var name: String
  }
  object CountryData {
    
    @scala.inline
    def apply(dialCode: String, iso2: String, name: String): CountryData = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryData]
    }
    
    @scala.inline
    implicit class CountryDataMutableBuilder[Self <: CountryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE
    - typings.intlTelInput.intlTelInputStrings.FIXED_LINE
    - typings.intlTelInput.intlTelInputStrings.MOBILE
    - typings.intlTelInput.intlTelInputStrings.PAGER
    - typings.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER
    - typings.intlTelInput.intlTelInputStrings.PREMIUM_RATE
    - typings.intlTelInput.intlTelInputStrings.SHARED_COST
    - typings.intlTelInput.intlTelInputStrings.TOLL_FREE
    - typings.intlTelInput.intlTelInputStrings.UAN
    - typings.intlTelInput.intlTelInputStrings.UNKNOWN
    - typings.intlTelInput.intlTelInputStrings.VOICEMAIL
    - typings.intlTelInput.intlTelInputStrings.VOIP
  */
  trait placeholderNumberType extends StObject
  object placeholderNumberType {
    
    @scala.inline
    def FIXED_LINE: typings.intlTelInput.intlTelInputStrings.FIXED_LINE = "FIXED_LINE".asInstanceOf[typings.intlTelInput.intlTelInputStrings.FIXED_LINE]
    
    @scala.inline
    def FIXED_LINE_OR_MOBILE: typings.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE = "FIXED_LINE_OR_MOBILE".asInstanceOf[typings.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE]
    
    @scala.inline
    def MOBILE: typings.intlTelInput.intlTelInputStrings.MOBILE = "MOBILE".asInstanceOf[typings.intlTelInput.intlTelInputStrings.MOBILE]
    
    @scala.inline
    def PAGER: typings.intlTelInput.intlTelInputStrings.PAGER = "PAGER".asInstanceOf[typings.intlTelInput.intlTelInputStrings.PAGER]
    
    @scala.inline
    def PERSONAL_NUMBER: typings.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER = "PERSONAL_NUMBER".asInstanceOf[typings.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER]
    
    @scala.inline
    def PREMIUM_RATE: typings.intlTelInput.intlTelInputStrings.PREMIUM_RATE = "PREMIUM_RATE".asInstanceOf[typings.intlTelInput.intlTelInputStrings.PREMIUM_RATE]
    
    @scala.inline
    def SHARED_COST: typings.intlTelInput.intlTelInputStrings.SHARED_COST = "SHARED_COST".asInstanceOf[typings.intlTelInput.intlTelInputStrings.SHARED_COST]
    
    @scala.inline
    def TOLL_FREE: typings.intlTelInput.intlTelInputStrings.TOLL_FREE = "TOLL_FREE".asInstanceOf[typings.intlTelInput.intlTelInputStrings.TOLL_FREE]
    
    @scala.inline
    def UAN: typings.intlTelInput.intlTelInputStrings.UAN = "UAN".asInstanceOf[typings.intlTelInput.intlTelInputStrings.UAN]
    
    @scala.inline
    def UNKNOWN: typings.intlTelInput.intlTelInputStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.intlTelInput.intlTelInputStrings.UNKNOWN]
    
    @scala.inline
    def VOICEMAIL: typings.intlTelInput.intlTelInputStrings.VOICEMAIL = "VOICEMAIL".asInstanceOf[typings.intlTelInput.intlTelInputStrings.VOICEMAIL]
    
    @scala.inline
    def VOIP: typings.intlTelInput.intlTelInputStrings.VOIP = "VOIP".asInstanceOf[typings.intlTelInput.intlTelInputStrings.VOIP]
  }
}
