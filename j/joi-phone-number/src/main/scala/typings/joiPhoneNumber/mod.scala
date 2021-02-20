package typings.joiPhoneNumber

import typings.joi.mod.AnySchema
import typings.joiPhoneNumber.joiPhoneNumberStrings.e164
import typings.joiPhoneNumber.joiPhoneNumberStrings.international
import typings.joiPhoneNumber.joiPhoneNumberStrings.national
import typings.joiPhoneNumber.joiPhoneNumberStrings.rfc3966
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait PhoneNumberOptions extends StObject {
    
    var defaultCountry: js.UndefOr[js.Array[String] | String] = js.native
    
    var format: js.UndefOr[e164 | international | national | rfc3966] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object PhoneNumberOptions {
    
    @scala.inline
    def apply(): PhoneNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberOptions]
    }
    
    @scala.inline
    implicit class PhoneNumberOptionsMutableBuilder[Self <: PhoneNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCountry(value: js.Array[String] | String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      @scala.inline
      def setDefaultCountryVarargs(value: String*): Self = StObject.set(x, "defaultCountry", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: e164 | international | national | rfc3966): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait StringSchema extends AnySchema {
    
    def phoneNumber(): this.type = js.native
    def phoneNumber(options: PhoneNumberOptions): this.type = js.native
  }
}
