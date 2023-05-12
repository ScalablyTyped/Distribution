package typings.json2csvFormatters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectMod {
  
  @JSImport("@json2csv/formatters/src/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* value */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* value */ Any, String]]
  inline def default(opts: Options): js.Function1[/* value */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, String]]
  
  trait Options extends StObject {
    
    /**
      * The string formatter to use.
      * Defaults to the builtin string formatter
      */
    var stringFormatter: js.UndefOr[js.Function1[/* value */ Any, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStringFormatter(value: /* value */ Any => String): Self = StObject.set(x, "stringFormatter", js.Any.fromFunction1(value))
      
      inline def setStringFormatterUndefined: Self = StObject.set(x, "stringFormatter", js.undefined)
    }
  }
}
