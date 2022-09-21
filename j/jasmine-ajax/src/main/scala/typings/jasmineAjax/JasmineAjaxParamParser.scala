package typings.jasmineAjax

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineAjaxParamParser extends StObject {
  
  def parse(paramString: String): Any
  
  def test(xhr: XMLHttpRequest): Boolean
}
object JasmineAjaxParamParser {
  
  inline def apply(parse: String => Any, test: XMLHttpRequest => Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
  
  extension [Self <: JasmineAjaxParamParser](x: Self) {
    
    inline def setParse(value: String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setTest(value: XMLHttpRequest => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
