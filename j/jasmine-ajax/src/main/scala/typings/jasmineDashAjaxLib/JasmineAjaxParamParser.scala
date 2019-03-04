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
  def apply(
    parse: js.Function1[java.lang.String, js.Any],
    test: js.Function1[stdLib.XMLHttpRequest, scala.Boolean]
  ): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = parse, test = test)
  
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
}

