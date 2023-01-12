package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Json {
  
  /**
    * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
    */
  trait StringifyArguments extends StObject {
    
    /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
    var escape: js.UndefOr[Boolean] = js.undefined
    
    /** the replacer function or array. Defaults to no action. */
    var replacer: js.UndefOr[StringifyReplacer] = js.undefined
    
    /** number of spaces to indent nested object keys. Defaults to no indentation. */
    var space: js.UndefOr[StringifySpace] = js.undefined
    
    /* string suffix added after conversion to JSON string. Defaults to no suffix. */
    var suffix: js.UndefOr[String] = js.undefined
  }
  object StringifyArguments {
    
    inline def apply(): StringifyArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyArguments] (val x: Self) extends AnyVal {
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setReplacer(value: StringifyReplacer): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerFunction2(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: (String | Double)*): Self = StObject.set(x, "replacer", js.Array(value*))
      
      inline def setSpace(value: StringifySpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  /**
    * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
    */
  type StringifyReplacer = js.UndefOr[
    (js.Function2[/* key */ String, /* value */ Any, Any]) | (js.Array[String | Double])
  ]
  
  /**
    * Any value greater than 10 is truncated.
    */
  type StringifySpace = Double | String
}
