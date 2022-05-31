package typings.intlTelInput

import typings.intlTelInput.mod.Options
import typings.intlTelInput.mod.Plugin
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object intlTelInput {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    inline def apply(node: Element): Plugin = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[Plugin]
    inline def apply(node: Element, options: Options): Plugin = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugin]
    
    @JSGlobal("intlTelInput")
    @js.native
    val ^ : js.Any = js.native
    
    object global {
      
      object intlTelInputUtils {
        
        @JSGlobal("intlTelInputUtils.numberFormat")
        @js.native
        object numberFormat extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat & Double] = js.native
          
          /* 0 */ val E164: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.E164 & Double = js.native
          
          /* 1 */ val INTERNATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.INTERNATIONAL & Double = js.native
          
          /* 2 */ val NATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.NATIONAL & Double = js.native
          
          /* 3 */ val RFC3966: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.RFC3966 & Double = js.native
        }
        
        @JSGlobal("intlTelInputUtils.numberType")
        @js.native
        object numberType extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.global.intlTelInputUtils.numberType & Double] = js.native
          
          /* 0 */ val FIXED_LINE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE & Double = js.native
          
          /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE & Double = js.native
          
          /* 1 */ val MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.MOBILE & Double = js.native
          
          /* 8 */ val PAGER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PAGER & Double = js.native
          
          /* 7 */ val PERSONAL_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PERSONAL_NUMBER & Double = js.native
          
          /* 4 */ val PREMIUM_RATE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PREMIUM_RATE & Double = js.native
          
          /* 5 */ val SHARED_COST: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.SHARED_COST & Double = js.native
          
          /* 3 */ val TOLL_FREE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.TOLL_FREE & Double = js.native
          
          /* 9 */ val UAN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UAN & Double = js.native
          
          /* -1 */ val UNKNOWN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UNKNOWN & Double = js.native
          
          /* 10 */ val VOICEMAIL: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOICEMAIL & Double = js.native
          
          /* 6 */ val VOIP: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOIP & Double = js.native
        }
        
        @JSGlobal("intlTelInputUtils.validationError")
        @js.native
        object validationError extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.global.intlTelInputUtils.validationError & Double] = js.native
          
          /* 1 */ val INVALID_COUNTRY_CODE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE & Double = js.native
          
          /* 0 */ val IS_POSSIBLE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.IS_POSSIBLE & Double = js.native
          
          /* 4 */ val NOT_A_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.NOT_A_NUMBER & Double = js.native
          
          /* 3 */ val TOO_LONG: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_LONG & Double = js.native
          
          /* 2 */ val TOO_SHORT: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_SHORT & Double = js.native
        }
      }
    }
    
    object intlTelInputUtils {
      
      @JSGlobal("intlTelInput.intlTelInputUtils.numberFormat")
      @js.native
      object numberFormat extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.intlTelInputUtils.numberFormat & Double] = js.native
        
        /* 0 */ val E164: typings.intlTelInput.mod.intlTelInputUtils.numberFormat.E164 & Double = js.native
        
        /* 1 */ val INTERNATIONAL: typings.intlTelInput.mod.intlTelInputUtils.numberFormat.INTERNATIONAL & Double = js.native
        
        /* 2 */ val NATIONAL: typings.intlTelInput.mod.intlTelInputUtils.numberFormat.NATIONAL & Double = js.native
        
        /* 3 */ val RFC3966: typings.intlTelInput.mod.intlTelInputUtils.numberFormat.RFC3966 & Double = js.native
      }
      
      @JSGlobal("intlTelInput.intlTelInputUtils.numberType")
      @js.native
      object numberType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.intlTelInputUtils.numberType & Double] = js.native
        
        /* 0 */ val FIXED_LINE: typings.intlTelInput.mod.intlTelInputUtils.numberType.FIXED_LINE & Double = js.native
        
        /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlTelInput.mod.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE & Double = js.native
        
        /* 1 */ val MOBILE: typings.intlTelInput.mod.intlTelInputUtils.numberType.MOBILE & Double = js.native
        
        /* 8 */ val PAGER: typings.intlTelInput.mod.intlTelInputUtils.numberType.PAGER & Double = js.native
        
        /* 7 */ val PERSONAL_NUMBER: typings.intlTelInput.mod.intlTelInputUtils.numberType.PERSONAL_NUMBER & Double = js.native
        
        /* 4 */ val PREMIUM_RATE: typings.intlTelInput.mod.intlTelInputUtils.numberType.PREMIUM_RATE & Double = js.native
        
        /* 5 */ val SHARED_COST: typings.intlTelInput.mod.intlTelInputUtils.numberType.SHARED_COST & Double = js.native
        
        /* 3 */ val TOLL_FREE: typings.intlTelInput.mod.intlTelInputUtils.numberType.TOLL_FREE & Double = js.native
        
        /* 9 */ val UAN: typings.intlTelInput.mod.intlTelInputUtils.numberType.UAN & Double = js.native
        
        /* -1 */ val UNKNOWN: typings.intlTelInput.mod.intlTelInputUtils.numberType.UNKNOWN & Double = js.native
        
        /* 10 */ val VOICEMAIL: typings.intlTelInput.mod.intlTelInputUtils.numberType.VOICEMAIL & Double = js.native
        
        /* 6 */ val VOIP: typings.intlTelInput.mod.intlTelInputUtils.numberType.VOIP & Double = js.native
      }
      
      @JSGlobal("intlTelInput.intlTelInputUtils.validationError")
      @js.native
      object validationError extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.intlTelInput.mod.intlTelInputUtils.validationError & Double] = js.native
        
        /* 1 */ val INVALID_COUNTRY_CODE: typings.intlTelInput.mod.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE & Double = js.native
        
        /* 0 */ val IS_POSSIBLE: typings.intlTelInput.mod.intlTelInputUtils.validationError.IS_POSSIBLE & Double = js.native
        
        /* 4 */ val NOT_A_NUMBER: typings.intlTelInput.mod.intlTelInputUtils.validationError.NOT_A_NUMBER & Double = js.native
        
        /* 3 */ val TOO_LONG: typings.intlTelInput.mod.intlTelInputUtils.validationError.TOO_LONG & Double = js.native
        
        /* 2 */ val TOO_SHORT: typings.intlTelInput.mod.intlTelInputUtils.validationError.TOO_SHORT & Double = js.native
      }
    }
  }
}
