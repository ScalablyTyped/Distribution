package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxParamParser extends js.Object {
  def parse(paramString: java.lang.String): js.Any
  def test(xhr: stdLib.XMLHttpRequest): scala.Boolean
}

object JasmineAjaxParamParser {
  @scala.inline
  def apply(parse: java.lang.String => js.Any, test: stdLib.XMLHttpRequest => scala.Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
}

