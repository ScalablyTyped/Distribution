package typings.htmltojsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLtoJSX extends js.Object {
  def convert(html: String): String
}

object HTMLtoJSX {
  @scala.inline
  def apply(convert: String => String): HTMLtoJSX = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
  
    __obj.asInstanceOf[HTMLtoJSX]
  }
}

