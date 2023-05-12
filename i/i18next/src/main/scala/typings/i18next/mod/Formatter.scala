package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  def add(
    name: String,
    fc: js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]
  ): Unit
  
  def addCached(
    name: String,
    fc: js.Function2[
      /* lng */ js.UndefOr[String], 
      /* options */ Any, 
      js.Function1[/* value */ Any, String]
    ]
  ): Unit
  
  def format(value: Any): String
  def format(value: Any, format: String): String
  def format(value: Any, format: String, lng: String): String
  def format(value: Any, format: String, lng: String, options: InterpolationOptions & StringMap): String
  def format(value: Any, format: String, lng: Unit, options: InterpolationOptions & StringMap): String
  def format(value: Any, format: Unit, lng: String): String
  def format(value: Any, format: Unit, lng: String, options: InterpolationOptions & StringMap): String
  def format(value: Any, format: Unit, lng: Unit, options: InterpolationOptions & StringMap): String
  @JSName("format")
  var format_Original: FormatFunction
  
  def init(services: Services, i18nextOptions: InitOptions[js.Object]): Unit
}
object Formatter {
  
  inline def apply(
    add: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => Unit,
    addCached: (String, js.Function2[
      /* lng */ js.UndefOr[String], 
      /* options */ Any, 
      js.Function1[/* value */ Any, String]
    ]) => Unit,
    format: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptions & StringMap]) => String,
    init: (Services, InitOptions[js.Object]) => Unit
  ): Formatter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addCached = js.Any.fromFunction2(addCached), format = js.Any.fromFunction4(format), init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
    
    inline def setAdd(
      value: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => Unit
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddCached(
      value: (String, js.Function2[
          /* lng */ js.UndefOr[String], 
          /* options */ Any, 
          js.Function1[/* value */ Any, String]
        ]) => Unit
    ): Self = StObject.set(x, "addCached", js.Any.fromFunction2(value))
    
    inline def setFormat(
      value: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptions & StringMap]) => String
    ): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
    
    inline def setInit(value: (Services, InitOptions[js.Object]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
  }
}
