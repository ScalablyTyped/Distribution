package typings.htmltojsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLtoJSX extends js.Object {
  def convert(html: String): String = js.native
}

object HTMLtoJSX {
  @scala.inline
  def apply(convert: String => String): HTMLtoJSX = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[HTMLtoJSX]
  }
  @scala.inline
  implicit class HTMLtoJSXOps[Self <: HTMLtoJSX] (val x: Self) extends AnyVal {
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
    def setConvert(value: String => String): Self = this.set("convert", js.Any.fromFunction1(value))
  }
  
}

