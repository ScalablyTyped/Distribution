package typings.i18next.mod

import typings.i18next.anon.InterpolationOptionskeyst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  def add(
    name: String,
    fc: js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]
  ): Unit
  
  def format(value: Any): String
  def format(value: Any, format: String): String
  def format(value: Any, format: String, lng: String): String
  def format(value: Any, format: String, lng: String, options: InterpolationOptionskeyst): String
  def format(value: Any, format: String, lng: Unit, options: InterpolationOptionskeyst): String
  def format(value: Any, format: Unit, lng: String): String
  def format(value: Any, format: Unit, lng: String, options: InterpolationOptionskeyst): String
  def format(value: Any, format: Unit, lng: Unit, options: InterpolationOptionskeyst): String
  @JSName("format")
  var format_Original: FormatFunction
  
  def init(services: Services, i18nextOptions: InitOptions): Unit
}
object Formatter {
  
  inline def apply(
    add: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => Unit,
    format: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptionskeyst]) => String,
    init: (Services, InitOptions) => Unit
  ): Formatter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), format = js.Any.fromFunction4(format), init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setAdd(
      value: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => Unit
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setFormat(
      value: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptionskeyst]) => String
    ): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
    
    inline def setInit(value: (Services, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
  }
}
