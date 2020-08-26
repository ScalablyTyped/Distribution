package typings.jasmineAjax

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxParamParser extends js.Object {
  def parse(paramString: String): js.Any = js.native
  def test(xhr: XMLHttpRequest): Boolean = js.native
}

object JasmineAjaxParamParser {
  @scala.inline
  def apply(parse: String => js.Any, test: XMLHttpRequest => Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
  @scala.inline
  implicit class JasmineAjaxParamParserOps[Self <: JasmineAjaxParamParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParse(value: String => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setTest(value: XMLHttpRequest => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
  
}

