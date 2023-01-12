package typings.i18next.mod

import typings.i18next.i18nextStrings.formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatterModule
  extends StObject
     with Module
     with Formatter {
  
  @JSName("type")
  var type_FormatterModule: formatter
}
object FormatterModule {
  
  inline def apply(
    add: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => Unit,
    addCached: (String, js.Function2[
      /* lng */ js.UndefOr[String], 
      /* options */ Any, 
      js.Function1[/* value */ Any, String]
    ]) => Unit,
    format: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptions & StringMap]) => String,
    init: (Services, InitOptions) => Unit
  ): FormatterModule = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addCached = js.Any.fromFunction2(addCached), format = js.Any.fromFunction4(format), init = js.Any.fromFunction2(init))
    __obj.updateDynamic("type")("formatter")
    __obj.asInstanceOf[FormatterModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatterModule] (val x: Self) extends AnyVal {
    
    inline def setType(value: formatter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
