package typings.json5

import typings.json5.mod.JSONReplacer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Quote extends StObject {
    
    var quote: js.UndefOr[String] = js.native
    
    var replacer: js.UndefOr[JSONReplacer] = js.native
    
    var space: js.UndefOr[Double | String] = js.native
  }
  object Quote {
    
    @scala.inline
    def apply(): Quote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quote]
    }
    
    @scala.inline
    implicit class QuoteMutableBuilder[Self <: Quote] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any | (js.Array[Double | String]) | Null): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
