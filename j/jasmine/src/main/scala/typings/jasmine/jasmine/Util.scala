package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Util extends StObject {
  
  def argsToArray(args: js.Any): js.Any
  
  def extend(destination: js.Any, source: js.Any): js.Any
  
  def formatException(e: js.Any): js.Any
  
  def htmlEscape(str: String): String
  
  def inherit(childClass: js.Function, parentClass: js.Function): js.Any
}
object Util {
  
  inline def apply(
    argsToArray: js.Any => js.Any,
    extend: (js.Any, js.Any) => js.Any,
    formatException: js.Any => js.Any,
    htmlEscape: String => String,
    inherit: (js.Function, js.Function) => js.Any
  ): Util = {
    val __obj = js.Dynamic.literal(argsToArray = js.Any.fromFunction1(argsToArray), extend = js.Any.fromFunction2(extend), formatException = js.Any.fromFunction1(formatException), htmlEscape = js.Any.fromFunction1(htmlEscape), inherit = js.Any.fromFunction2(inherit))
    __obj.asInstanceOf[Util]
  }
  
  extension [Self <: Util](x: Self) {
    
    inline def setArgsToArray(value: js.Any => js.Any): Self = StObject.set(x, "argsToArray", js.Any.fromFunction1(value))
    
    inline def setExtend(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    inline def setFormatException(value: js.Any => js.Any): Self = StObject.set(x, "formatException", js.Any.fromFunction1(value))
    
    inline def setHtmlEscape(value: String => String): Self = StObject.set(x, "htmlEscape", js.Any.fromFunction1(value))
    
    inline def setInherit(value: (js.Function, js.Function) => js.Any): Self = StObject.set(x, "inherit", js.Any.fromFunction2(value))
  }
}
