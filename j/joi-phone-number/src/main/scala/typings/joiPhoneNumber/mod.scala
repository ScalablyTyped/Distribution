package typings.joiPhoneNumber

import typings.joi.mod.Extension
import typings.joi.mod.Reference
import typings.joi.mod.Root
import typings.joi.mod.StringSchema
import typings.joiPhoneNumber.joiPhoneNumberStrings.e164
import typings.joiPhoneNumber.joiPhoneNumberStrings.international
import typings.joiPhoneNumber.joiPhoneNumberStrings.national
import typings.joiPhoneNumber.joiPhoneNumberStrings.rfc3966
import typings.joiPhoneNumber.joiPhoneNumberStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(joi: Root): StringExtension = ^.asInstanceOf[js.Dynamic].apply(joi.asInstanceOf[js.Any]).asInstanceOf[StringExtension]
  
  @JSImport("joi-phone-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StringExtension
    extends StObject
       with Extension {
    
    @JSName("base")
    var base_StringExtension: StringSchema[String]
    
    @JSName("type")
    var type_StringExtension: string
  }
  object StringExtension {
    
    inline def apply(base: StringSchema[String]): StringExtension = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[StringExtension]
    }
    
    extension [Self <: StringExtension](x: Self) {
      
      inline def setBase(value: StringSchema[String]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object joiAugmentingMod {
    
    trait PhoneNumberOptions extends StObject {
      
      var defaultCountry: js.UndefOr[js.Array[String] | String | Reference] = js.undefined
      
      var format: js.UndefOr[e164 | international | national | rfc3966 | Reference] = js.undefined
      
      var strict: js.UndefOr[Boolean | Reference] = js.undefined
    }
    object PhoneNumberOptions {
      
      inline def apply(): PhoneNumberOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhoneNumberOptions]
      }
      
      extension [Self <: PhoneNumberOptions](x: Self) {
        
        inline def setDefaultCountry(value: js.Array[String] | String | Reference): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
        
        inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
        
        inline def setDefaultCountryVarargs(value: String*): Self = StObject.set(x, "defaultCountry", js.Array(value*))
        
        inline def setFormat(value: e164 | international | national | rfc3966 | Reference): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setStrict(value: Boolean | Reference): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
    
    @js.native
    trait StringSchema extends StObject {
      
      def phoneNumber(): this.type = js.native
      def phoneNumber(options: PhoneNumberOptions): this.type = js.native
    }
  }
}
