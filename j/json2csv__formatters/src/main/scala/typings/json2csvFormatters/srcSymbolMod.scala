package typings.json2csvFormatters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSymbolMod {
  
  @JSImport("@json2csv/formatters/src/symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* value */ js.Symbol, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* value */ js.Symbol, String]]
  inline def default(opts: Options): js.Function1[/* value */ js.Symbol, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ js.Symbol, String]]
  
  trait Options extends StObject {
    
    var stringFormatter: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStringFormatter(value: /* value */ String => String): Self = StObject.set(x, "stringFormatter", js.Any.fromFunction1(value))
      
      inline def setStringFormatterUndefined: Self = StObject.set(x, "stringFormatter", js.undefined)
    }
  }
}
