package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def argsToArray(args: js.Any): js.Any = js.native
  def extend(destination: js.Any, source: js.Any): js.Any = js.native
  def formatException(e: js.Any): js.Any = js.native
  def htmlEscape(str: String): String = js.native
  def inherit(childClass: js.Function, parentClass: js.Function): js.Any = js.native
}

object Util {
  @scala.inline
  def apply(
    argsToArray: js.Any => js.Any,
    extend: (js.Any, js.Any) => js.Any,
    formatException: js.Any => js.Any,
    htmlEscape: String => String,
    inherit: (js.Function, js.Function) => js.Any
  ): Util = {
    val __obj = js.Dynamic.literal(argsToArray = js.Any.fromFunction1(argsToArray), extend = js.Any.fromFunction2(extend), formatException = js.Any.fromFunction1(formatException), htmlEscape = js.Any.fromFunction1(htmlEscape), inherit = js.Any.fromFunction2(inherit))
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
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
    def setArgsToArray(value: js.Any => js.Any): Self = this.set("argsToArray", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: (js.Any, js.Any) => js.Any): Self = this.set("extend", js.Any.fromFunction2(value))
    @scala.inline
    def setFormatException(value: js.Any => js.Any): Self = this.set("formatException", js.Any.fromFunction1(value))
    @scala.inline
    def setHtmlEscape(value: String => String): Self = this.set("htmlEscape", js.Any.fromFunction1(value))
    @scala.inline
    def setInherit(value: (js.Function, js.Function) => js.Any): Self = this.set("inherit", js.Any.fromFunction2(value))
  }
  
}

