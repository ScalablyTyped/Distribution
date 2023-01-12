package typings.jsonStringifyPrettyCompact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Indent extends StObject {
    
    var indent: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var replacer: js.UndefOr[
        (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[Double | String])
      ] = js.undefined
  }
  object Indent {
    
    inline def apply(): Indent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      inline def setIndent(value: Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setReplacer(
        value: (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[Double | String])
      ): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value*))
    }
  }
}
