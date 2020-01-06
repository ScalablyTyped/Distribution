package typings.atMaterialDashUiCore

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NodeValue extends js.Object {
  var node: HTMLInputElement = js.native
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
}

object Anon_NodeValue {
  @scala.inline
  def apply(node: HTMLInputElement, value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Anon_NodeValue = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NodeValue]
  }
}

