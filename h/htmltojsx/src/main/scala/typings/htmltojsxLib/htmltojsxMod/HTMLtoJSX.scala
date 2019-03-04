package typings
package htmltojsxLib.htmltojsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLtoJSX extends js.Object {
  def convert(html: java.lang.String): java.lang.String
}

object HTMLtoJSX {
  @scala.inline
  def apply(convert: js.Function1[java.lang.String, java.lang.String]): HTMLtoJSX = {
    val __obj = js.Dynamic.literal(convert = convert)
  
    __obj.asInstanceOf[HTMLtoJSX]
  }
}

