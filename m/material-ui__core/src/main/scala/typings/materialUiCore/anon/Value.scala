package typings.materialUiCore.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var node: HTMLInputElement = js.native
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
}

object Value {
  @scala.inline
  def apply(node: HTMLInputElement, value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Value = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

