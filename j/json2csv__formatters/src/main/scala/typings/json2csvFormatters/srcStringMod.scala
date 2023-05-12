package typings.json2csvFormatters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStringMod {
  
  @JSImport("@json2csv/formatters/src/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* value */ String, String]]
  inline def default(opts: Options): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String, String]]
  
  trait Options extends StObject {
    
    var escapedQuote: js.UndefOr[String] = js.undefined
    
    var quote: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEscapedQuote(value: String): Self = StObject.set(x, "escapedQuote", value.asInstanceOf[js.Any])
      
      inline def setEscapedQuoteUndefined: Self = StObject.set(x, "escapedQuote", js.undefined)
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    }
  }
}
