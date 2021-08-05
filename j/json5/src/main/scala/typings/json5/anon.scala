package typings.json5

import typings.json5.mod.JSONReplacer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quote extends StObject {
    
    var quote: js.UndefOr[String] = js.undefined
    
    var replacer: js.UndefOr[JSONReplacer] = js.undefined
    
    var space: js.UndefOr[Double | String] = js.undefined
  }
  object Quote {
    
    inline def apply(): Quote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quote]
    }
    
    extension [Self <: Quote](x: Self) {
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any | (js.Array[Double | String]) | Null): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
