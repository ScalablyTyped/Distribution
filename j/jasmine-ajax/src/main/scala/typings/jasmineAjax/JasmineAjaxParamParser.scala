package typings.jasmineAjax

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxParamParser extends js.Object {
  def parse(paramString: String): js.Any
  def test(xhr: XMLHttpRequest): Boolean
}

object JasmineAjaxParamParser {
  @scala.inline
  def apply(parse: String => js.Any, test: XMLHttpRequest => Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
}

